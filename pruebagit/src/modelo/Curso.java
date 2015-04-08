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
public class Curso {   
  private String nombre;
  private String sigla;
  private String creditos;

    public Curso(String nombre, String sigla, String creditos) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.creditos = creditos;
    }

    public Curso() {
        this.nombre = "";
        this.sigla = "";
        this.creditos = "";
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }
    
    
    
  
}
