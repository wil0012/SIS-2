/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventana;

import java.awt.Image;
import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dick
 */
public class EstacionamientoTest {
    
    public EstacionamientoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getConection method, of class Estacionamiento.
     */
    @org.junit.Test
    public void testGetConection() {
        System.out.println("getConection");
        Connection expResult = null;
        Connection result = Estacionamiento.getConection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIconImage method, of class Estacionamiento.
     */
    @org.junit.Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        Estacionamiento instance = new Estacionamiento();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Estacionamiento.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Estacionamiento.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
