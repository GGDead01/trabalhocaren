/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOFuncionario {
    
    String mensagem = "";

    public List<Funcionario> listarFuncionario() {
        List<Funcionario> lista = new ArrayList();
        String sql = "select * from funcionario";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Funcionario objFuncionario = new Funcionario();
                objFuncionario.setCodFuncionario(rs.getInt("codFuncionario"));
                objFuncionario.setNomeFuncionario(rs.getString("nomeFuncionario"));
                objFuncionario.setEnderecoFuncionario(rs.getString("enderecoFuncionario"));
                objFuncionario.setCpfFuncionario(rs.getString("cpfFuncionario"));
                objFuncionario.setRgFuncionario(rs.getString("rgFuncionario"));
                objFuncionario.setTelefoneFuncionario(rs.getString("telefoneFuncionario"));
                objFuncionario.setSalario(rs.getDouble("salario"));
                objFuncionario.setCargaHoraria(rs.getInt("cargaHoraria"));
                lista.add(objFuncionario);
            }
        } catch (SQLException erro) {
            System.out.println("Erro no listarFuncionario do DaoFuncionario" + erro);
        }
        return lista;
    }

    public String inserir(Funcionario obj) {
        String sql = "insert into funcionario (nomeFuncionario, enderecoFuncionario, cpfFuncionario, rgFuncionario, telefoneFuncionario, salario, cargaHoraria) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeFuncionario());
            pst.setString(2, obj.getEnderecoFuncionario());
            pst.setString(3, obj.getCpfFuncionario());
            pst.setString(4, obj.getRgFuncionario());
            pst.setString(5, obj.getTelefoneFuncionario());
            pst.setDouble(6, obj.getSalario());
            pst.setInt(7, obj.getCargaHoraria());

            if (pst.executeUpdate() > 0) {
                mensagem = "Funcionario cadastrado com sucesso!";
            } else {
                mensagem = "Funcionario não cadastrado!";
            }
            pst.close();
        } catch (SQLException ex) {
            mensagem = "Erro no SQL no incluir do DAOFuncionario" + ex.getMessage() + "\nComando SQL=" + sql;
        }
        return mensagem;
    }

    public String alterar(Funcionario obj) {
        String sql = "update funcionario set nomeFuncionario=?, enderecoFuncionario=?, cpfFuncionario=?, rgFuncionario=?, telefoneFuncionario=?, salario=?, cargaHoraria=? where codFuncionario=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeFuncionario());
            pst.setString(2, obj.getEnderecoFuncionario());
            pst.setString(3, obj.getCpfFuncionario());
            pst.setString(4, obj.getRgFuncionario());
            pst.setString(5, obj.getTelefoneFuncionario());
            pst.setDouble(6, obj.getSalario());
            pst.setInt(7, obj.getCargaHoraria());
            pst.setInt(8, obj.getCodFuncionario());
            if (pst.executeUpdate() > 0) {
                mensagem = "Funcionario alterado com sucesso!";
            } else {
                mensagem = "Funcionario não alterarado!";
            }
            pst.close();
        } catch (SQLException ex) {
            mensagem = "Erro no SQL no alterar do DAOFuncionario" + ex.getMessage() + "\nComando SQL=" + sql;
        }
        return mensagem;
    }

    public String excluir(Funcionario obj) {
        String sql = "delete from funcionario where codFuncionario=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodFuncionario());
            if (pst.executeUpdate() > 0) {
                mensagem = "Funcionario excluido com sucesso!";
            } else {
                mensagem = "Funcionario não excluido!";
            }
            pst.close();
        } catch (SQLException ex) {
            mensagem = "Erro no SQL no excluir do DAOFuncionario" + ex.getMessage() + "\nComando SQL=" + sql;
        }
        return mensagem;
    }
}
