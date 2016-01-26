
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplotablas;

import controller.ControlJuegos;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import model.Juego;

/**
 *
 * @author oscar
 */
public class JuegoModel extends AbstractTableModel {

    private ArrayList<Juego> juegos;

    private boolean insertando = false;

    public boolean isInsertando() {
        return insertando;
    }
    
    public void insertarFila()
    {
        juegos.add(new Juego(-1,"",null));
        fireTableRowsInserted(juegos.size()-1, juegos.size()-1);
        //fireTableDataChanged();
        insertando = true;
    }
    
    
    public JuegoModel() {
        super();
        controller.ControlJuegos cj = new ControlJuegos();
        juegos = cj.getAllJuegos();
        juegos.add(0, new Juego(0, "", null));
        //cargar Las filas
    }

    @Override
    public String getColumnName(int i) {
        String columnName = "";
        switch (i) {
            case 0:
                columnName = "ID";
                break;
            case 1:
                columnName = "NOMBRE";
                break;
            case 2:
                columnName = "FECHA";
                break;
        }
        return columnName;
    }

    @Override
    public int getRowCount() {
        return juegos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    public Juego getJuegoAtRow(int row) {
        return juegos.get(row);
    }

    public void deleteJuego(Juego j) {
        juegos.remove(j);
        fireTableDataChanged();
    }

    @Override
    public Object getValueAt(int row, int col) {
        Juego jueo = juegos.get(row);
        switch (col) {
            case 0:
                return jueo.getId();
            case 1:
                return jueo.getNombre();
            case 2:
                return jueo.getFecha();
        }

        return null;
    }

    @Override
    public void setValueAt(Object o, int row, int col) {
        Juego j = juegos.get(row);
        if (row > 0) {
            switch (col) {
                case 1:
                    j.setNombre((String) o);
                    break;
                case 2:
                    j.setFecha((Date) o);
                    break;
            }

            fireTableCellUpdated(row, col);
        }
        else
        {
            switch (col) {
                case 1:
                    j.setNombre((String) o);
                    break;
                case 2:
                    j.setFecha((Date) o);
                    break;
            }

        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 0; //To change body of generated methods, choose Tools | Templates.
    }

}
