/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;

/**
 *
 * @author tatianacd
 */
public class ManejadorRetroceso extends Manejador{
    
    private JFrame frame;

    public ManejadorRetroceso(JFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equalsIgnoreCase("atras")) {
            frame.dispose();
        }
    }    
}
