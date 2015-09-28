/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.calculadora.Calculadora;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oscar
 */
public class MiPrimerTestChispas {

    public MiPrimerTestChispas() {
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
    public void hello() {
        
        
        
        

    }
}
