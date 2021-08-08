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
public class Person {

    private String nic;
    private String name;

    public Person() {
        this.nic = "";
        this.name = "";
    }

    public Person(String nic, String name) {
        this.nic = nic;
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
