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
public class RegistroAlumno {

    private ArrayList<Alumno> alumnos;

    public RegistroAlumno() {
        alumnos = new ArrayList<>();

    }

    public int getPosicion(String carne) {
        for (int i = 0; i <= alumnos.size(); i++) {
            if (alumnos.get(i).getCarne().equalsIgnoreCase(carne)) {
                return i;
            }
        }
        return -1;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void eliminarAlumno(String carne) {
        int index = getPosicion(carne);
        if (index != -1) {
            alumnos.remove(index);
        }
    }

    public void modificarAlumno(Alumno alumno) {
        int index = getPosicion(alumno.getCarne());
        if (index != -1) {
            alumnos.set(index, alumno);
        }
    }
    
    public Alumno getAlumno(String carne){
        int index = getPosicion(carne);
        if(index != -1){
            return alumnos.get(index);
        }
        return null;
    }

    public String[] getCarnesArray() {
        String [] carnes;
        if (alumnos.size() > 0) {
            carnes = new String[alumnos.size()];
            for(int i = 0; i < alumnos.size(); i++  ){
                carnes[i] = alumnos.get(i).getCarne();
            }
        } else{
            carnes = new String[1];
            carnes[0] = "No hay alumnos registrados";
        }          
        return carnes;
    }
    
}
