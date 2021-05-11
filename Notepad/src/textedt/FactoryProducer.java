/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textedt;

/**
 *
 * @author kerem alp
 */
public class FactoryProducer {
  public static AbsractFactory getFactory(String choice) {
   if(choice.equalsIgnoreCase("color")) {
   return new ThemeFactory();
  
   }
     return null;

  }
}