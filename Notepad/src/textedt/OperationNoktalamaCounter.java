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
public class OperationNoktalamaCounter implements Strategy {

    @Override
    public int doCount(JTextArea text) {
        int noktalamacount = 0 ;
        String noktalama = text.getText();
        StringBuilder substring = new StringBuilder(noktalama);
        for (int k=0 ; k<substring.toString().length(); k++){
            
            if(substring.charAt(k)== ',' || substring.charAt(k)== ';' || substring.charAt(k)== '.'){
                
                noktalamacount++;
            }
              
        }
        
        return noktalamacount;
    }
    
}
