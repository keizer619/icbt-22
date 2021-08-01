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
public interface DBUtil {
    
    boolean addStudent(Student student);  // [C]REATE
   
    Student[] getStudents(); // [R]ead
        
    boolean updateStudent(Student student); // [U]pdate
    
    boolean deleteStudent(String id); // [D]elete
    
}
