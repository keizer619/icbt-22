/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    
    public static UserSession authenticate(String username, String password) {
        UserSession userSession = null;
        //Should authenticate from a DB
        if( username != null && password != null &
                username.equals("john") && password.equals("123")) {
            userSession = new UserSession("john", "John", "Smith", "None");
        }
        return userSession;
    }
    
    
    public static UserSession handleUserSession(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
          String username = request.getParameter("username");
          String password = request.getParameter("password");
          
          UserSession userSession = Utils.authenticate(username, password);
          
          if (userSession == null) {
              // If username and password is incorrect
              for (Cookie cookie : request.getCookies()) {
                  if (cookie.getName().equals("sesid")) {
                      userSession = (UserSession) session.getAttribute(cookie.getValue());  
                  }
              }
          } else {
             //If username and password is correct
             String sesid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
             session.setAttribute(sesid, userSession);
             Cookie cookie = new Cookie("sesid", sesid);
             response.addCookie(cookie);   
          }
          
          return userSession;
    }

    
}
