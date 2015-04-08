/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Manejador;
import javax.swing.JButton;

/**
 *
 * @author tatianacd
 */
public class PanelBotones extends javax.swing.JPanel {
    private Manejador manejador;

    /**
     * Creates new form BotonesAlumno
     */
    public PanelBotones() {
        initComponents();
    }
    
    public void addManejador(Manejador manejador){
        this.manejador = manejador;
        
        btnEliminar.addActionListener(manejador);
        btnAgregar.addActionListener(manejador);
        btnLimpiar.addActionListener(manejador);
        btnSalir.addActionListener(manejador);
        btnModificar.addActionListener(manejador);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnAgregar.setToolTipText("Agregar");
        btnAgregar.setActionCommand("agregar");
        btnAgregar.setMaximumSize(new java.awt.Dimension(50, 50));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar");
        btnModificar.setActionCommand("modificar");
        btnModificar.setEnabled(false);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.setActionCommand("eliminar");
        btnEliminar.setEnabled(false);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnLimpiar.setToolTipText("Limpiar");
        btnLimpiar.setActionCommand("limpiar");

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setActionCommand("salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAgregar, btnEliminar, btnLimpiar, btnModificar, btnSalir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpiar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAgregar, btnEliminar, btnLimpiar, btnModificar, btnSalir});

    }// </editor-fold>//GEN-END:initComponents

    public final static String COMMAND_AGREGAR = "agregar";
    public final static String COMMAND_ELIMINAR = "eliminar";    
    public final static String COMMAND_LIMPIAR = "limpiar";
    public final static String COMMAND_MODIFICAR = "modificar";
    public final static String COMMAND_SALIR = "salir";    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables

    public void setDisponible(boolean estado){
        this.btnModificar.setEnabled(estado);
        this.btnEliminar.setEnabled(estado);
        this.btnAgregar.setEnabled(!estado);
    }
    public void setDisponibleLimpiar(boolean estado){
        this.btnLimpiar.setEnabled(estado);
    }
    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }
    
    

}
