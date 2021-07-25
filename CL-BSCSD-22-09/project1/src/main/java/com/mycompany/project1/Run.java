/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1;

/**
 *
 * @author vgnpr
 */
public class Run {
    public static void main(String[] args) {
        int limit = 4;
        
        for ( int x = 0; x < limit; x++  ){
            for ( int y = 0; y < limit; y++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
