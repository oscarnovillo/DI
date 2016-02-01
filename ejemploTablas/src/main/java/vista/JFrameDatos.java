package vista;

import vista.model.JuegoModel;
import config.Configuration;
import controller.ControlJuegos;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Juego;
import org.jdesktop.swingx.table.DatePickerCellEditor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oscar
 */
public class JFrameDatos extends javax.swing.JFrame {

    ControlJuegos control;
    LinkedHashMap<Integer,String> tipos;

    /**
     * Creates new form JFrameDatos
     */
    public JFrameDatos() {
        tipos = new LinkedHashMap<>();
        tipos.put(1, "dfff");
        tipos.put(2,"sdfsdf");
                
        initComponents();
        control = new ControlJuegos();
        System.out.println(Configuration.getInstance().getLista());
        
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                
                if (((JuegoModel)jTable1.getModel()).isInsertando())
                {
                    JOptionPane.showConfirmDialog(JFrameDatos.this, "Q PASA");
                }
                else
                {
                System.out.println(jTable1.getSelectionModel().isSelectedIndex(e.getFirstIndex()));
                System.out.println(jTable1.getSelectionModel().isSelectedIndex(e.getLastIndex()));
                System.out.println(e.getFirstIndex() + " " + e.getLastIndex());
                    
                }
            }
        });
        
        JuegoModel model =  new JuegoModel();
        
        model.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                switch (e.getType()) {
                    case TableModelEvent.INSERT:

                        System.out.println("I" + e.getColumn() + " " + e.getFirstRow());
                        break;
                    case TableModelEvent.UPDATE:

                        if (e.getFirstRow() >0)
                        {
                        System.out.println("U" + e.getColumn() + " " + e.getFirstRow());

                        // Juego j = new Juego(jTable1.getModel().getValueAt(e.getFirstRow(), 0),
                        //        jTable1.getModel().getValueAt(e.getFirstRow(), 1),
                        //         jTable1.getModel().getValueAt(e.getFirstRow(), 2) );
                        Juego j = ((JuegoModel)jTable1.getModel()).getJuegoAtRow(e.getFirstRow());
                        control.updateJuego(j);
                        System.out.println(jTable1.getModel().getValueAt(e.getFirstRow(), e.getColumn()));
                        }
                        else
                        {
                          
                        }
                        
                    
                        break;
                    case TableModelEvent.DELETE:

                        System.out.println("D" + e.getColumn() + " " + e.getFirstRow());
                        break;
                }
            }
        });
        jTable1.setModel(model);
//        ArrayList<Juego> juegos = control.getAllJuegos();
//
//        int numFilas = model.getRowCount();
//        for (int i = 0; i < numFilas; i++) {
//            model.removeRow(0);
//        }
//
//        for (Juego j : juegos) {
//
//            model.addRow(new Object[]{j.getId(), j.getNombre(), new Date()});
//        }
//        
        //filtros de filas
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
        jTable1.setRowSorter(sorter);
//        RowFilter row = RowFilter.regexFilter("g", 1);
//        RowFilter row2 = RowFilter.regexFilter("2014", 2);
//        RowFilter row3 = RowFilter.regexFilter("0", 0);
//        ArrayList<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>();
//        filters.add(row);
//        filters.add(row2);
//        filters.add(row3);
//        ((TableRowSorter) jTable1.getRowSorter()).setRowFilter(RowFilter.andFilter(filters));
        
        
        
        
        //editor de fechas
        TableColumn dateColumn = jTable1.getColumnModel().getColumn(2);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        dateColumn.setCellEditor(new DatePickerCellEditor(sf));
        dateColumn.setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if (row ==0)
                {
                    if (value!=null)
                        return new JLabel("Filtrado por "+sf.format(value));
                    else
                        return new JLabel("Cambia Valor para filtar ");
                }
                
                    
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
            }
            
            
            @Override
            public void setValue(Object value) {
                if (value!=null)
                    setText(sf.format(value));
                else
                    setText("");
            }
        });

        dateColumn = jTable1.getColumnModel().getColumn(3);
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("dfff");
        comboBox.addItem("sdfsdf");
        dateColumn.setCellEditor(new DefaultCellEditor(comboBox));
        dateColumn.setCellRenderer(new DefaultTableCellRenderer() {
            
            @Override
            public void setValue(Object value) {
                
                    setText(tipos.get(value));
            }
        });

        
        //ocultar columna
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jScrollPane1FocusLost(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButton1.setText("add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setText("jButton2");
        jPanel1.add(jButton2);

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ((JuegoModel)jTable1.getModel()).insertarFila();
        jTable1.setRowSelectionInterval(4, 4);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jScrollPane1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jScrollPane1FocusLost
        // TODO add your handling code here:
        if (((JuegoModel)jTable1.getModel()).isInsertando())
                {
                    JOptionPane.showConfirmDialog(JFrameDatos.this, "Q PASA");
                }
    }//GEN-LAST:event_jScrollPane1FocusLost

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost
        // TODO add your handling code here:
        if (((JuegoModel)jTable1.getModel()).isInsertando())
                {
                    JOptionPane.showConfirmDialog(JFrameDatos.this, "Q PASA");
                }
    }//GEN-LAST:event_jTable1FocusLost

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
            java.util.logging.Logger.getLogger(JFrameDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
