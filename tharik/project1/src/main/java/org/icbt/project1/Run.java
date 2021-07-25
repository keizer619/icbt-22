/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.project1;

/**
 *
 * @author tharik
 */
public class Run {
    public static void main(String[] args) {   
        // Camel Case -> attributes , params
        int numberOfElements = 3;
        
        // Pascal Case -> Class names
        int NumberOfElements = 3;
        
        //Constants
        final int NUMBER_OF_ELEMENTS = 3;
        
        int size = 4;
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }   
        
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "James";
        names[2] = "Andrew";
        
        for (int i=0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        
        for (String name : names) {
            System.out.println(name);
        }
        
        
    }   
}
