package com.hen.dnamutation.Controllers;

import com.hen.dnamutation.DomainLogic.DnaMutationTest;
import com.hen.dnamutation.Models.Dna;
import com.hen.dnamutation.Views.DnaTester;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Henrry Gómez Cabañas
 */
public class DnaTesterController {
    
     
    private static DnaTesterController instance = null; 
    
    private Dna dnaModel;
    private DnaTester dnaView;

    public static DnaTesterController getInstance() 
    { 
        return instance; 
    } 
    
    public DnaTesterController(DnaTester dnaView) {
        if(instance==null){
            instance = this;
        } else {
            return;
        }
        this.dnaModel = dnaModel;
        this.dnaView = dnaView;
        addListener();
    }
    
    public void runTest(){
        String[] secuences = dnaView.getTxtDnaSecuences().getText().split("[\n]");
        DnaMutationTest tester = new DnaMutationTest();
        boolean hasMutation = tester.hasMutationAllTest(secuences);
        
        JOptionPane.showMessageDialog(null, "The dna " + (hasMutation ? "is mutated." : "don't has mutate."));
    }
    
    public void addListener(){
        
        dnaView.getBtnValidate().addActionListener(new ActionListener() {		
            public void actionPerformed(ActionEvent e) {
              runTest();			
            }	
        });
        
    }
}
