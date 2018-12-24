/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetest;

import java.util.Arrays;

/**
 *
 * @author henry
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] arrayInput = {1, 2, 3, new Object[]{4, 5, 6, new Object[]{7, 8, 9}}};
        System.out.println(Arrays.asList(arrayInput));
        FlattenArray flattenArray = new FlattenArray();
        System.out.println(flattenArray.flattenArray(arrayInput));
    }

}
