/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karthi
 */
public class EvaluationTest {
    
    public EvaluationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTestPrice method, of class Evaluation.
     */
    @Test
    public void testGetTestPrice() {
        System.out.println("getTestPrice");
        Evaluation instance = new Evaluation();
        int expResult = Evaluation.testPrice;
        int result = instance.getTestPrice();
        assertEquals(expResult, result);
    }
    
}
