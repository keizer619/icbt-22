/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;


import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author UNKNOWN_BRO
 */
public class Utils {

   
      public static List<Person> getPersons(){
      
          List<Person> persons = new ArrayList<>();
          
          persons.add(new Person("123v" , "john" , "12/10/2021" , "male" ));
          persons.add(new Person("123v" , "philip" , "16/11/2010" , "female"));
          persons.add(new Person("123v" , "nike" , "17/10/2014" , "male"));
          persons.add(new Person("123v" , "jorge" , "11/09/2014" , "male"));
          
          return persons;
          
      }
      
      public static String getPersonsHTML(){
          String output = "<table border='#0099ff' , border-collapse: 'collapse' , width: '8px'>";
          output += "<tr><th>NIC</th>"
                    +"<th>NAME</th>"
                    +"<th>DOB</th>"
                    +"<th>Gender</th>"
                  +"</tr>";
          
          for (Person p : Utils.getPersons()){
            output += "<tr>";
            output += "<td>" + p.getNic() + "</td>";
            output += "<td>" + p.getName() + "</td>";
            output += "<td>" + p.getDOB() + "</td>";
            output += "<td>" + p.getGender() + "</td>";
            output += "</tr>";
        }  
          output += "</table>";
      return output;
      }

       public static UserSession authinticate(String uname , String pwd){
       UserSession usersession = null;
           if(uname!= null && pwd != null &
                 uname.equals("ranula") && pwd.equals("123")){
                String sesid = UUID.randomUUID().toString().replace("-","").toUpperCase();
               usersession = new UserSession( "ranula" , "ranula" , "suwin" , "none", sesid );
       
       }
           
                   return usersession;
       }

       public static UserSession handleusersession(HttpServletRequest request,HttpServletResponse response, HttpSession session){
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        
        UserSession usersession = Utils.authinticate(uname, pwd);
        
        if(usersession == null ){
            for(Cookie cookie : request.getCookies()){
                if (cookie.getName().equals("sesid")){
                usersession  = (UserSession) session.getAttribute(cookie.getValue());

            }
                }
 
        }else{  
           
            session.setAttribute(usersession.getId(), usersession);
            Cookie cookie = new Cookie("sesid" , usersession.getId() );
            response.addCookie(cookie); 

        }
        return usersession;
       }

   
    }
    

