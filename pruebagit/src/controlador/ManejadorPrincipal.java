/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import modelo.RegistroAlumno;
import modelo.RegistroCurso;
import modelo.RegistroMatricula;
import vista.GUIAlumno;
import vista.GUIConsulta;
import vista.GUICurso;
import vista.GUIMatricula;
import vista.GUIReporte;

/**
 *
 * @author tatianacd
 */
public class ManejadorPrincipal extends Manejador{
    
    private RegistroMatricula registroMatricula;
    private RegistroAlumno registroAlumno;
    private RegistroCurso registroCurso;
    
    public ManejadorPrincipal(RegistroAlumno registroAlumno, RegistroCurso registroCurso, RegistroMatricula registroMatricula){
        
        this.registroAlumno = registroAlumno;
        this.registroCurso = registroCurso;
        this.registroMatricula = registroMatricula;
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(evento.getActionCommand().equalsIgnoreCase("Alumno")){
            new GUIAlumno(registroAlumno).setVisible(true);
        }

        if(evento.getActionCommand().equalsIgnoreCase("Matricular")){
            new GUIMatricula(registroCurso, registroAlumno, registroMatricula).setVisible(true);
        }
        
        if(evento.getActionCommand().equalsIgnoreCase("Curso")){
            new GUICurso(registroCurso).setVisible(true);
        }
        
        if(evento.getActionCommand().equalsIgnoreCase("Todos los cursos")){
            new GUIConsulta(registroCurso).setVisible(true);
        }
        
        if(evento.getActionCommand().equalsIgnoreCase("Ver Matricula")){
            new GUIReporte(registroAlumno, registroMatricula).setVisible(true);
        }
        
        if(evento.getActionCommand().equalsIgnoreCase("Salir")){
            System.exit(0);
        }
    }
    
}
