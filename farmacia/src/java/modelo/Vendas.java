/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author 15091673660
 */
public class Vendas {
    private Integer codVendas;
    private Calendar dataVenda;
    private String endereco;
    private String entrega;

    public Integer getCodVendas() {
        return codVendas;
    }

    public void setCodVendas(Integer codVendas) {
        this.codVendas = codVendas;
    }

    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }   
}
