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
public class ExampleFeatureSurf4Test {
    
    public ExampleFeatureSurf4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of runSurf4 method, of class ExampleFeatureSurf4.
     */
    @Test
    public void testRunSurf4() {
        System.out.println("runSurf4");
        ExampleFeatureSurf4 instance = new ExampleFeatureSurf4();
        String expResult = "45";
        String result = instance.runSurf4();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class ExampleFeatureSurf4.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ExampleFeatureSurf4.main(args);
    }
    
}
