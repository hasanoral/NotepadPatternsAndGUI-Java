/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textedt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.LineBorder;

/**
 *
 * @author kerem alp
 */
public class ChangeGreyTheme implements TextAreaChanger{
     public void change(TextEditorGui gui) {
        gui.jPanel1.setBackground(Color.LIGHT_GRAY);
        gui.metin.setForeground(Color.BLACK);
        gui.başaatla.setBackground(Color.LIGHT_GRAY);
        gui.başaatla.setForeground(Color.WHITE);
        gui.metin.setFont(new Font("Arial", Font.PLAIN, 24));
        gui.search1.setBorder(new LineBorder(Color.RED));
        gui.backspace1.setBorder(new LineBorder(Color.RED));
        gui.CounterButton.setBorder(new LineBorder(Color.RED));
        gui.search.setBorder(new LineBorder(Color.RED));
        gui.change.setBorder(new LineBorder(Color.RED));
        gui.backspace.setBorder(new LineBorder(Color.RED));
        gui.başaatla.setBorder(new LineBorder(Color.RED));
        gui.metin.setBorder(new LineBorder(Color.RED));
        gui.search1.setFont(new Font("Arial", Font.PLAIN, 18));
        gui.search.setFont(new Font("Arial", Font.PLAIN, 18));
        gui.change.setFont(new Font("Arial", Font.PLAIN, 18));
        gui.CounterButton.setFont(new Font("Arial", Font.PLAIN, 18));
        gui.backspace1.setFont(new Font("Arial", Font.PLAIN, 18));
        gui.backspace.setFont(new Font("Arial", Font.PLAIN, 18));
        gui.CounterArea.setBorder(new LineBorder(Color.red));

        
        
    }
}
