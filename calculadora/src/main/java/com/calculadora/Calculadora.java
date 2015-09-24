/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadora;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author oscar
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGroupOperaciones = new javax.swing.ButtonGroup();
        jTabbedCalculadora = new javax.swing.JTabbedPane();
        jPanelBotones = new javax.swing.JPanel();
        jTextOp1PB = new javax.swing.JTextField();
        jTextOp2PB = new javax.swing.JTextField();
        jButtonSumar = new javax.swing.JButton();
        jButtonRestar = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jLabelResultadoPB = new javax.swing.JLabel();
        jPanelRadioCheck = new javax.swing.JPanel();
        jTextOp1PR = new javax.swing.JTextField();
        jTextOp2PR = new javax.swing.JTextField();
        jLabelResultadoPR = new javax.swing.JLabel();
        jRadioButtonSumar = new javax.swing.JRadioButton();
        jRadioButtonRestar = new javax.swing.JRadioButton();
        jRadioButtonMultiplicar = new javax.swing.JRadioButton();
        jRadioButtonDividir = new javax.swing.JRadioButton();
        jCheckBoxDecimales = new javax.swing.JCheckBox();
        jButtonCalcular = new javax.swing.JButton();
        jPanelCombo = new javax.swing.JPanel();
        jTextOp1PC = new javax.swing.JTextField();
        jTextOp2PC = new javax.swing.JTextField();
        jComboBoxOperaciones = new javax.swing.JComboBox();
        jLabelResultadoPC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextOp1PB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextOp1PBFocusGained(evt);
            }
        });

        jTextOp2PB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextOp2PBFocusGained(evt);
            }
        });

        jButtonSumar.setText("Sumar");
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });

        jButtonRestar.setText("Restar");
        jButtonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestarActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setText("Multiplicar");
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jButtonDividir.setText("Dividir");
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirActionPerformed(evt);
            }
        });

        jLabelResultadoPB.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextOp2PB, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jTextOp1PB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSumar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jLabelResultadoPB, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jButtonSumar)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBotonesLayout.createSequentialGroup()
                        .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRestar)
                            .addComponent(jTextOp1PB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonMultiplicar)
                            .addComponent(jTextOp2PB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBotonesLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelResultadoPB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonDividir)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jTabbedCalculadora.addTab("Botones", jPanelBotones);

        jTextOp1PR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextOp1PRFocusGained(evt);
            }
        });

        jTextOp2PR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextOp2PRFocusGained(evt);
            }
        });
        jTextOp2PR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOp2PRActionPerformed(evt);
            }
        });

        jLabelResultadoPR.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        btGroupOperaciones.add(jRadioButtonSumar);
        jRadioButtonSumar.setText("Sumar");
        jRadioButtonSumar.setActionCommand(Operaciones.SUMAR.toString());

        btGroupOperaciones.add(jRadioButtonRestar);
        jRadioButtonRestar.setText("Restar");
        jRadioButtonRestar.setActionCommand(Operaciones.RESTAR.toString());

        btGroupOperaciones.add(jRadioButtonMultiplicar);
        jRadioButtonMultiplicar.setText("Multiplicar");
        jRadioButtonMultiplicar.setActionCommand(Operaciones.MULTIPLICAR.toString());

        btGroupOperaciones.add(jRadioButtonDividir);
        jRadioButtonDividir.setText("Dividir");
        jRadioButtonDividir.setActionCommand(Operaciones.DIVIDIR.toString());

        jCheckBoxDecimales.setText("Decimales");

        jButtonCalcular.setText("=");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRadioCheckLayout = new javax.swing.GroupLayout(jPanelRadioCheck);
        jPanelRadioCheck.setLayout(jPanelRadioCheckLayout);
        jPanelRadioCheckLayout.setHorizontalGroup(
            jPanelRadioCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRadioCheckLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jRadioButtonSumar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelRadioCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRadioCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextOp2PR, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jTextOp1PR))
                .addGap(18, 18, 18)
                .addGroup(jPanelRadioCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRadioCheckLayout.createSequentialGroup()
                        .addComponent(jCheckBoxDecimales)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelRadioCheckLayout.createSequentialGroup()
                        .addGroup(jPanelRadioCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonMultiplicar)
                            .addComponent(jRadioButtonDividir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabelResultadoPR, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanelRadioCheckLayout.createSequentialGroup()
                        .addComponent(jRadioButtonRestar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelRadioCheckLayout.setVerticalGroup(
            jPanelRadioCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRadioCheckLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jRadioButtonSumar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRadioCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextOp1PR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonRestar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRadioCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRadioCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextOp2PR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelResultadoPR, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRadioCheckLayout.createSequentialGroup()
                        .addGroup(jPanelRadioCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonMultiplicar)
                            .addComponent(jButtonCalcular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonDividir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxDecimales)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedCalculadora.addTab("Radio/Check", jPanelRadioCheck);

        jTextOp1PC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextOp1PCFocusGained(evt);
            }
        });

        jTextOp2PC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextOp2PCFocusGained(evt);
            }
        });

        jComboBoxOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR" }));
        jComboBoxOperaciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxOperacionesItemStateChanged(evt);
            }
        });

        jLabelResultadoPC.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        javax.swing.GroupLayout jPanelComboLayout = new javax.swing.GroupLayout(jPanelCombo);
        jPanelCombo.setLayout(jPanelComboLayout);
        jPanelComboLayout.setHorizontalGroup(
            jPanelComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComboLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextOp2PC, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jTextOp1PC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelResultadoPC, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanelComboLayout.setVerticalGroup(
            jPanelComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComboLayout.createSequentialGroup()
                .addGroup(jPanelComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelComboLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jComboBoxOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelComboLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanelComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelResultadoPC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelComboLayout.createSequentialGroup()
                                .addComponent(jTextOp1PC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextOp2PC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jTabbedCalculadora.addTab("Combo", jPanelCombo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedCalculadora, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Eventos Panel Botones ">
    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed
        compruebaOperandos(jTextOp1PB, jTextOp2PB, jLabelResultadoPB, Operaciones.SUMAR);
    }//GEN-LAST:event_jButtonSumarActionPerformed

    private void jButtonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestarActionPerformed
        // TODO add your handling code here:
        compruebaOperandos(jTextOp1PB, jTextOp2PB, jLabelResultadoPB, Operaciones.RESTAR);
    }//GEN-LAST:event_jButtonRestarActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
        // TODO add your handling code here:
        compruebaOperandos(jTextOp1PB, jTextOp2PB, jLabelResultadoPB, Operaciones.MULTIPLICAR);
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividirActionPerformed
        // TODO add your handling code here:
        compruebaOperandos(jTextOp1PB, jTextOp2PB, jLabelResultadoPB, Operaciones.DIVIDIR);
    }//GEN-LAST:event_jButtonDividirActionPerformed

    private void jTextOp2PRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOp2PRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextOp2PRActionPerformed

    private void jTextOp2PBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextOp2PBFocusGained
        // TODO add your handling code here:
        ponerBlancaTextField((JTextField) evt.getSource());
    }//GEN-LAST:event_jTextOp2PBFocusGained

    private void jTextOp1PBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextOp1PBFocusGained
        // TODO add your handling code here:
         ponerBlancaTextField((JTextField) evt.getSource());
    }//GEN-LAST:event_jTextOp1PBFocusGained
