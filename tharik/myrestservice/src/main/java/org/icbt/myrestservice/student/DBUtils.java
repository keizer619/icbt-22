/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.myrestservice.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tharik
 */
public class DBUtils {
   //Not recommended to keep these in the sources, this is for demo purpose
   static final String DB_URL = "jdbc:mysql://localhost:3306/icbt_batch22";
   static final String USER = "";
   static final String PASS = "";
   static final String QUERY = "SELECT id, name, age FROM persons";
   
   public static List<Person> getPersons() { 
      List<Person> persons = new ArrayList<>();
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);		      
         while(rs.next()){
             Person p = new Person();
             p.setId(rs.getInt("id"));
             p.setName(rs.getString("name"));
             p.setAge(rs.getInt("age"));
             persons.add(p);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
      return persons;
   }
   
}
