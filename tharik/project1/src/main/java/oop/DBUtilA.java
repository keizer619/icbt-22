/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author root
 */
public abstract class DBUtilA {
    
    boolean connect() {
        //Common logic
        return true;
    }
    
    abstract boolean addStudent(Student student);  // [C]REATE
   
    abstract Student[] getStudents(); // [R]ead
        
    abstract boolean updateStudent(Student student); // [U]pdate
    
    abstract boolean deleteStudent(String id); // [D]elete
    
}
