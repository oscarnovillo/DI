/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swingimagenes.control;

import com.swingimagenes.DAO.ImagenesDAO;
import com.swingimagenes.model.Imagen;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorConvertOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author oscar
 */
public class ControlImagenes {

    Carrousel imagenes ;

    public ControlImagenes() {
        imagenes = new Carrousel();
    }

    public void addImagen(Imagen im)
    {
        imagenes.addImagen(im);
    }
    
    public void siguienteImagen()
    {
        imagenes.pasarCarrousel();
    }
    
    public Imagen getCurrentImagen()
    {
        Imagen im = imagenes.getImagen(imagenes.getCurrentIndexImagen());
        
        return im;
    }
    public Imagen getNextImagen()
    {
        Imagen im = imagenes.getImagen(imagenes.getNextIndexImagen());
        
        return im;
    }
    
    public int getTamaño()
    {
        return imagenes.getTamaño();
    }
    
    public BufferedImage blurImagen(BufferedImage im) {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = im;
            Kernel kernel = new Kernel(3, 3, new float[]{1f / 9f, 1f / 9f, 1f / 9f,
                1f / 9f, 1f / 9f, 1f / 9f, 1f / 9f, 1f / 9f, 1f / 9f});
            BufferedImageOp op = new ConvolveOp(kernel);
            bufferedImage = op.filter(bufferedImage, null);
        } catch (Exception ex) {
            Logger.getLogger(ControlImagenes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bufferedImage;
    }

    
    public BufferedImage greyScaleImagen(BufferedImage im) {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = im;
           
            BufferedImageOp op =  new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
            
            op =  new ConvolveOp(new Kernel(3, 3, new float[] { .1111f, .1111f, .1111f, .1111f, .1111f, .1111f, .1111f, .1111f, .1111f, }));

            bufferedImage = op.filter(bufferedImage, null);
        } catch (Exception ex) {
            Logger.getLogger(ControlImagenes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bufferedImage;
    }
    
    
    public void saveImagenes() {
        //Guardar como JSON.
        ImagenesDAO imagenDAO = new ImagenesDAO();
        imagenDAO.save(imagenes.getImagenes());

    }

    public void loadImagenes() {
        //Cargar como JSON.
        ImagenesDAO imagenDAO = new ImagenesDAO();
        imagenes.setImagenes(imagenDAO.load());
    }

}
