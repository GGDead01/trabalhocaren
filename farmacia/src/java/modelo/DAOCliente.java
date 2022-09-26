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
public class DAOCliente {

    String mensagem = "";
    ConverteData converte = new ConverteData();

    public List<Cliente> listarCliente() {
        List<Cliente> lista = new ArrayList();
        String sql = "select * from cliente";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Cliente objCliente = new Cliente();
                objCliente.setCodCliente(rs.getInt("codCliente"));
                objCliente.setNomeCliente(rs.getString("nomeCliente"));
                objCliente.setEnderecoCliente(rs.getString("enderecoCliente"));
                objCliente.setCpfCliente(rs.getString("cpfCliente"));
                objCliente.setRgCliente(rs.getString("rgCliente"));
                objCliente.setDataNascimento(converte.converteCalendario(rs.getDate("dataNascimento")));
                objCliente.setTelefoneCliente(rs.getString("telefoneCliente"));
                lista.add(objCliente);
            }
        } catch (SQLException erro) {
            System.out.println("Erro no listarCliente do DaoCliente" + erro);
        }
        return lista;
    }

    public String inserir(Cliente obj) {
        String sql = "insert into cliente(nomeCliente, enderecoCliente, cpfCliente, rgCliente, dataNascimento, telefoneCliente) values(?,?,?,?,?,?)";
        try {
            try (PreparedStatement pst = Conexao.getPreparedStatement(sql)) {
                pst.setString(1, obj.getNomeCliente());
                pst.setString(2, obj.getEnderecoCliente());
                pst.setString(3, obj.getCpfCliente());
                pst.setString(4, obj.getRgCliente());
                pst.setDate(5, converte.converteBanco(obj.getDataNascimento()));
                pst.setString(6, obj.getTelefoneCliente());
                if (pst.executeUpdate() > 0) {
                    mensagem = "Cliente cadastrado com sucesso!";
                } else {
                    mensagem = "Cliente não cadastrado!";
                }
            }
        } catch (SQLException ex) {
            mensagem = "Erro no SQl no incluir do DAOCliente"
                    + ex.getMessage() + "\nComando SQL" + sql;

        }

        return mensagem;
    }

    public String alterar(Cliente obj) {
        String sql = "update cliente set nomeCliente=?, enderecoCliente=?, cpfCliente=?, rgCliente=?, dataNascimento=?, telefoneCliente=? where codCliente=?";
        try {
            try (PreparedStatement pst = Conexao.getPreparedStatement(sql)) {
                pst.setString(1, obj.getNomeCliente());
                pst.setString(2, obj.getEnderecoCliente());
                pst.setString(3, obj.getCpfCliente());
                pst.setString(4, obj.getRgCliente());
                pst.setDate(5, converte.converteBanco(obj.getDataNascimento()));
                pst.setString(6, obj.getTelefoneCliente());
                pst.setInt(7, obj.getCodCliente());
                if (pst.executeUpdate() > 0) {
                    mensagem = "Cliente alterado com sucesso!";
                } else {
                    mensagem = "Cliente não alterado!";
                }
            }
        } catch (SQLException ex) {
            mensagem = "Erro no SQl no alterar do DAOCliente"
                    + ex.getMessage() + "\nComando SQL" + sql;

        }

        return mensagem;
    }

    public String excluir(Cliente obj) {
        String sql = "delete from cliente where codCliente=?";
        try {
            try (PreparedStatement pst = Conexao.getPreparedStatement(sql)) {
                pst.setInt(1, obj.getCodCliente());
                if (pst.executeUpdate() > 0) {
                    mensagem = "Cliente excluido com sucesso!";
                } else {
                    mensagem = "Cliente não excluido!";
                }
            }
        } catch (SQLException ex) {
            mensagem = "Erro no SQl no excluir do DAOCliente"
                    + ex.getMessage() + "\nComando SQL" + sql;

        }

        return mensagem;
    }

    public Cliente localizar(Integer id) {
        String sql = "select * from cliente where codCliente=?";
        Cliente obj = new Cliente();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            {
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    obj.setCodCliente(rs.getInt("codCliente"));
                    obj.setNomeCliente(rs.getString("nomeCliente"));
                    obj.setEnderecoCliente(rs.getString("enderecoCliente"));
                    obj.setCpfCliente(rs.getString("cpfCliente"));
                    obj.setRgCliente(rs.getString("rgCliente"));

                    return obj;
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro no SQl no método" + "localizar do DAOCliente" + e.getMessage());
        }
        return null;
    }
}
