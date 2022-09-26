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

/**
 *
 * @author 15091673660
 */
public class DAOFornecedor {

    String mensagem = "";

    public List<Fornecedor> listarFornecedor() {
        List<Fornecedor> lista = new ArrayList();
        String sql = "select * from fornecedor";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Fornecedor objFornecedor = new Fornecedor();
                objFornecedor.setCodFornecedor(rs.getInt("codFornecedor"));
                objFornecedor.setNomeFornecedor(rs.getString("nomeFornecedor"));
                objFornecedor.setCnpj(rs.getString("cnpj"));
                objFornecedor.setEndereco(rs.getString("endereco"));
                objFornecedor.setEmail(rs.getString("email"));
                objFornecedor.setTelefone(rs.getString("telefone"));
                lista.add(objFornecedor);
            }
        } catch (SQLException erro) {
            System.out.println("Erro no listarFornecedor do DAOFornecedor" + erro);
        }

        return lista;
    }

    public String inserir(Fornecedor obj) {

        String sql = "insert into fornecedor (nomeFornecedor, cnpj, endereco, email, telefone) values(?,?,?,?,?)";

        try {
            try (PreparedStatement pst = Conexao.getPreparedStatement(sql)) {
                pst.setString(1, obj.getNomeFornecedor());
                pst.setString(2, obj.getCnpj());
                pst.setString(3, obj.getEndereco());
                pst.setString(4, obj.getEmail());
                pst.setString(5, obj.getTelefone());

                if (pst.executeUpdate() > 0) {
                    mensagem = "Fornecedor cadastrado com sucesso!";

                } else {
                    mensagem = "Fornecedor nao cadastrado!";
                }
            }

        } catch (SQLException ex) {
            mensagem = "Erro no SQL no incluir DAOFornecedor"
                    + ex.getMessage() + "\nComando SQL=" + sql;

        }

        return mensagem;
    }

    public String alterar(Fornecedor obj) {
        String sql = "update fornecedor set nomeFornecedor=?,cnpj=?,endereco=?,email=?,telefone=? where codFornecedor=?";
        try {
            try (PreparedStatement pst = Conexao.getPreparedStatement(sql)) {
                pst.setString(1, obj.getNomeFornecedor());
                pst.setString(2, obj.getCnpj());
                pst.setString(3, obj.getEndereco());
                pst.setString(4, obj.getEmail());
                pst.setString(5, obj.getTelefone());
                pst.setInt(6, obj.getCodFornecedor());
                if (pst.executeUpdate() > 0) {
                    mensagem = "Fornecedor alterado com sucesso!";

                } else {
                    mensagem = "Fornecedor nao alterada!";
                }
            }

        } catch (SQLException ex) {
            mensagem = "Erro no SQL no alterar DAOFornecedor"
                    + ex.getMessage() + "\nComando SQL=" + sql;

        }

        return mensagem;
    }

    public String excluir(Fornecedor obj) {
        String sql = "delete from fornecedor where codFornecedor=?";
        try {
            try (PreparedStatement pst = Conexao.getPreparedStatement(sql)) {
                pst.setInt(1, obj.getCodFornecedor());
                if (pst.executeUpdate() > 0) {
                    mensagem = "Fornecedor excluido com sucesso!";
                } else {
                    mensagem = "Fornecedor nao excluido !";
                }
            }

        } catch (SQLException ex) {
            mensagem = "Erro no SQL no excluir DAOFornecedor"
                    + ex.getMessage() + "\nComando SQL=" + sql;

        }

        return mensagem;
    }

}
