
package textedt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;


public class Fonksiyonlar{

    boolean openFile(File temp, JTextArea metin) {//Dosya açmamızı sağlayan fonksiyonumuz...
        FileInputStream fin = null;
        BufferedReader din = null;

        try {
            fin = new FileInputStream(temp);
            din = new BufferedReader(new InputStreamReader(fin));
            String str = " ";
            while (str != null) {
                str = din.readLine();
                if (str == null) {
                    break;
                }
                metin.append(str + "\n");
            }

        } catch (IOException ioe) {
        } finally {
            try {
                din.close();
                fin.close();
            } catch (IOException excp) {
            }
        }
        metin.setCaretPosition(0);
        return true;
    }

    

}
