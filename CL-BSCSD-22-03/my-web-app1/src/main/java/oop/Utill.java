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
 * @author Chanaka
 */
public class Utill {

    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Roshan","54657","0715236589","1990-05-26","Male"));
        persons.add(new Person("Amali","98414","0774582658","1986-08-15","Female"));
        persons.add(new Person("Sudath","63874","0782463598","1970-04-02","Male"));
        persons.add(new Person("Hasini","25896","0725896354","1991-10-20","Female"));
        return persons;
    }

}
