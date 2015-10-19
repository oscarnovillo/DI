/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swingimagenes.model;

/**
 *
 * @author oscar
 */
public class Imagen {
    
    private String pathImage;
    private String pathImageBlur;
    private String pathImageProhibida;

    public Imagen(String pathImage) {
        this.pathImage = pathImage;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public String getPathImageBlur() {
        return pathImageBlur;
    }

    public void setPathImageBlur(String pathImageBlur) {
        this.pathImageBlur = pathImageBlur;
    }

    public String getPathImageProhibida() {
        return pathImageProhibida;
    }

    public void setPathImageProhibida(String pathImageProhibida) {
        this.pathImageProhibida = pathImageProhibida;
    }
    
    
    
    
    
}
