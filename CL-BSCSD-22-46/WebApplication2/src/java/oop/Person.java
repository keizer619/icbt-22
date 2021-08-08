/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author 94711
 */
public class Person {
    
      private String nic;
    private String name;
    private String gender;
    private String mobileNo;
    private String dob;

    public Person(String nic, String name, String gender, String mobileNo, String dob) {
        this.nic = nic;
        this.name = name;
        this.gender = gender;
        this.mobileNo = mobileNo;
        this.dob = dob;
    }
    
    public Person() {
        this.nic = "";
        this.name = "";
        this.gender = "";
        this.mobileNo = "";
        this.dob = "";
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
 
    
}
