/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swingimagenes.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author oscar
 */
public class ImagePanel extends JPanel{

    private BufferedImage image;

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
        this.repaint();
    }
    
    
    
    
    @Override
    public void paint(Graphics g) {
        super.paintComponent(g); 
        int offsetX =0;
        if (this.image!=null && this.image.getWidth()<this.getWidth())
        {
           offsetX = (this.getWidth() - this.image.getWidth()) /2; 
        }
        
        g.drawImage(this.image,offsetX, 0, null);
    }
    
    
    
}
