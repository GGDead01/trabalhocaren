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
public class Ponto {
    private Integer codPonto;
    private Calendar horarioEntrada;
    private Calendar horarioSaida;

    public Integer getCodPonto() {
        return codPonto;
    }

    public void setCodPonto(Integer codPonto) {
        this.codPonto = codPonto;
    }

    public Calendar getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(Calendar horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public Calendar getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(Calendar horarioSaida) {
        this.horarioSaida = horarioSaida;
    } 
}
