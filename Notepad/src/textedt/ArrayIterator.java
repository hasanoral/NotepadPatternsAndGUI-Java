/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textedt;

import java.util.Iterator;

/**
 *
 * @author kerem alp
 */
public class ArrayIterator implements Iterator{
    private String arrsplit[];
    private int sira;

    public ArrayIterator(String[] arrsplit) {
        this.arrsplit = arrsplit;
       
    }
    

    @Override
    public boolean hasNext() {
        if(sira < arrsplit.length){
            return true;
        }
        else
            return false;
    }

    @Override
    public Object next() {
        String string=arrsplit[sira];
        sira++;
        return string;
    }
    
    
}
