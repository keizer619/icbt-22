/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Chanaka
 */
public class Run {
    
    public static void main(String[] args) {
        
        Person persons[] = new Person[3];
        
        persons[0]=new Student("ST001", "001", "Jane");
        persons[1]=new Student("ST002", "002", "John");
        persons[2]=new Lecturer("LT001", "003", "Andrew");
        
        for (Person person : persons) {
            System.out.println(person.getName());
        }
        
    }
    
}
