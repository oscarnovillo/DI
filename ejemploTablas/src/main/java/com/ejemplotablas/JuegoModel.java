/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplotablas;

import controller.ControlJuegos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Juego;

/**
 *
 * @author oscar
 */
public class JuegoModel extends DefaultTableModel {

    private ArrayList<Juego> juegos;

    public JuegoModel() {
        super();
        controller.ControlJuegos cj = new ControlJuegos();
        juegos = cj.getAllJuegos();
        
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int row, int col) {
        Juego jueo = juegos.get(row);
        switch (col) {
            case 0:
                return jueo.getId();
            case 1:
                return jueo.getNombre();
        }
        
        return null;
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        super.setValueAt(o, i, i1); //To change body of generated methods, choose Tools | Templates.
    }

}
