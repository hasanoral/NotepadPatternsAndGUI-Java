/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textedt;

import java.awt.Color;
import java.awt.Font;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;
import javax.swing.text.html.CSS;

/**
 *
 * @author kerem alp
 */
public class ChangeBlueTheme implements TextAreaChanger {

    @Override
    public void change(TextEditorGui gui) {
        gui.metin.setForeground(Color.BLACK);
                gui.metin.setBorder(new LineBorder(Color.BLACK,3));

        gui.jPanel1.setBackground(Color.BLUE);
        gui.başaatla.setBackground(Color.BLUE);
        gui.başaatla.setForeground(Color.WHITE);
        gui.metin.setFont(new Font("Century", Font.PLAIN, 24));
        gui.search1.setBorder(new LineBorder(Color.WHITE));
        gui.backspace1.setBorder(new LineBorder(Color.WHITE));
        gui.CounterButton.setBorder(new LineBorder(Color.WHITE));
        gui.search.setBorder(new LineBorder(Color.WHITE));
        gui.change.setBorder(new LineBorder(Color.WHITE));
        gui.backspace.setBorder(new LineBorder(Color.WHITE));
        gui.başaatla.setBorder(new LineBorder(Color.WHITE));
        gui.search1.setFont(new Font("Century", Font.PLAIN, 18));
        gui.search.setFont(new Font("Century", Font.PLAIN, 18));
        gui.change.setFont(new Font("Century", Font.PLAIN, 18));
        gui.CounterButton.setFont(new Font("Century", Font.PLAIN, 18));
        gui.backspace1.setFont(new Font("Century", Font.PLAIN, 18));
        gui.backspace.setFont(new Font("Century", Font.PLAIN, 18));
        gui.CounterArea.setBorder(new LineBorder(Color.MAGENTA));

    }
}
