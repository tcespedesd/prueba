/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Alumno;
import java.awt.event.ActionEvent;
import modelo.RegistroAlumno;
import vista.GUIAlumno;
import vista.PanelAlumno;
import vista.PanelBotones;

/**
 *
 * @author tatianacd
 */
public class ManejadorAlumno extends Manejador {

    private RegistroAlumno registroAlumno;
    private PanelAlumno panelAlumno;
    private PanelBotones panelBotones;
    private GUIAlumno guiAlumno;

    public ManejadorAlumno(RegistroAlumno registroAlumno, PanelAlumno panelAlumno, PanelBotones panelBotones, GUIAlumno guiAlumno) {
        this.registroAlumno = registroAlumno;
        this.panelAlumno = panelAlumno;
        this.panelBotones = panelBotones;
        this.guiAlumno = guiAlumno;

        panelAlumno.setEditable(true);
        panelBotones.setDisponible(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getActionCommand().equalsIgnoreCase(PanelBotones.COMMAND_AGREGAR)) {
            if (panelAlumno.getTxtCarne().equals("")) {
                PanelAlumno.mensaje("Ingrese el carne");
            } else if (panelAlumno.getTxtNombre().equals("")) {
                PanelAlumno.mensaje("Ingrese el Nombre");
            } else {
                Alumno alumno = new Alumno();
                alumno.setCarne(panelAlumno.getTxtCarne());
                alumno.setNombre(panelAlumno.getTxtNombre());
                registroAlumno.agregarAlumno(alumno);
                panelAlumno.limpiar();
                PanelAlumno.mensaje("El alumno se agregó exitosamente");
            }
        }

        if (event.getActionCommand().equalsIgnoreCase(PanelBotones.COMMAND_ELIMINAR)) {
            if (panelAlumno.getTxtCarne().equals("")) {
                if (panelAlumno.getTxtCarne().equals("")) {
                    PanelAlumno.mensaje("Ingrese el carne");
                } else if (panelAlumno.getTxtNombre().equals("")) {
                    PanelAlumno.mensaje("Ingrese el Nombre");
                }
            } else {
                if (registroAlumno.getAlumno(panelAlumno.getTxtCarne()) != null) {
                    registroAlumno.eliminarAlumno(panelAlumno.getTxtCarne());
                    PanelAlumno.mensaje("Alumn@ eliminado exitosamente");
                    panelAlumno.limpiar();
                }
            }
        }

        if (event.getActionCommand().equalsIgnoreCase(PanelAlumno.COMMAND_BUSCAR)) {
            if (panelAlumno.getTxtCarne().equals("")) {
                PanelAlumno.mensaje("Ingrese el carne");
            } else {
                if (registroAlumno.getAlumno(panelAlumno.getTxtCarne()) != null) {
                    Alumno alumno = registroAlumno.getAlumno(panelAlumno.getTxtCarne());
                    panelAlumno.setTxtNombre(alumno.getNombre());
                    panelAlumno.setTxtCarne(alumno.getCarne());
                    panelAlumno.setEditable(false);
                    
                    panelBotones.setDisponible(true);
                    
                } else {
                    PanelAlumno.mensaje("El alumno no existe");
                    panelAlumno.limpiar();
                    panelAlumno.setEditable(true);
                }
            }
        }

        if (event.getActionCommand().equalsIgnoreCase(PanelBotones.COMMAND_MODIFICAR)) {
            if (panelAlumno.getTxtCarne().equals("")) {
                PanelAlumno.mensaje("Ingrese el carne");
            } else if (panelAlumno.getTxtNombre().equals("")) {
                PanelAlumno.mensaje("Ingrese el Nombre");
            } else {
                if (registroAlumno.getAlumno(panelAlumno.getTxtCarne()) != null) {
                    panelAlumno.setEditable(false);
                    Alumno alumno = registroAlumno.getAlumno(panelAlumno.getTxtCarne());
                    registroAlumno.modificarAlumno(alumno);
                }
            }
        }
        
         if (event.getActionCommand().equalsIgnoreCase(PanelBotones.COMMAND_LIMPIAR)) {
             panelAlumno.limpiar();
         }
        
        if (event.getActionCommand().equalsIgnoreCase(PanelBotones.COMMAND_SALIR)) {
            guiAlumno.dispose();
        }
    }

}
