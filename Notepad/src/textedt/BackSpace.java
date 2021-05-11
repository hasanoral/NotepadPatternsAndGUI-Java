/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textedt;

import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 *
 * @author kerem alp
 */
public class BackSpace {

    public void delete(JTextComponent comp) {
      
       String kelime;
        kelime = comp.getText();
        StringBuilder sb = new StringBuilder(kelime);
        if (sb.toString().length() <= 0) {
            
            //Eğer silinecek karakter kalmadıysa kodumuz kullanıcıya hata mesajı verir.
            JOptionPane.showMessageDialog(null, "Boşluk geri alınamaz!", "InfoBox: " + "HATA!", JOptionPane.ERROR_MESSAGE);

        } else {
            sb.deleteCharAt(sb.length() - 1);
            comp.setText(sb.toString());
        }
    }

   
    
}
