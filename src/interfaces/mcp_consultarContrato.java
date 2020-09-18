/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import codigo.Funciones;
import conexion.Procedimientos;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author valer
 */
public class mcp_consultarContrato extends javax.swing.JFrame {

    static ResultSet res;
    private boolean vald;
    /**
     * Creates new form mcp_consultarContrato
     */
    Funciones fu = new Funciones();

    public mcp_consultarContrato(int valor) {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//cuando se cierra la ventana se acabe el programa
        //this.setLocation(500,100); //posición inicial de la ventana. Pongo lo que yo quiero
        this.setLocationRelativeTo(null);
        inicializar(valor);
        vald = false;
    }

    public void cargarArticulo(String consulta) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        res = conexion.Conexion.consulta(consulta);
        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getString(6));
                v.add(res.getString(7));

                modelo.addRow(v);
                jTable1.setModel(modelo);
            }
        } catch (SQLException e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTF_buscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Buscar = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jRFecha = new javax.swing.JRadioButton();
        jRRUC = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        mcp_jTB_regresar = new javax.swing.JToggleButton();
        mcp_jTB_registrarPago = new javax.swing.JToggleButton();
        Anular = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jL_selecContrato = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTF_buscar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTF_buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTF_buscarFocusLost(evt);
            }
        });
        jTF_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_buscarActionPerformed(evt);
            }
        });
        jTF_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTF_buscarKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Consultar contrato por:");

        Buscar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarKeyReleased(evt);
            }
        });

        jRFecha.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRFecha.setText("Fecha");
        jRFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRFechaActionPerformed(evt);
            }
        });

        jRRUC.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jRRUC.setText("RUC cliente");
        jRRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRRUCActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText(" aaaa/mm/dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRRUC)
                .addGap(18, 18, 18)
                .addComponent(jRFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRFecha)
                    .addComponent(jRRUC)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTF_buscar)
                .addGap(7, 7, 7)
                .addComponent(Buscar)
                .addGap(22, 22, 22))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 168, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar)))
        );

        jCheckBox1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jCheckBox1.setText("Ordenar por fecha de registro");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        mcp_jTB_regresar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mcp_jTB_regresar.setText("Regresar");
        mcp_jTB_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcp_jTB_regresarActionPerformed(evt);
            }
        });

        mcp_jTB_registrarPago.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mcp_jTB_registrarPago.setText("Registrar pago");
        mcp_jTB_registrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcp_jTB_registrarPagoActionPerformed(evt);
            }
        });

        Anular.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Anular.setText("Anular");
        Anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnularActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Fecha realizaición", "Costo Mensual", "Duración meses", "RUC", "Nombre Lista", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jL_selecContrato.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jL_selecContrato.setText("Seleccione el contrato que desea anular:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Anular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mcp_jTB_registrarPago)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mcp_jTB_regresar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox1)
                                .addComponent(jL_selecContrato)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jL_selecContrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mcp_jTB_regresar)
                            .addComponent(mcp_jTB_registrarPago)
                            .addComponent(Anular))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void inicializar(int valor) {
        //consultar contrato 1
        //registrar cpago 2
        //anular 3
        switch (valor) {
            case 1:
                setTitle("SIGEB | Consultar Contrato"); //Poner el título
                mcp_jTB_registrarPago.setVisible(false);
                jL_selecContrato.setVisible(false);
                Anular.setVisible(false);
                break;
            case 2:
                setTitle("SIGEB | Registrar Pago"); //Poner el título
                mcp_jTB_registrarPago.setVisible(true);
                jL_selecContrato.setVisible(false);
                Anular.setVisible(false);
                break;
            case 3:
                setTitle("SIGEB | Anular Contrato");
                Anular.setVisible(true);
                mcp_jTB_registrarPago.setVisible(false);
                jL_selecContrato.setVisible(true);
                break;

        }
    }
    private void jRFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRFechaActionPerformed
        this.jRRUC.setSelected(false);
        if (jRFecha.isSelected()) {
            jCheckBox1.setEnabled(false);
            vald = false;
        } else {
            jCheckBox1.setEnabled(true);
            vald = false;
        }

    }//GEN-LAST:event_jRFechaActionPerformed

    private void mcp_jTB_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcp_jTB_regresarActionPerformed
        // TODO add your handling code here:
        menPrinci mp = new menPrinci();
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mcp_jTB_regresarActionPerformed

    private void mcp_jTB_registrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcp_jTB_registrarPagoActionPerformed
        // TODO add your handling code here:
        mcp_registrarPago mrp = new mcp_registrarPago();
        int fila = jTable1.getSelectedRow();
        if (fila != -1) {
            if(jTable1.getModel().getValueAt(fila, 0) != null)
            {    
                String num = jTable1.getModel().getValueAt(fila, 0).toString();
                String valor = jTable1.getModel().getValueAt(fila, 2).toString();
                if (jRFecha.isSelected() || jRRUC.isSelected())
                {    
                    if (!num.isEmpty() ) {
                        mrp.mcp_jTF_numContrato.setText(num);
                        mrp.valor_jtf_mcp.setText(valor);
                        mrp.setVisible(true);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error, ingrese el Ruc o la fecha");
                    }
                }
                else if(jCheckBox1.isSelected())
                {
                    mrp.mcp_jTF_numContrato.setText(num);
                    mrp.valor_jtf_mcp.setText(valor);
                    mrp.setVisible(true);
                    this.setVisible(false);
                }
            }
            else
                JOptionPane.showMessageDialog(null, "Seleccionó una fila vacía");
        } else {
            JOptionPane.showMessageDialog(null, "Error, Seleccione una fila");
        }


    }//GEN-LAST:event_mcp_jTB_registrarPagoActionPerformed

    private void AnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnularActionPerformed
        // TODO add your handling code here:
        int fila = jTable1.getSelectedRow();
        if (fila != -1) {
            if (jTable1.getModel().getValueAt(fila, 0) != null )
            {    
                Procedimientos pr = new Procedimientos();
                if (!jTable1.getModel().getValueAt(fila, 6).toString().equalsIgnoreCase("anulado"))
                {  
                    try {
                        String ruc = jTable1.getModel().getValueAt(fila, 4).toString();
                        String cod = jTable1.getModel().getValueAt(fila, 0).toString();
                        pr.anularContrato(cod, ruc);
                        JOptionPane.showMessageDialog(null, "Contrato anulado de manera satisfactoria");
                    } catch (SQLException ex) {
                        Logger.getLogger(mcp_consultarContrato.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "El contrato no se anuló");
                    }
                    menPrinci mp = new menPrinci();
                    mp.setVisible(true);
                    this.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El contrato ya se encuentra anulado");
                }
            }
            else
                JOptionPane.showMessageDialog(null, "Fila seleccionada vacía");
        } else {
            JOptionPane.showMessageDialog(null, "Error, Seleccione un contrato");
        }
       
    }//GEN-LAST:event_AnularActionPerformed

    private void jTF_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_buscarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTF_buscarActionPerformed

    private void jTF_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTF_buscarFocusLost

    }//GEN-LAST:event_jTF_buscarFocusLost

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        //System.out.println(this.jRRUC.getSelectedIcon().toString());
        String texto = jTF_buscar.getText();
        String consulta = "";
        if (vald) {
            if (!texto.isEmpty()) {
                if (jRRUC.isSelected()) {
                    consulta = "Select * from Contrato where ruc =" + texto;
                    cargarArticulo(consulta);

                } else if (jRFecha.isSelected()) {
                    consulta = "Select * from Contrato where fecha_realizacion ='"+ texto+"'";
                    cargarArticulo(consulta);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, Ingrese el ruc o la fecha");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, Ingresó mal la fecha o el ruc");
        }

    }//GEN-LAST:event_BuscarActionPerformed

    private void jRRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRRUCActionPerformed
        // TODO add your handling code here:
        this.jRFecha.setSelected(false);
        if (jRRUC.isSelected())
            jCheckBox1.setEnabled(false);
        else
            jCheckBox1.setEnabled(true);
    }//GEN-LAST:event_jRRUCActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {

            cargarArticulo(" select * from  contrato order by (fecha_realizacion) desc");
            jTF_buscar.setEnabled(false);
            Buscar.setEnabled(false);
            jRFecha.setEnabled(false);
            jRRUC.setEnabled(false);
        } else {
            jTF_buscar.setEnabled(true);
            Buscar.setEnabled(true);
            jRFecha.setEnabled(true);
            jRRUC.setEnabled(true);

        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTF_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_buscarKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boolean resultado;
            int val = 1;
            if (this.jRRUC.isSelected()) {

                resultado = fu.ValidacionRUC(this.jTF_buscar.getText());
                if (!resultado) {
                    JOptionPane.showMessageDialog(null, "Número de RUC ingresado es incorrecto\n Ingrese nuevamente");
                    this.jTF_buscar.setText("");
                    val = 0;
                }
            } else if (this.jRFecha.isSelected()) {
                resultado = fu.validacionFecha(this.jTF_buscar.getText());
                if (!resultado) {
                    JOptionPane.showMessageDialog(null, "Fecha ingresada es incorrecto\n Ingrese nuevamente");
                    this.jTF_buscar.setText("");
                    val = 0;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione RUC o fecha");
                val = 0;
            }
            if (val == 1) {
                this.vald = true;
                Buscar.requestFocus();
                //Buscar.doClick();
            }
            
            
        }

    }//GEN-LAST:event_jTF_buscarKeyReleased

    private void BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarKeyReleased

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
            java.util.logging.Logger.getLogger(mcp_consultarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mcp_consultarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mcp_consultarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mcp_consultarContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mcp_consultarContrato(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Anular;
    private javax.swing.JToggleButton Buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jL_selecContrato;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRFecha;
    private javax.swing.JRadioButton jRRUC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTF_buscar;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton mcp_jTB_registrarPago;
    private javax.swing.JToggleButton mcp_jTB_regresar;
    // End of variables declaration//GEN-END:variables
}
