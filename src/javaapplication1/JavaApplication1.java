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
        int[] array = {1, 4, 7, 1, 1, 8, 4, 1, 4, 9};
        
        Histogram histo = new Histogram(array);
        HashMap<Integer, Integer> histogram = histo.getHisto();

        

        for (Integer key : histogram.keySet()) {
            System.out.println(key + ": "+ histogram.get(key));
        }

        // TODO code application logic here
    }

    private static void histograma(int[] array) {
    }
}
