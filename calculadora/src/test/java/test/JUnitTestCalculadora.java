/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.calculadora.Calculadora;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.fixture.JButtonFixture;
import org.fest.swing.fixture.JOptionPaneFixture;
import org.fest.swing.fixture.JTabbedPaneFixture;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oscar
 */
public class JUnitTestCalculadora {
    
    public JUnitTestCalculadora() {
    }
    private FrameFixture frame;
    
    @Before
    public void setUp() {
        frame = new FrameFixture(new Calculadora());
        frame.show();
        
    }
    
    @After
    public void tearDown() {
        frame.cleanUp();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void errorCajaTexto() {
        JButtonFixture bt = frame.button("jButtonSumar").click();
        JOptionPaneFixture op = frame.optionPane();
        
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(JUnitTestCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertThat(op.target.getMessageType(),is(JOptionPane.ERROR_MESSAGE));
        
        op.okButton().click();
       
        
    }

    @Test
    public void sumaCorrectaPestaña() {
        JTabbedPaneFixture tabPanel = frame.tabbedPane("jTabbedCalculadora");
        tabPanel.selectTab(1);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(JUnitTestCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        tabPanel.selectTab("Botones");
        JButtonFixture bt = frame.button("jButtonSumar").click();
        JOptionPaneFixture op = frame.optionPane();
        
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(JUnitTestCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertThat(op.target.getMessageType(),is(JOptionPane.ERROR_MESSAGE));
        
        op.okButton().click();
       
        
    }


}
