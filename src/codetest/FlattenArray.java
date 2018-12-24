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
 * @param <T>
 */
public class FlattenArray<T> {

    private final List<Object> arrayOutput;
    
    public FlattenArray() {
        arrayOutput = new ArrayList<>();
    }

    public List<Object> flattenArray(T[] arrayInput) {
        for (T arrayInputList : arrayInput) {
            if (isArray(arrayInputList)) {
                List<Object> flattenedArray = flattenArray((T[]) arrayInputList);
                arrayOutput.add(flattenedArray);
                break;
            } else {
                arrayOutput.add(arrayInputList);
            }
        }
        System.out.println("" + arrayOutput);
        return arrayOutput;
    }

    private boolean isArray(Object obj) {
        return obj != null && obj.getClass().isArray();
    }

}
