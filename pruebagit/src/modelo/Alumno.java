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
public class Alumno {

    private String nombre;
    private String carne;

    public Alumno(String nombre, String carne) {
        this.nombre = nombre;
        this.carne = carne;
    }

    public Alumno() {
        nombre = "";
        carne = "";

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

}

//private ManejadorAlumno manejadorAlumno

//        manejadorAlumno = new ManejadorAlumno(registroAlumno, );
//        panelBotones1.addManejador(manejadorAlumno);
        //panelAlumno.addManejador(manejadorAlumno);
