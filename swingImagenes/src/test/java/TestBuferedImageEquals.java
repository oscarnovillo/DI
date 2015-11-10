/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oscar
 */
public class TestBuferedImageEquals {
    
    public TestBuferedImageEquals() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void comparaDosBuffered() {
        try {
            BufferedImage bi = ImageIO.read(new File("./images/ivan.jpg") );
            BufferedImage bi2 = ImageIO.read(new File("./images/ivan.jpg") );
            
          
            assertTrue(compareImages(bi, bi2));
            
        } catch (IOException ex) {
            Logger.getLogger(TestBuferedImageEquals.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    /**
 * Compares two images pixel by pixel.
 *
 * @param imgA - the first image.
 * @param imgB - the second image.
 * @return whether the images are both the same.
 */
public static boolean compareImages(BufferedImage imgA, BufferedImage imgB) {
    // The images mush be the same size.
    if (imgA.getWidth() == imgB.getWidth() && imgA.getHeight() == imgB.getHeight()) {
        int width = imgA.getWidth();
        int height = imgA.getHeight();

        // Loop over every pixel.
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Compare the pixels for equality.
                if (imgA.getRGB(x, y) != imgB.getRGB(x, y)) {
                    return false;
                }
            }
        }
    } else {
        return false;
    }

    return true;
}
    
}
