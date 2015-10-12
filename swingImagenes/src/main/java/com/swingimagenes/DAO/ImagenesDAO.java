/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swingimagenes.DAO;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swingimagenes.model.Imagen;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar
 */
public class ImagenesDAO {

    public ArrayList<Imagen> load() {
        ArrayList<Imagen> imagenes = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            imagenes = mapper.readValue(new File("imagenes.json"), 
                    new TypeReference<ArrayList<Imagen>>() {
            });

        } catch (IOException ex) {
            Logger.getLogger(ImagenesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return imagenes;
    }

    public void save(ArrayList<Imagen> imagenes) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("imagenes.json"), imagenes);
        } catch (IOException ex) {
            Logger.getLogger(ImagenesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
