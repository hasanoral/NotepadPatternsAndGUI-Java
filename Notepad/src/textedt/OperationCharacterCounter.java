/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textedt;

import javax.swing.JTextArea;

/**
 *
 * @author Lenovo
 */
public class OperationCharacterCounter implements Strategy{

    @Override
    public int doCount(JTextArea text) {
        int karaktercount = 0;
        String harf = text.getText();
        StringBuilder substring = new StringBuilder(harf);
        for (int k=0 ; k<substring.toString().length(); k++){
            karaktercount++;
            if(substring.charAt(k)== ' ' || substring.charAt(k)== ',' || substring.charAt(k)== ';' || substring.charAt(k)== '.'|| substring.charAt(k)== '\n'){
                
                karaktercount--;
            }
              
        }
        
        return karaktercount;
        
    }
    
}
