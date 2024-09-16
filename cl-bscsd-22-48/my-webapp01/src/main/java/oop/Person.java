package oop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UNKNOWN_BRO
 */
public class Person {
   private String nic;
    private String name;
    private String dob;
    private String gender;
    private String id;
    
    public Person() {
        this.nic = "";
        this.name = "";
        this.dob = "";
        this.gender = "";
     
    }
    
    public Person(String nic, String name , String dob , String gender) {
        this.nic = nic;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
     
        
    }

    Person(String v, String john) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public String getDOB() {
        return dob;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    public void test() {
        System.out.println("test");
    }


    
}
