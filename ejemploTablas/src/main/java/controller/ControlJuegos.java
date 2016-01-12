/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.JuegosDAO;
import java.util.ArrayList;
import model.Juego;

/**
 *
 * @author oscar
 */
public class ControlJuegos {
    
    public ArrayList<Juego> getAllJuegos()
    {
        ArrayList<Juego> juegos =null;
        JuegosDAO juegosDAO = new JuegosDAO();
        juegos = juegosDAO.getAllJuegos();
        return juegos;
    }
    
}
