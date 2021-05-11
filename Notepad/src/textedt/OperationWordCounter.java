/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textedt;

import java.util.Iterator;
import javax.swing.JTextArea;

/**
 *
 * @author Lenovo
 */
public class OperationWordCounter implements Strategy {
    int wordscount= 0;
    @Override
    public int doCount(JTextArea t) {
       
        String str1 = t.getText();

        String[] wordArray = str1.trim().split(",|\\.|\\;|\\s+");
        int wordCount = wordArray.length;

        
        return wordCount;
    }

    
    
}  

