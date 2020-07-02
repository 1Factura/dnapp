package com.hen.dnamutationbwl.Controllers;

import com.hen.dnamutation.Controllers.DnaTesterController;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Henrry Gómez Cabañas
 */
public class DnaTesterControllerTest extends TestCase {
    
    public DnaTesterControllerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(DnaTesterControllerTest.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getInstance method, of class DnaTesterController.
     */
    public void testGetInstance() {
        System.out.println("getInstance");
        DnaTesterController expResult = null;
        DnaTesterController result = DnaTesterController.getInstance();
        assertEquals(expResult, result); 
    }

    /**
     * Test of runTest method, of class DnaTesterController.
     */
    public void testRunTest() {
        System.out.println("runTest");
        DnaTesterController instance = null;
        instance.runTest(); 
    }

    /**
     * Test of addListener method, of class DnaTesterController.
     */
    public void testAddListener() {
        System.out.println("addListener");
        DnaTesterController instance = null;
        instance.addListener(); 
    }
    
}
