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
public class DAOProduto {

    String mensagem = "";

    public List<Produto> listarProduto() {
        List<Produto> lista = new ArrayList();
        String sql = "select * from produto";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Produto objProduto = new Produto();
                objProduto.setCodProduto(rs.getInt("codProduto"));
                objProduto.setNomeProduto(rs.getString("nomeProduto"));
                objProduto.setQuantidadeProduto(rs.getInt("quantidadeProduto"));
                objProduto.setCodigoBarras(rs.getString("codigoBarras"));
                objProduto.setValor(rs.getDouble("valor"));
                lista.add(objProduto);
            }

        } catch (SQLException erro) {
            System.out.println("Erro no listarProduto do DaoProduto" + erro);
        }
        return lista;
    }

    public String inserir(Produto obj) {
        String sql = "insert into produto (nomeProduto, quantidadeProduto, codigoBarras, valor) values(?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeProduto());
            pst.setInt(2, obj.getQuantidadeProduto());
            pst.setString(3, obj.getCodigoBarras());
            pst.setDouble(4, obj.getValor());
            if (pst.executeUpdate() > 0) {
                mensagem = "Produto cadastrado com sucesso!";
            } else {
                mensagem = "Produto não cadastrado!";
            }
            pst.close();
        } catch (SQLException ex) {
            mensagem = "Erro no SQL no incluir do DAOProduto" + ex.getMessage() + "\nComando SQL=" + sql;

        }
        return mensagem;
    }

    public String alterar(Produto obj) {
        String sql = "update produto set nomeProduto=?, quantidadeProduto=?, codigoBarras=?, valor=? where codProduto=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeProduto());
            pst.setInt(2, obj.getQuantidadeProduto());
            pst.setString(3, obj.getCodigoBarras());
            pst.setDouble(4, obj.getValor());
            pst.setInt(5, obj.getCodProduto());
            if (pst.executeUpdate() > 0) {
                mensagem = "Produto alterado com sucesso!";
            } else {
                mensagem = "Produto não alterarado!";
            }
            pst.close();
        } catch (SQLException ex) {
            mensagem = "Erro no SQL no alterar do DAOProduto" + ex.getMessage() + "\nComando SQL=" + sql;

        }
        return mensagem;

    }

    public String excluir(Produto obj) {
        String sql = "delete from produto where codProduto=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodProduto());
            if (pst.executeUpdate() > 0) {
                mensagem = "Produto excluido com sucesso!";
            } else {
                mensagem = "Produto não excluido!";
            }
            pst.close();
        } catch (SQLException ex) {
            mensagem = "Erro no SQL no excluir do DAOProduto" + ex.getMessage() + "\nComando SQL=" + sql;

        }
        return mensagem;
    }
}
