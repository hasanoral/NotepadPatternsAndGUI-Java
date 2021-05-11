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
public class ThemeFactory extends AbsractFactory{

   @Override
   TextAreaChanger getTheme(String color) {
   if(color.equalsIgnoreCase("red")) {
   return new ChangeRedTheme();
  }
  else if (color.equalsIgnoreCase("blue")) {
   return new ChangeBlueTheme();
  }
   else if(color.equalsIgnoreCase("grey")) {
   return new ChangeGreyTheme();
  }
   else if(color.equalsIgnoreCase("yellow")){
       return new ChangeYellowTheme();}
   return null;
   
}}
