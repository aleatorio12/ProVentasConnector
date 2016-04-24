/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pixhan.proventas.vista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import net.pixhan.negocio.DatosClases;
import net.pixhan.negocio.UtilNegocio;
import net.pixhan.utilidades.ValidacionCadenas;

/**
 *
 * @author Baloo
 */
public class JFAddClaseSecundaria extends javax.swing.JFrame {

    private ValidacionCadenas validacion = new ValidacionCadenas();
    private static final int TAMANIO_MAX_CLASEPRIMARIA_CLASESECUNDARIA = 3;
    private static final int TAMANIO_MAX_NOMBREDEAREA_CLASESECUNDARIA = 30;
    private static final int TAMANIO_MAX_DESCRIPCION_CLASESECUNDARIA = 45;
    
    /**
     * Creates new form JFAddClaseSecundaria
     */
    public JFAddClaseSecundaria() {
        initComponents();
        validacion.limitarCaracteres(txtNombreArea, this.TAMANIO_MAX_NOMBREDEAREA_CLASESECUNDARIA);
        validacion.limitarCaracteres(txtDescripcion, this.TAMANIO_MAX_DESCRIPCION_CLASESECUNDARIA);
        //validacion.validarSoloNumeros(cbClaseprimaria, this.TAMANIO_MAX_CLASEPRIMARIA_CLASESECUNDARIA);
        validacion.validarSoloLetras(txtDescripcion);
        validacion.validarSoloLetras(txtNombreArea);
        rellenarClases();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAdd_Clase_Secundario = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNombreArea = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        cbClaseprimaria = new javax.swing.JComboBox<DatosClases>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Clase Primaria:");

        jLabel2.setText("Nombre De Area:");

        jLabel3.setText("Descripción:");

        btnAdd_Clase_Secundario.setText("Añadir Clase Secundaria");
        btnAdd_Clase_Secundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_Clase_SecundarioActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtNombreArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAreaActionPerformed(evt);
            }
        });

        cbClaseprimaria.setMaximumRowCount(15);
        cbClaseprimaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClaseprimariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd_Clase_Secundario)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbClaseprimaria, 0, 130, Short.MAX_VALUE)
                            .addComponent(txtNombreArea)
                            .addComponent(txtDescripcion))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbClaseprimaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd_Clase_Secundario)
                    .addComponent(btnCancelar))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAreaActionPerformed

    private void cbClaseprimariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClaseprimariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClaseprimariaActionPerformed

    private void btnAdd_Clase_SecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_Clase_SecundarioActionPerformed
        // TODO add your handling code here:
        DatosClases datosClaseSeleccionada = (DatosClases) this.cbClaseprimaria.getSelectedItem();
        int idClasePrimaria = datosClaseSeleccionada.getIdClase();
        boolean existeError = true;
        try {
            existeError = UtilNegocio.agregarClaseSecundaria( idClasePrimaria, this.txtNombreArea.getText(), this.txtDescripcion.getText(), null);
            if ( existeError == true ){
                System.out.println("Ha ocurrido un error");
            }
            else{
                System.out.println("Sin errores");
            }
               
                
        } catch (SQLException ex) {
            Logger.getLogger(JFAddClaseSecundaria.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAdd_Clase_SecundarioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void rellenarClases(){
        this.cbClaseprimaria.removeAllItems();
        //Implementacion de lo demás del código
        this.cbClaseprimaria.addItem(null);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFAddClaseSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAddClaseSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAddClaseSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAddClaseSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAddClaseSecundaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd_Clase_Secundario;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<DatosClases> cbClaseprimaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombreArea;
    // End of variables declaration//GEN-END:variables
}
