/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author tatianacd
 */
public class RegistroMatricula {
 
    private ArrayList<Matricula> matriculas;
    private RegistroCurso registroCurso;
    
    public RegistroMatricula(RegistroCurso registroCurso) {
        matriculas = new ArrayList<>();
        this.registroCurso= registroCurso;
    }

    public int getPosicion(String sigla) {
        for (int i = 0; i <= matriculas.size(); i++) {
            if (matriculas.get(i).getSigla().equalsIgnoreCase(sigla)) {
                return i;
            }
        }
        return -1;
    }

    public void agregarMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }
    
    public Matricula getMatricula(String sigla){
        int index = getPosicion(sigla);
        if(index != -1){
            return matriculas.get(index);
        }
        return null;
    }
    
    public String getCursosEstudiante(String carne){
        String imprimir = "";
        for (Matricula matricula : matriculas) {
            if (matricula.getCarne().equalsIgnoreCase(carne)) {                
                Curso curso = registroCurso.getCurso(matricula.getSigla());
                imprimir += "Siglas: " + curso.getSigla() + " Nombre : " + curso.getNombre() + " Créditos: " + curso.getCreditos() + " Matriculado el: " + matricula.getFecha() + "\n";
            }
        }
        return imprimir;
    }
    
    public int getCreditosMatriculados(String carne){
        int creditos = 0;
        for (Matricula matricula : matriculas) {
            if (matricula.getCarne().equalsIgnoreCase(carne)) {                
                Curso curso = registroCurso.getCurso(matricula.getSigla());
                creditos += Integer.parseInt(curso.getCreditos());
            }
        }
        return creditos;
    }
}
