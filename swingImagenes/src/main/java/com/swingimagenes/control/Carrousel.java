/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swingimagenes.control;

import com.swingimagenes.model.Imagen;
import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class Carrousel {
    
    private ArrayList<Imagen> imagenes;
    private int currentIndexImagen;

    public Carrousel() {
        imagenes = new ArrayList<>();
        currentIndexImagen = 0;
    }

    public ArrayList<Imagen> getImagenes() {
        return imagenes;
    }
    
    
    public void addImagen(Imagen im)
    {
        imagenes.add(im);
    }

    public void setImagenes(ArrayList<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public int getCurrentIndexImagen() {
        return currentIndexImagen;
    }
    public int getNextIndexImagen(){
        return (currentIndexImagen+1)% imagenes.size();
    }
    
    public Imagen getImagen(int index)
    {
        return imagenes.get(index);
    }
    
    public int getTamaño()
    {
        return imagenes.size();
    }
    public void pasarCarrousel()
    {
        this.currentIndexImagen ++;
        this.currentIndexImagen %= imagenes.size();
    }
    
   
}
