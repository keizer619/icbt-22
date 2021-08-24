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
public class Lecturer extends Person{
    
    private String epfNo;

    public Lecturer() {
        super();
        this.epfNo ="";
    }

    public Lecturer(String epfNo, String nic, String name) {
        super(nic, name);
        this.epfNo = epfNo;
    }

    public String getEpfNo() {
        return epfNo;
    }

    public void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
    }
     
}
