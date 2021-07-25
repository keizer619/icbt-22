/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author tharik
 */
public class Run {
    public static void main(String[] args) {   
        Person p1 = new Person();
        p1 = new Student("123V", "John", "ST00008");
        //Student st3 = new Person("123V", "John"); -> Impossbile
        p1 = new Lecturer("567V", "llll", "ST4569");
        
        Person [] persons = new Person[3];
        persons[0] = new Student("123V", "John", "ST00008");
        persons[1] = new Student("345V", "James", "ST0067");
        persons[2] = new Lecturer("567V", "Andrew", "ST4569");
        
        for (Person p : persons) {
            System.out.println(p.getName());
        }
    }   
}