//</editor-fold>
    
    
    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        // TODO add your handling code here:
               
        compruebaOperandos(jTextOp1PR, jTextOp2PR, jLabelResultadoPR, 
                Operaciones.valueOf(btGroupOperaciones.getSelection().getActionCommand()),
                jCheckBoxDecimales.isSelected());
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jTextOp1PRFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextOp1PRFocusGained
        // TODO add your handling code here:
        ponerBlancaTextField((JTextField) evt.getSource());
    }//GEN-LAST:event_jTextOp1PRFocusGained

    private void jTextOp2PRFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextOp2PRFocusGained
        // TODO add your handling code here:
        ponerBlancaTextField((JTextField) evt.getSource());
    }//GEN-LAST:event_jTextOp2PRFocusGained

    private void jTextOp1PCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextOp1PCFocusGained
        // TODO add your handling code here:
        ponerBlancaTextField((JTextField) evt.getSource());
    }//GEN-LAST:event_jTextOp1PCFocusGained

    private void jTextOp2PCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextOp2PCFocusGained
        // TODO add your handling code here:
        ponerBlancaTextField((JTextField) evt.getSource());
    }//GEN-LAST:event_jTextOp2PCFocusGained

    private void jComboBoxOperacionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxOperacionesItemStateChanged
        // TODO add your handling code here:
        compruebaOperandos(jTextOp1PC, jTextOp2PC, jLabelResultadoPC, 
                Operaciones.valueOf((String)evt.getItem()));
    }//GEN-LAST:event_jComboBoxOperacionesItemStateChanged

    private double op1 = 0;
    private double op2 = 0;

    private void ponerBlancaTextField(JTextField jTextOp)
    {
        jTextOp.setBackground(Color.white);
    }
    
    private boolean compruebaOperando1(JTextField jTextOp, boolean decimales) {
        boolean error = false;
        try {
            if (decimales) {
                op1 = Double.parseDouble(jTextOp.getText());
            } else {
                op1 = Integer.parseInt(jTextOp.getText());
            }

        } catch (Exception e) {

            jTextOp.setBackground(Color.red);
            error = true;
        }
        return error;
    }

    private boolean compruebaOperando2(JTextField jTextOp, boolean decimales) {
        boolean error = false;
        try {
            if (decimales) {
                op2 = Double.parseDouble(jTextOp.getText());
            } else {
                op2 = Integer.parseInt(jTextOp.getText());
            }

        } catch (Exception e) {

            jTextOp.setBackground(Color.red);
            error = true;
        }
        return error;
    }

    private boolean compruebaOperandos(JTextField jTextOp1, JTextField jTextOp2,
            JLabel jLabelResultado, Operaciones operacion) {
        return compruebaOperandos(jTextOp1, jTextOp2, jLabelResultado, operacion, false);
    }

    private boolean compruebaOperandos(JTextField jTextOp1, JTextField jTextOp2,
            JLabel jLabelResultado, Operaciones operacion, boolean decimales) {

        boolean error = compruebaOperando1(jTextOp1, decimales);

        boolean error2 = compruebaOperando2(jTextOp2, decimales);

        error = error || error2;

        if (error) {
            JOptionPane.showMessageDialog(this, "eso no es un numero", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            double resultado = 0;
            switch (operacion) {
                case SUMAR:
                    resultado = op1 + op2;
                    break;
                case RESTAR:
                    resultado = op1 - op2;
                    break;
                case MULTIPLICAR:
                    resultado = op1 * op2;
                    break;
                case DIVIDIR:
                    resultado = op1 / op2;
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "No has elegido operacion", "ERROR", JOptionPane.ERROR_MESSAGE);
                    error = true;
                    break;
            }
            if (!error) {
                if (!decimales) {
                    jLabelResultado.setText((int) resultado + "");
                } else {
                    jLabelResultado.setText(resultado + "");
                }
            }
        }

        return error;
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGroupOperaciones;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonRestar;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JCheckBox jCheckBoxDecimales;
    private javax.swing.JComboBox jComboBoxOperaciones;
    private javax.swing.JLabel jLabelResultadoPB;
    private javax.swing.JLabel jLabelResultadoPC;
    private javax.swing.JLabel jLabelResultadoPR;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelCombo;
    private javax.swing.JPanel jPanelRadioCheck;
    private javax.swing.JRadioButton jRadioButtonDividir;
    private javax.swing.JRadioButton jRadioButtonMultiplicar;
    private javax.swing.JRadioButton jRadioButtonRestar;
    private javax.swing.JRadioButton jRadioButtonSumar;
    private javax.swing.JTabbedPane jTabbedCalculadora;
    private javax.swing.JTextField jTextOp1PB;
    private javax.swing.JTextField jTextOp1PC;
    private javax.swing.JTextField jTextOp1PR;
    private javax.swing.JTextField jTextOp2PB;
    private javax.swing.JTextField jTextOp2PC;
    private javax.swing.JTextField jTextOp2PR;
    // End of variables declaration//GEN-END:variables
}
