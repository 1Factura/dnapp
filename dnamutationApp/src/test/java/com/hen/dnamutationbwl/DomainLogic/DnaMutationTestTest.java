package com.hen.dnamutationbwl.DomainLogic;

import com.hen.dnamutation.DomainLogic.DnaMutationTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Henrry Gómez Cabañas
 */
public class DnaMutationTestTest extends TestCase {
    
    public DnaMutationTestTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(DnaMutationTestTest.class);
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
     * Test of hasMutationAllTest method, of class DnaMutationTest.
     */
    public void testHasMutationAllTest() {
        System.out.println("hasMutationAllTest");
        String[] dna = {"ABCT","ACTB","ATCB","TBDB","GBDB"};
        DnaMutationTest instance = new DnaMutationTest();
        boolean expResult = true;
        boolean result = instance.hasMutationAllTest(dna);
        assertEquals(expResult, result); 
    }

    /**
     * Test of hasMutation method, of class DnaMutationTest.
     */
    public void testHasMutation() {
        System.out.println("hasMutation");
        String[] dna = {"ABCT","ACTB","ATCB","TBDB","GBDB"};
        DnaMutationTest instance = new DnaMutationTest();
        boolean expResult = false;
        boolean result = instance.hasMutation(dna);
        assertEquals(expResult, result); 
    }

    /**
     * Test of getArrayDiagonal method, of class DnaMutationTest.
     */
    public void testGetArrayDiagonal() {
        System.out.println("getArrayDiagonal");
        String[] dna = {"ABCT","ACTB","ATCB","TBDB"};
        DnaMutationTest instance = new DnaMutationTest();
        String[] expResult =  {"TAAA","BTCB","DCTC","BBBT"};
        String[] result = instance.getArrayDiagonal(dna);
        assertEquals(expResult, result); 
    }

    /**
     * Test of flip90GradeArray method, of class DnaMutationTest.
     */
    public void testFlip90GradeArray() {
        System.out.println("flip90GradeArray");
        String[] dna =  {"ABCT","ACTB","ATCB","TBDB","GBDB"};
        DnaMutationTest instance = new DnaMutationTest();
        String[] expResult = null;
        String[] result = instance.flip90GradeArray(dna);
        assertEquals(expResult, result); 
    }
    
}
