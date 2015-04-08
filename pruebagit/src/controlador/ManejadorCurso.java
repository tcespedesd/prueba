/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Curso;
import java.awt.event.ActionEvent;
import modelo.RegistroCurso;
import vista.GUICurso;
import vista.PanelAlumno;
import vista.PanelBotones;
import vista.PanelCurso;

/**
 *
 * @author tatianacd
 */
public class ManejadorCurso extends Manejador {

    private PanelCurso panelCurso;
    private RegistroCurso registroCurso;
    private PanelBotones panelBotones;
    private GUICurso guiCurso;

    public ManejadorCurso(PanelCurso panelCurso, RegistroCurso registroCurso, PanelBotones panelBotones, GUICurso gUICurso) {
        this.panelCurso = panelCurso;
        this.registroCurso = registroCurso;
        this.panelBotones = panelBotones;
        this.guiCurso = gUICurso;

        panelBotones.setDisponible(false);
        panelCurso.setEditable(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equalsIgnoreCase(PanelBotones.COMMAND_AGREGAR)) {
            if (panelCurso.getTxtSigla().equals("")) {
                PanelAlumno.mensaje("Ingrese la sigla");
            } else if (panelCurso.getTxtNombre().equals("")) {
                PanelAlumno.mensaje("Ingrese el Nombre");
            } else if (panelCurso.getTxtCreditos().equals("0.0")) {
                PanelAlumno.mensaje("Ingrese los créditos");
            } else if (registroCurso.getCurso(panelCurso.getTxtSigla()) == null) {
                Curso curso = new Curso();
                curso.setSigla(panelCurso.getTxtSigla());
                curso.setNombre(panelCurso.getTxtNombre());
                curso.setCreditos(panelCurso.getTxtCreditos());
                
                registroCurso.agregarCurso(curso);
                PanelAlumno.mensaje("El curso se agregó exitosamente");

                panelCurso.limpiar();
            } else {
                PanelAlumno.mensaje("Curso regisrado anteriormente");
                panelCurso.limpiar();
            }
        }

        if (event.getActionCommand().equalsIgnoreCase(PanelCurso.COMMAND_BUSCAR)) {
            if(panelCurso.getTxtSigla().equals("")) {
                PanelAlumno.mensaje("Ingrese la Sigla");
            } else if(registroCurso.getPosicion(panelCurso.getTxtSigla()) > 0) {
                Curso curso = registroCurso.getCurso(panelCurso.getTxtSigla());
                
                panelCurso.setTxtNombre(curso.getNombre());
                panelCurso.setTxtSigla(curso.getSigla());
                panelCurso.setTxtCreditos(curso.getCreditos());
                
                panelBotones.setDisponible(true);
                panelCurso.setEditable(false);
            } else{
               PanelAlumno.mensaje("No se encuentra registrado");
            }
        }

        if (event.getActionCommand().equalsIgnoreCase(PanelBotones.COMMAND_ELIMINAR)) {
            if (panelCurso.getTxtNombre().equals("")) {
                PanelAlumno.mensaje("Ingrese el nombre");
            } else if (panelCurso.getTxtSigla().equals("")) {
                PanelAlumno.mensaje("Ingrese la Sigla");
            } else if (panelCurso.getTxtCreditos().equals("")) {
                PanelAlumno.mensaje("Ingrese la creditos");
            } else if (registroCurso.getCurso(panelCurso.getTxtSigla()) != null) {
                registroCurso.eliminarCurso(panelCurso.getTxtSigla());
                PanelAlumno.mensaje("Curso eliminado exitosamente");
                panelCurso.limpiar();
                
                panelBotones.setDisponible(false);
                panelCurso.setEditable(true);
            } else {
                PanelAlumno.mensaje("Curso no registrado");
                panelCurso.limpiar();
            }
        }

        if (event.getActionCommand().equalsIgnoreCase(PanelBotones.COMMAND_MODIFICAR)) {
            if (panelCurso.getTxtNombre().equals("")) {
                PanelAlumno.mensaje("Ingrese el nombre");
            } else if (panelCurso.getTxtSigla().equals("")) {
                PanelAlumno.mensaje("Ingrese la Sigla");
            } else if (panelCurso.getTxtCreditos().equals("")) {
                PanelAlumno.mensaje("Ingrese la creditos");
            } else if (registroCurso.getCurso(panelCurso.getTxtSigla()) != null) {
                Curso curso = registroCurso.getCurso(panelCurso.getTxtSigla());
                registroCurso.modificarCurso(curso);
                PanelAlumno.mensaje("Curso modificado");
                panelCurso.limpiar();
                
                panelBotones.setDisponible(false);
                panelCurso.setEditable(true);
            } else {
                PanelAlumno.mensaje("Curso no registrado");
                panelCurso.limpiar();
            }
        }
        
        if (event.getActionCommand().equalsIgnoreCase(PanelBotones.COMMAND_LIMPIAR)) {
            panelCurso.limpiar();
            panelBotones.setDisponible(false);
            panelCurso.setEditable(true);
        }
        if (event.getActionCommand().equalsIgnoreCase(PanelBotones.COMMAND_SALIR)) {
            guiCurso.dispose();
        }
    }//Fin A.P
}
