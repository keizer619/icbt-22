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
public class Student extends Person {
    
    private String id;

    public Student() {
        this.id = "";
    }
   
    public Student(String nic, String name, String id) {
        super(nic, name);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public void test() {
        System.out.println("test student");
    }
}
