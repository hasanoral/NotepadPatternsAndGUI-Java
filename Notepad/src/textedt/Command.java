/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textedt;

import javax.swing.text.JTextComponent;

/**
 *
 * @author kerem alp
 */
public interface Command {
  void Execute(JTextComponent comp);
}
