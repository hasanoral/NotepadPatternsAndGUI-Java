/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textedt;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

/**
 *
 * @author kerem alp
 */
public class ChangeRedTheme implements TextAreaChanger{

    @Override
    public void change(TextEditorGui gui) {
        gui.metin.setForeground(Color.BLACK);
        gui.jPanel1.setBackground(Color.red);
        gui.başaatla.setBackground(Color.red);
        gui.başaatla.setForeground(Color.BLACK);
        gui.metin.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        gui.search1.setBorder(new LineBorder(Color.BLACK));
        gui.backspace1.setBorder(new LineBorder(Color.BLACK));
        gui.CounterButton.setBorder(new LineBorder(Color.BLACK));
        gui.search.setBorder(new LineBorder(Color.BLACK));
        gui.change.setBorder(new LineBorder(Color.BLACK));
        gui.backspace.setBorder(new LineBorder(Color.BLACK));
        gui.başaatla.setBorder(new LineBorder(Color.BLACK));
        gui.search1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        gui.search.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        gui.change.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        gui.CounterButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        gui.backspace1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        gui.backspace.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        gui.CounterArea.setBorder(new LineBorder(Color.WHITE));

    }
    
}
