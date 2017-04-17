/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import boofcv.struct.image.GrayF32;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karthi
 */
public class ExampleFeatureSurfTest {
    
    public ExampleFeatureSurfTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    
    
    /**
     * Test of runSurf method, of class ExampleFeatureSurf.
     */
    @Test
    public void testRunSurf() {
        System.out.println("runSurf");
        ExampleFeatureSurf instance = new ExampleFeatureSurf();
        String expResult = "47";
        String result = instance.runSurf();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class ExampleFeatureSurf.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ExampleFeatureSurf.main(args);
    }
    
}
