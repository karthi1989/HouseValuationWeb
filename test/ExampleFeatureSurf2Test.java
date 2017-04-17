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
public class ExampleFeatureSurf2Test {
    
    public ExampleFeatureSurf2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of runSurf2 method, of class ExampleFeatureSurf2.
     */
    @Test
    public void testRunSurf2() {
        System.out.println("runSurf2");
        ExampleFeatureSurf2 instance = new ExampleFeatureSurf2();
        String expResult = "42";
        String result = instance.runSurf2();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class ExampleFeatureSurf2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ExampleFeatureSurf2.main(args);
    }
    
}
