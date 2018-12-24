/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author henry
 */
public class FlattenArray<T> {
    
    private final List<Object> arrayOutput = new ArrayList<>();
    
    public FlattenArray() {
        
    }
    
    public List<Object> flattenArray(T[] arrayInput) {
        
        for (int i = 0; i < arrayInput.length; i++) {
            if(isArray(arrayInput[i])) {
                arrayOutput.add(flattenArray((T[])arrayInput[i]));
            } else {
                arrayOutput.add(arrayInput[i]);
            }
        }
        return arrayOutput;
    }
    
    private boolean isArray(Object obj) {
        return obj!=null && obj.getClass().isArray();
    }
    
}
