/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author usuario
 */
public class BuildHisto {
    
    public static <T> Histogram <T> cumputHisto(T[] vector){
        Histogram <T> histo = new Histogram<>();
        for(T key : vector){
            histo.increment(key);
        }
        return histo;
    }
    
}
