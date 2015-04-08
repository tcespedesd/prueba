/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.util.Calendar;
import modelo.Matricula;
import modelo.RegistroMatricula;
import vista.GUIMatricula;
import vista.PanelAlumno;
import vista.PanelBotones;
import vista.PanelMatricula;

/**
 *
 * @author tatianacd
 */
public class ManejadorMatricula extends Manejador{
    private PanelMatricula panelMatricula;
    private GUIMatricula guiMatricula;
    private RegistroMatricula registroMatricula;
    private Calendar calendar;

    public ManejadorMatricula(PanelMatricula panelMatricula, GUIMatricula guiMatricula, RegistroMatricula registroMatricula) {
        calendar = Calendar.getInstance();
        this.panelMatricula = panelMatricula;
        this.guiMatricula = guiMatricula;
        this.registroMatricula = registroMatricula;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getActionCommand().equals(PanelBotones.COMMAND_AGREGAR)){
            String carne = (String)panelMatricula.getJcbCarne().getSelectedItem();
            String sigla = (String)panelMatricula.getJcbCarne().getSelectedItem();
                        
            String fecha = String.valueOf(calendar.get(Calendar.DATE)) +"/"
                         + String.valueOf(calendar.get(Calendar.MONTH) + 1) +"/" 
                         + String.valueOf(calendar.get(Calendar.YEAR));
            
            registroMatricula.agregarMatricula(new Matricula(sigla, carne, fecha));
            
            System.out.println(registroMatricula.getMatricula(sigla));
            
            PanelAlumno.mensaje("Se agrego la matricula");
        }
        
        if(evento.getActionCommand().equals(PanelBotones.COMMAND_SALIR)){
            guiMatricula.dispose();
        }
    }
    
    
}
