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
 * @author tharik
 */
public class Utils {
    
    public List<Person> getPersons() {
        
        List<Person> persons = new ArrayList<>();
        
        persons.add(new Person("123V", "John"));
        persons.add(new Person("223V", "George"));
        persons.add(new Person("323V", "James"));
        persons.add(new Person("423V", "Andrew"));
        
        return persons;
    }
    
}
