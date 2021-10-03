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
    static final String USER = "icbt";
    static final String PASS = "icbt@123";
   
    public static boolean deletePerson(int id) { 
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         stmt.executeUpdate("DELETE FROM persons WHERE (id = '" + id + "')");	
         return true;
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
      return false;
    }
   
    public static boolean updatePerson(Person person) { 
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         stmt.executeUpdate("UPDATE persons "
                 + "SET name = '" + person.getName() + "', age = '" + person.getAge() + "' "
                 + "WHERE (id = '" + person.getId() + "')");	
         return true;
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
      return false;
    }
   
    public static boolean addPerson(Person person) { 
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         stmt.executeUpdate("INSERT INTO persons (id, name, age) "
                    + "VALUES ('" + person.getId() + "', "
                    + "'" + person.getName()+ "', "
                    + "'" + person.getAge()+ "')");	
         return true;
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
      return false;
   }
    
    public static Person getPerson(int id) { 
      Person person = null;
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT id, name, age FROM persons WHERE id=" + id);		      
         while(rs.next()){
             person = new Person();
             person.setId(rs.getInt("id"));
             person.setName(rs.getString("name"));
             person.setAge(rs.getInt("age"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
      return person;
   }
   
    public static List<Person> getPersons() { 
      List<Person> persons = new ArrayList<>();
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT id, name, age FROM persons");		      
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
