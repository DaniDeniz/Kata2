/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] array = {1, 4, 7, 1, 1, 8, 4, 1, 4, 9};
        String[] array1 = {"Ana","Juan","Pedro","Juan","Pedro","Juan","Pedro"};
        
        Histogram<Integer> histo = new Histogram(array);
        HashMap<Integer, Integer> histogram = histo.getHisto();
        
        
        Histogram<String> histo1 = new Histogram(array1);
        HashMap<String,Integer> histogram1 = histo1.getHisto();
        

        for (Object key : histogram.keySet()) {
            System.out.println(key + ": "+ histogram.get(key));
        }
        
        for (Object key : histogram1.keySet()) {
            System.out.println(key + ": "+ histogram1.get(key));
        }

        // TODO code application logic here
    }

}
