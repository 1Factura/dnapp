package com.hen.dnamutationbwl.Models;

import com.hen.dnamutation.Models.Dna;
import junit.framework.TestCase;

/**
 *
 * @author Henrry Gómez Cabañas
 */
public class DnaTest extends TestCase {
    
    public DnaTest(String testName) {
        super(testName);
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
     * Test of getSecuence method, of class Dna.
     */
    public void testGetSecuence() {
        System.out.println("getSecuence");
        Dna instance = null;
        String[] expResult = null;
        String[] result = instance.getSecuence();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setSecuence method, of class Dna.
     */
    public void testSetSecuence() {
        System.out.println("setSecuence");
        String[] Secuence = null;
        Dna instance = null;
        instance.setSecuence(Secuence); 
    }
    
}
