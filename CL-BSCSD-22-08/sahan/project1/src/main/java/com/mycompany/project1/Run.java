/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1;

/**
 *
 * @author Sahan Elvitigala
 */
public class Run {
    public static void main(String[] args){
        
        int count = 4;
        
        for(int i = 0; i < count; i++){
            for(int j = 0; j < count; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
