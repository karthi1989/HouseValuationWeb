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
public class ExampleFeatureSurf3Test {
    
    public ExampleFeatureSurf3Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of runSurf3 method, of class ExampleFeatureSurf3.
     */
    @Test
    public void testRunSurf3() {
        System.out.println("runSurf3");
        ExampleFeatureSurf3 instance = new ExampleFeatureSurf3();
        String expResult = "38";
        String result = instance.runSurf3();
        assertEquals(expResult, result);

    }

    /**
     * Test of main method, of class ExampleFeatureSurf3.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ExampleFeatureSurf3.main(args);

    }
    
}
