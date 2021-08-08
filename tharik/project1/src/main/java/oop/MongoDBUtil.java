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
public class MongoDBUtil implements DBUtil {

    public Student[] getStudents() {
        Student [] students = new Student[5];
        return students;   
    }
    
    public boolean addStudent(Student student) {
        
        //Code to add record to DB
        
        return true;
    }
    
    public boolean updateStudent(Student student) {
        
        //Code to update record to DB
        
        return true;
    }
    
    public boolean deleteStudent(String id) {
        
        //Code to delete record to DB
        
        return true;
    }
    
}