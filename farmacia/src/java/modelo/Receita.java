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
public class Receita {
    private Integer codReceita;
    private String crm;
    private Calendar data;

    public Integer getCodReceita() {
        return codReceita;
    }

    public void setCodReceita(Integer codReceita) {
        this.codReceita = codReceita;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    } 
}
