/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author UNKNOWN_BRO
 */
public class UserSession {
    
    private String userName;
    private String firstName;
    private String lastName;
    private String remarks;
    private String id;
   

    public UserSession() {
    }

    public UserSession(String userName, String firstName, String lastName, String remarks , String id) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.remarks = remarks;
        this.id = id;
    }

   

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
}
