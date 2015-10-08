/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;


public class Histogram<T> {
    
    private final T[] vector;

    public Histogram(T[] vector) {
        this.vector = vector;
    }

    
    public HashMap<T,Integer> getHisto(){
        HashMap<T,Integer> map = new HashMap();
        for(int i = 0; i < vector.length; i++){
            if(!map.containsKey(vector[i])){
                map.put(vector[i], 1);
            } else {
                map.put(vector[i], map.get(vector[i])+1);
            }
        }
        return map;
    }
    
}
