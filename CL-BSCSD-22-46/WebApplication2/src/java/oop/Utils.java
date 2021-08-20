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
 * @author 94711
 */
public class Utils {
    

    public static List<Person> getPersons() {
        
        List<Person> persons = new ArrayList<>();
        
        persons.add(new Person("123V", "John", "Male", "077", "1988"));
        persons.add(new Person("223V", "Ann", "Female", "076", "1991"));
        persons.add(new Person("323V", "Jane", "Female", "071", "1990"));
        persons.add(new Person("423V", "Andrew", "Male", "075", "1993"));
        persons.add(new Person("523V", "George", "Male", "072", "1987"));
        return persons;
    }
    
    
    public static String getPersonsHTML() {
        String output = " ";
        for (Person p : Utils.getPersons()) {
            output += "<tr>";
            output += "<td class='custom-tble-content'>" + p.getName() + "</td>";
            output += "<td class='custom-tble-content'>" + p.getNic()+ "</td>";
            output += "<td class='custom-tble-content'>" + p.getGender()+ "</td>";
            output += "<td class='custom-tble-content'>" + p.getMobileNo()+ "</td>";
            output += "<td class='custom-tble-content'>" + p.getDob()+ "</td>";
            output += "</tr>";
        }
        return output;
    }
    
        public static boolean authenticate(String username, String password) {
        
        return username != null && password != null &
                username.equals("john") && password.equals("123");
    }
    
}
