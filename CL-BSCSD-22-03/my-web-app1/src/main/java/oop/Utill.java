/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Chanaka
 */
public class Utill {

    public static List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Roshan", "54657", "0715236589", "1990-05-26", "Male"));
        persons.add(new Person("Amali", "98414", "0774582658", "1986-08-15", "Female"));
        persons.add(new Person("Sudath", "63874", "0782463598", "1970-04-02", "Male"));
        persons.add(new Person("Hasini", "25896", "0725896354", "1991-10-20", "Female"));
        return persons;
    }

    public static boolean authenticate(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ((username != null) && (password != null) && (username.equals("admin")) && (password.equals("123"))) {
            String newSessionId = UUID.randomUUID().toString();
            session.setAttribute("session_id", newSessionId);
            Cookie newCookie = new Cookie("session_id", newSessionId);
            response.addCookie(newCookie);
            return true;
        } else {
            try {
                Cookie sessionCookie = null;
                Cookie[] cookies = request.getCookies();
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("session_id")) {
                        sessionCookie = cookie;
                    }
                }
                if (sessionCookie != null) {
                    String sessionId = session.getAttribute("session_id").toString();
                    if (sessionId.equals(sessionCookie.getValue())) {
                        return true;
                    }
                }
                return false;
            } catch (NullPointerException e) {
                return false;
            }
        }
    }

}
