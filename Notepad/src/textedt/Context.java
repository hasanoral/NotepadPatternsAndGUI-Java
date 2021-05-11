/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textedt;

import javax.swing.JTextArea;

/**
 *
 * @author kerem alp
 */
public class Context {
  
    
    private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(JTextArea t){
      return strategy.doCount(t);
   }
    
}
