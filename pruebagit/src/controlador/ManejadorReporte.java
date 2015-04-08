/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import modelo.Alumno;
import modelo.RegistroAlumno;
import modelo.RegistroMatricula;
import vista.PanelReporte;

/**
 *
 * @author tatianacd
 */
public class ManejadorReporte extends Manejador{
    
    private PanelReporte panelReporte;
    private RegistroAlumno registroAlumno;
    private RegistroMatricula registroMatricula;

    public ManejadorReporte(PanelReporte panelReporte, RegistroAlumno registroAlumno, RegistroMatricula registroMatricula) {
        this.panelReporte = panelReporte;
        this.registroAlumno = registroAlumno;
        this.registroMatricula = registroMatricula;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getActionCommand().equalsIgnoreCase("buscar")){ 
            if(registroAlumno.getAlumno(panelReporte.getTxtCarne())!= null){
                Alumno alumno = registroAlumno.getAlumno(panelReporte.getTxtCarne());
                panelReporte.setTxtNombre(alumno.getNombre());
                panelReporte.setJtaCursos(registroMatricula.getCursosEstudiante(panelReporte.getTxtCarne()));
                panelReporte.setTxtCreditos(String.valueOf(registroMatricula.getCreditosMatriculados(panelReporte.getTxtCarne())));
            }
        }
    }
    
}
