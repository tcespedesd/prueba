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
public class RegistroCurso {

    private ArrayList<Curso> cursos;

    public RegistroCurso() {
        cursos = new ArrayList<>();
    }

    public int getPosicion(String sigla) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getSigla().equalsIgnoreCase(sigla)) {
                return i;
            }
        }
        return -1;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void eliminarCurso(String sigla) {
        int index = getPosicion(sigla);
        if(index < -1){
           cursos.remove(index);
        }
    }
    
    public Curso getCurso(String sigla){
        int index = getPosicion(sigla);
        if(index != -1){
            return cursos.get(index);
        }
        return null;
    }
    
    public void modificarCurso(Curso curso){
        int index = getPosicion(curso.getSigla());
            if(index < -1){
               cursos.set(index, curso);
            }
    }
    
    public String imprimirSiglas(){
        String imprimir = "";
        for(int index = 0; index <= cursos.size(); index++ ){
            imprimir += "Sigla" + cursos.get(index).getSigla();
        }
        return imprimir;
    }
    
    public String imprimirCuros(){
        String imprimir = "";
        for(int index = 0; index < cursos.size(); index++){
            imprimir += "Sigla:"+ cursos.get(index).getSigla()+"Nombre: " + cursos.get(index).getNombre() + "Créditos: "+ cursos.get(index).getCreditos()+"\n";
        }
        return imprimir;
    }
    
    public String[] getSiglasArray(){
        String siglasArray[];
        if(cursos.size() > 0){
            siglasArray = new String[cursos.size()];
            for(int index = 0; index < cursos.size(); index++ ){
                siglasArray[index] = cursos.get(index).getSigla();
            }
        } else{
            siglasArray = new String[1];
            siglasArray[0] = "No hay cursos registrados";
        }
        return siglasArray;
    }
    

}
