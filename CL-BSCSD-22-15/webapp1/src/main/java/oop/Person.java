/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Bilaal
 */
public class Person {
    
    private String name;
    private String nic;
    private String phone;   
    private String dob;
    private String gender;
           
    public Person(String name, String nic, String phone, String dob, String gender) {
        this.name = name;
        this.nic = nic;
        this.phone = phone;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getNic() {
        return nic;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getDOB() {
        return dob;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }  
}
