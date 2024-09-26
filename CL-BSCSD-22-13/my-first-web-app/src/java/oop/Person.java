/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Amila
 */
public class Person {
    private String name;
    private String address;
    private int age;
    private String nic;
    
    
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getNic(){
        return this.nic;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setNic(String nic){
        this.nic = nic;
    }
}
