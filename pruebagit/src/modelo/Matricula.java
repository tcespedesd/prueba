/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author tatianacd
 */
public class Matricula {
    
    private String sigla;
    private String carne;
    private String fecha;

    public Matricula(String sigla, String carne, String fecha) {
        this.sigla = sigla;
        this.carne = carne;
        this.fecha = fecha;
    }

    public Matricula() {
        sigla = "";
        carne = "";
        fecha = "";
        
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }   

    @Override
    public String toString() {
        return "Matricula{" + "sigla=" + sigla + ", carne=" + carne + ", fecha=" + fecha + '}';
    }    
}



