/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textedt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import sun.java2d.cmm.CMMServiceProvider;

public class TextEdt {

    public static void main(String[] args) throws BadLocationException {

        TextEditorGui obj = new TextEditorGui();//GUI objesi oluşturuluyor.
        obj.setBounds(0, 0, 700, 700);
        obj.setTitle("Notepad Editor");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AbsractFactory ThemeFactory = FactoryProducer.getFactory("color");

        obj.red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                TextAreaChanger color = ThemeFactory.getTheme("red");
                color.change(obj);
            }
        });
        obj.yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAreaChanger color = ThemeFactory.getTheme("yellow");
                color.change(obj);
            }
        });
        obj.blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAreaChanger color = ThemeFactory.getTheme("blue");
                color.change(obj);
            }
        });
        obj.white.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               TextAreaChanger color = ThemeFactory.getTheme("grey");
                color.change(obj);
            }
        });

        obj.CounterButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                if (obj.metin.getText().equals("")) {
                    JOptionPane.showMessageDialog(obj,
                            "Kelime Girilmedi" + " \"",
                            "notFind", JOptionPane.ERROR_MESSAGE);
                } else {
                    obj.CounterArea.setText("");
                    Context context = new Context(new OperationNoktalamaCounter());
                    obj.CounterArea.append("Noktalama işaret sayısı = " + context.executeStrategy(obj.metin));
                    obj.CounterArea.append("\n");

                    context = new Context(new OperationWordCounter());
                    obj.CounterArea.append("Kelime sayısı = " + context.executeStrategy(obj.metin));
                    obj.CounterArea.append("\n");

                    context = new Context(new OperationCharacterCounter());
                    obj.CounterArea.append("Karakter sayısı = " + context.executeStrategy(obj.metin));
                }
                //To change body of generated methods, choose Tools | Templates.
            }
        });

    }

}
