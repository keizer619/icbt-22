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
public class App {
    
    
    public static void processStudentInfo(DBUtil util) {
        
               
        util.getStudents();
        util.addStudent(new Student());
        util.updateStudent(new Student());
        util.deleteStudent("ST001");
        
        
        
        
        
    }
    
}
