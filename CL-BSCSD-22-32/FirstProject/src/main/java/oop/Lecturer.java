/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Aryan Serasinghe
 */
public class Lecturer extends Person {
    
    private String epfNo;

    public Lecturer() {
        this.epfNo = "";
    }

    public Lecturer(String nic, String name, String epfNo) {
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
