/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displaaymagicalnumber;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abder
 */
public class DisplaayMagicalNumberTest {
    
    public DisplaayMagicalNumberTest() {
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
     * Test of displayMagicalNumber method, of class DisplaayMagicalNumber.
     */
 

     @Test
    public void testDisplayMagicalNumber2() {
        System.out.println("displayMagicalNumber");
        int pIMin = 5;
        int pIMax = 10;
        DisplaayMagicalNumber.displayMagicalNumber(pIMin, pIMax);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      @Test
    public void testDisplayMagicalNumber3() {
        System.out.println("displayMagicalNumber");
        int pIMin = 5;
        int pIMax = 2;
        DisplaayMagicalNumber.displayMagicalNumber(pIMin, pIMax);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    /**
     * Test of main method, of class DisplaayMagicalNumber.
     */
   
    
}
