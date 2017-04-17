/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluation;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karthi
 */
public class updateDataTest {
    
    public updateDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of updateData method, of class updateData.
     */
    @Test
    public void testUpdateData() {
        System.out.println("updateData");
        beanClass bean = null;
        updateData instance = new updateData();
        instance.updateData(bean);

    }

    /**
     * Test of main method, of class updateData.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        updateData.main(args);

    }

    /**
     * Test of testMain method, of class updateData.
     */
    @Test
    public void testTestMain() {
        System.out.println("testMain");
        updateData instance = new updateData();
        int expResult = (int) updateData.price;
        int result = instance.testMain();
        assertEquals(expResult, result);
    }
    
}
