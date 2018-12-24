/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetest;

/**
 *
 * @author henry
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] arrayInput = {"Test1", "Test2", "Test 3", new Object[]{"Test 4", "Test 5", "Test 6", new Object[]{7, 8, 9}}};
        FlattenArray flattenArray = new FlattenArray();
        System.out.println(flattenArray.flattenArray(arrayInput));
    }

}
