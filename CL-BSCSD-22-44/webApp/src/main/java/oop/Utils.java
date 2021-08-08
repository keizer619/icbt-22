/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class Utils {
    
     public List<Person> getPersons() {
        
        List<Person> persons = new ArrayList<>();
        
        persons.add(new Person("123V", "John", "Male", "0112892827","20/09/1999"));
        persons.add(new Person("371V", "Sara", "Female", "0112456778","08/02/1989"));
        persons.add(new Person("256V", "Peter", "Male", "0771742570","10/09/2000"));
        persons.add(new Person("146V", "Kumar", "Male", "075682971","09/02/2001"));
        
        return persons;
    }
    
}
