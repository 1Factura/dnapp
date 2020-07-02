package com.hen.dnamutationbwl.Views;

import com.hen.dnamutation.Views.DnaTester;
import javax.swing.JButton;
import javax.swing.JTextArea;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Henrry Gómez Cabañas
 */
public class DnaTesterTest {
    
    public DnaTesterTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    } 

    /**
     * Test of getBtnValidate method, of class DnaTester.
     */
    @org.junit.jupiter.api.Test
    public void testGetBtnValidate() {
        System.out.println("getBtnValidate");
        DnaTester instance = new DnaTester();
        JButton expResult = null;
        JButton result = instance.getBtnValidate();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setBtnValidate method, of class DnaTester.
     */
    @org.junit.jupiter.api.Test
    public void testSetBtnValidate() {
        System.out.println("setBtnValidate");
        JButton btnValidate = null;
        DnaTester instance = new DnaTester();
        instance.setBtnValidate(btnValidate); 
    }

    /**
     * Test of getTxtDnaSecuences method, of class DnaTester.
     */
    @org.junit.jupiter.api.Test
    public void testGetTxtDnaSecuences() {
        System.out.println("getTxtDnaSecuences");
        DnaTester instance = new DnaTester();
        JTextArea expResult = null;
        JTextArea result = instance.getTxtDnaSecuences();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setTxtDnaSecuences method, of class DnaTester.
     */
    @org.junit.jupiter.api.Test
    public void testSetTxtDnaSecuences() {
        System.out.println("setTxtDnaSecuences");
        JTextArea txtDnaSecuences = null;
        DnaTester instance = new DnaTester();
        instance.setTxtDnaSecuences(txtDnaSecuences); 
    }
    
}
