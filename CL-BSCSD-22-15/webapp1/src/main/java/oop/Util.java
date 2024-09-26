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
 * @author Bilaal
 */
public class Util {
    
    public List<Person> getPersons() {
        
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("James","5124v","071","1980/8/8","Male"));
        persons.add(new Person("Andrew","6524v","072","1979/7/7","Male"));
        persons.add(new Person("Sid","9578v","075","1975/9/8","Male"));
        persons.add(new Person("Kezia","9682v","076","1988/10/11","Female"));
        persons.add(new Person("Sanujan","8425v","077","1980/5/5","Male"));
        
        return persons;
    }  
}
