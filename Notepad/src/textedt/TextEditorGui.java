/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textedt;

import com.sun.crypto.provider.HmacPKCS12PBESHA1;
import java.awt.Color;
import static java.awt.Color.red;
import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;


public class TextEditorGui extends javax.swing.JFrame {
       
    
    


    Fonksiyonlar a = new Fonksiyonlar();//classtan fonksiyon çağırmak için nesene oluşturuldu
    String filename;

    
    public TextEditorGui() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        searchTextArea = new javax.swing.JTextField();
        changetextarea = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        exitFile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        search.setText("Arama");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        searchTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextAreaActionPerformed(evt);
            }
        });

        change.setText("Değiştir");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        changetextarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changetextareaActionPerformed(evt);
            }
        });

        başaatla.setText("bulunan metin için başa atla");
        başaatla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                başaatlaActionPerformed(evt);
            }
        });

        backspace.setText("Geri Al");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        search1.setText("Kontrol et");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        backspace1.setText("Metini Geri Al");
        backspace1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspace1ActionPerformed(evt);
            }
        });

        metin.setColumns(20);
        metin.setRows(5);
        jScrollPane2.setViewportView(metin);

        CounterArea.setColumns(20);
        CounterArea.setRows(5);
        jScrollPane1.setViewportView(CounterArea);

        CounterButton.setText("Metin Bilgileri Yaz");
        CounterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CounterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(changetextarea, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(başaatla, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(searchTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(backspace))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(backspace1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CounterButton)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspace)
                    .addComponent(search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(change)
                    .addComponent(changetextarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(başaatla))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backspace1)
                    .addComponent(search1)
                    .addComponent(CounterButton))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        jMenu1.add(newFile);

        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveFile);

        exitFile.setText("Exit");
        exitFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFileActionPerformed(evt);
            }
        });
        jMenu1.add(exitFile);

        jMenu2.setText("Change Color");

        red.setText("Red");
        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });
        jMenu2.add(red);

        yellow.setText("Yellow");
        yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowActionPerformed(evt);
            }
        });
        jMenu2.add(yellow);

        blue.setText("Blue");
        blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueActionPerformed(evt);
            }
        });
        jMenu2.add(blue);

        white.setText("Grey");
        white.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteActionPerformed(evt);
            }
        });
        jMenu2.add(white);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextAreaActionPerformed

    }//GEN-LAST:event_searchTextAreaActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        metin.setText("");
        setTitle(filename);


    }//GEN-LAST:event_newFileActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        FileDialog fileDialog = new FileDialog(TextEditorGui.this, "open file", FileDialog.LOAD);
        fileDialog.setVisible(true);
        if (fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();//açılacak dosyanın path i alınıyor
            setTitle(filename);
        }
        a.openFile(new File(filename), metin);//dosyanın açıldığı fonksiyon


    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        FileDialog fileDialog = new FileDialog(TextEditorGui.this, "Save File", FileDialog.SAVE);
        fileDialog.setVisible(true);
        if (fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        try {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(metin.getText());
            setTitle(filename);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("File Not Found");

        }


    }//GEN-LAST:event_saveFileActionPerformed

    private void exitFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileActionPerformed
        System.exit(0);

    }//GEN-LAST:event_exitFileActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            findNextWithSelection();//arama fonksiyonu
        } catch (BadLocationException ex) {
            Logger.getLogger(TextEditorGui.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_searchActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        try {
            replaceNext();//kelime değiştirme fonksiyonu

        } catch (BadLocationException ex) {
            Logger.getLogger(TextEditorGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_changeActionPerformed

    private void changetextareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changetextareaActionPerformed

    }//GEN-LAST:event_changetextareaActionPerformed

    private void başaatlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_başaatlaActionPerformed
        
    }//GEN-LAST:event_başaatlaActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
  BackSpace back = new BackSpace();
  Command com=new BackSpaceCommand(back);
  Invoker b = new Invoker(com,searchTextArea);


  
  b.Execute();    }//GEN-LAST:event_backspaceActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        try {
            
            LexicalCont(metin);//Kontrol et butonun program gerekliliklerini(kelimeler arası noktalama işaretleri gibi) test ettiği fonksiyon
            
        } catch (BadLocationException ex) {
            Logger.getLogger(TextEditorGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TextEditorGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_search1ActionPerformed
   
    
    
    public void LexicalCont(JTextArea t) throws BadLocationException, IOException {
        String metin = t.getText();//Yazılan metini kullanmak için stringe çeviriliyor.

        StringBuilder sb = new StringBuilder(metin);
        for (int j = 0; j < sb.toString().length(); j++) {
            if (sb.charAt(j) == '-') {
                sb.deleteCharAt(j);//full-text olarak verilen yazı için birleştirme işlemi yapıyor fulltext haline getiriyor.
            }

        }

        String[] arrSplit = sb.toString().split(",|\\.|\\;|\\ |\\\n");//istenilen ayıraçlara göre kelimelere bölüyor.
        sb = new StringBuilder();//string builderı içinde JTextAreadan gelen metin olduğu için boş olarak tekrar tanımlandı arrSplit içine yazılacak
        Iterator ArrayIterator =new ArrayIterator(arrSplit);

        while (ArrayIterator.hasNext()) {
          
            
       
            sb.append(ArrayIterator.next());
            txtToArray(sb.toString());//wordste kontrol eden fonksiyon.
            for (int q = 0; q < sb.toString().length(); q++) {//Eğer yazımızda bir sayı varsa bunu doğru kabul edecek
                char sayı = sb.toString().charAt(q);
                if (sayı >= '0' && sayı <= '9') {
                    positionerr = 0;
                }
            }

            if (positionerr == 1) {//eğer positionerr=1 se kelimemiz bulunamamıştır eğer single transposition varsa diye kontrolleri yapılır

                String temp = sb.toString();//hangi kelime yok onu bastırmak için

                if (sb.toString().length() >= 1) {
                    JOptionPane.showMessageDialog(this,
                            "Cannot find" + " \"" + temp + " \"",
                            "notFind", JOptionPane.ERROR_MESSAGE);
                    for (int k = 0; k < sb.toString().length(); k++) {

                        if (k + 1 < sb.toString().length()) {//single trans yapmak için döngü
                            char d2 = sb.toString().charAt(k + 1);//değiştirilecek harfler single trans k ile k+1.harf  
                            char d1 = sb.toString().charAt(k);//0
                            //default --> doğru    dfeault chartat1 <-> charat2 replace        
                            sb.setCharAt(k + 1, d1);//0 1 - 1 2 - 2 3 - 3 4  ... harflerin değiştirildiği yer
                            sb.setCharAt(k, d2);
                            System.out.println(sb.toString());
                            txtToArray(sb.toString()); //yeni kelime kontrol ediliyor ve possitionerr güncelleniyor
                            if (positionerr == 1) {

                                System.out.println("temp--> " + temp);
                                sb.delete(0, sb.length());//sb yi 0 lamak için
                                sb.append(temp);//olmayan kelimeyi sb ye ekledik
                            } else {
                                JOptionPane.showMessageDialog(this,
                                        "Cannot find" + " \"" + temp + " \" ==>" + " \"" + "" + sb.toString() + "\"mi demek istediniz" + " \"",
                                        "notFind", JOptionPane.PLAIN_MESSAGE);
                                searchTextArea.setText(temp);
                                changetextarea.setText(sb.toString());
                                findNextWithSelection();
                                replaceNext();

                            }

                        }
                    }//for bitiş
                }

                sb.delete(0, sb.length());
            } else {//Eğer doğruysadoğru mesajı veriliyor
                JOptionPane.showMessageDialog(this,
                        " find" + " \"" + sb.toString() + " \"",
                        "Find", JOptionPane.PLAIN_MESSAGE);

                sb.delete(0, sb.length());
            }
        } //for silinecek

    }

    private void backspace1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspace1ActionPerformed
  BackSpace back = new BackSpace();
  Command com=new BackSpaceCommand(back);
  Invoker b = new Invoker(com,metin);
  b.Execute();
         
    }//GEN-LAST:event_backspace1ActionPerformed

    private void blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blueActionPerformed

    private void redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redActionPerformed

    private void yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yellowActionPerformed

    private void whiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_whiteActionPerformed

    private void CounterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CounterButtonActionPerformed
        
        
        
        
    }//GEN-LAST:event_CounterButtonActionPerformed
    class myHiglighter extends DefaultHighlighter.DefaultHighlightPainter {//Kelimeyi belirtmeye yarayan Boyama classı

        public myHiglighter() {
            super(Color.green);
        }
    }

    DefaultHighlighter.HighlightPainter highlighter = new myHiglighter();

    public void removeHighlight(JTextComponent textComp) {//Markerla boyanmış yazıyı kaldırmaya yarayan fonksiyon
        Highlighter removeHighlighter = textComp.getHighlighter();
        Highlighter.Highlight[] remove = removeHighlighter.getHighlights();
        for (int i = 0; remove.length > i; i++) {
            if (remove[i].getPainter() instanceof myHiglighter) {
                removeHighlighter.removeHighlight(remove[i]);

            }

        }
    }
    public int lastIndex;

    int findDown() {//Aranan kelimeyi imlecin sağına veya altına doğru arayan fonksiyon
        String s1 = metin.getText();
        String s2 = searchTextArea.getText();

        lastIndex = 0;
        int selStart = metin.getSelectionStart();
        int selEnd = metin.getSelectionEnd();

        if (selStart != selEnd) {
            lastIndex = selStart + 1;
        }
        if (!başaatla.isSelected())// seçili değilse en son bulduğu kelimede kalır
        {
            lastIndex = s1.toUpperCase().indexOf(s2.toUpperCase(), lastIndex);
        } else {//eğer bu seçenek işaretliyse en son bulduğu kelimeden sonra ilk bulduğu kelimeye atlar
            lastIndex = s1.toUpperCase().indexOf(s2.toUpperCase(), lastIndex);
            if (lastIndex == -1) {
                return lastIndex = s1.toUpperCase().indexOf(s2.toUpperCase(), lastIndex);//ilk bulduğuna başa dönecek ve loopa alacak programı artık bulunamadı hatası verilmeyecek

            }
        }

        return lastIndex;
    }

    public void findNextWithSelection() throws BadLocationException {
        int idx = findDown();// eğer aranan kelime yoksa -1 dönecek

        if (idx != -1)//yeni kelime varsa bir diğerine atlamak için eskisinin boyasını silecek ve yenisine geçecek
        {
            Highlighter hilight = metin.getHighlighter();
            metin.setSelectionStart(idx);
            metin.setSelectionEnd(idx + searchTextArea.getText().length());
            removeHighlight(metin);
            hilight.addHighlight(idx, idx + searchTextArea.getText().length(), highlighter);
        } //eğer  kelime yoksa hata verecek
        else {
            JOptionPane.showMessageDialog(this,
                    "Cannot find in search" + " \"" + searchTextArea.getText() + "\"",
                    "notFind", JOptionPane.ERROR_MESSAGE);

        }
    }
    int positionerr;//kelimenin wordsta var mı yok mu olduğunu belirlemek için bir değişken ataması 1 ise kelime bulunamamıştır,0 ise bulunmuştur

    public void txtToArray(String s) throws FileNotFoundException, IOException {
        ArrayList liste = new ArrayList<>(); // bir ArrayList Oluşturduk...

        // Yeni bir okuyucu oluşturduk...
        BufferedReader oku = new BufferedReader(new FileReader(
                "words.txt"));

        // Okuduklarımızı bir string değişkenine atıyoruz burda
        while (true) {
            String yazi = oku.readLine();
            if (yazi == null) { //burda yazının sonu gelme durumunu kontrol ettik
                break; // eğer sona gelinmişse döngüyü sonlandır dedik
            }
            liste.add(yazi); // listeye ekleme işlemi yapıldı
        }

        // okunan dosyayı kapatıyoruz
        oku.close();

        if (liste.indexOf(s) == -1) {//kelime yoksa positionerr'i 1 olarak belirliyoruz

            positionerr = 1;
        } else {//varsa positionerr'i 0 olarak belirliyoruz

            positionerr = 0;

        }

    }

    void replaceNext() throws BadLocationException {

        if (metin.getSelectionStart() == metin.getSelectionEnd()) {
            findNextWithSelection();
            return;
        }

        String searchText = searchTextArea.getText();
        String temp = metin.getSelectedText();//get selected text

        //eğer aradığımız kelime metinimizde varsa değiştirmesi için kontroller yapılıyor
        if (temp.equalsIgnoreCase(searchText))
        {
            metin.replaceSelection(changetextarea.getText());
        }
        removeHighlight(metin);
    }

    
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TextEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public final javax.swing.JTextArea CounterArea = new javax.swing.JTextArea();
    public final javax.swing.JButton CounterButton = new javax.swing.JButton();
    public final javax.swing.JButton backspace = new javax.swing.JButton();
    public final javax.swing.JButton backspace1 = new javax.swing.JButton();
    public final javax.swing.JCheckBox başaatla = new javax.swing.JCheckBox();
    public final javax.swing.JMenuItem blue = new javax.swing.JMenuItem();
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    public final javax.swing.JButton change = new javax.swing.JButton();
    private javax.swing.JTextField changetextarea;
    private javax.swing.JMenuItem exitFile;
    public final javax.swing.JMenu jMenu1 = new javax.swing.JMenu();
    public final javax.swing.JMenu jMenu2 = new javax.swing.JMenu();
    public final javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
    public final javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public final javax.swing.JTextArea metin = new javax.swing.JTextArea();
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    public final javax.swing.JMenuItem red = new javax.swing.JMenuItem();
    private javax.swing.JMenuItem saveFile;
    public final javax.swing.JButton search = new javax.swing.JButton();
    public final javax.swing.JButton search1 = new javax.swing.JButton();
    private javax.swing.JTextField searchTextArea;
    public final javax.swing.JMenuItem white = new javax.swing.JMenuItem();
    public final javax.swing.JMenuItem yellow = new javax.swing.JMenuItem();
    // End of variables declaration//GEN-END:variables
}
