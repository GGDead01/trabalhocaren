/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 15091673660
 */
public class ItensVendas {
    private Integer codItensVendas;
    private Double valorProduto;
    private Integer quantidadeProduto;

    public Integer getCodItensVendas() {
        return codItensVendas;
    }

    public void setCodItensVendas(Integer codItensVendas) {
        this.codItensVendas = codItensVendas;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
}
