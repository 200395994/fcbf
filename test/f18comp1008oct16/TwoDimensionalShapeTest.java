/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f18comp1008oct16;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ravneet Bhullar
 */
public class TwoDimensionalShapeTest {
    
    public TwoDimensionalShapeTest() {
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
     * Test of getArea method, of class TwoDimensionalShape.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        TwoDimensionalShape instance = new TwoDimensionalShapeImpl();
        double expResult = 0.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TwoDimensionalShapeImpl extends TwoDimensionalShape {

        public double getArea() {
            return 0.0;
        }
    }
    
}
