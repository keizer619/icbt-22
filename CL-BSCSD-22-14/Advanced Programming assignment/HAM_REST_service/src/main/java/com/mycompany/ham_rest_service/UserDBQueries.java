/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ham_rest_service;

import com.mycompany.ham_rest_service.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class UserDBQueries {
    
      public static User getUser(String Username) { 
      User user = null;
      try {
         DBConnection user_dbcon = DBConnection.getInstance();
         Statement stmt = user_dbcon.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT Username, Password FROM user WHERE Username=" + Username);
         
         while(rs.next()){
             user = new User();
             user.setUsername(rs.getString("Username"));
             user.setPassword(rs.getString("Password"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
      return user;
   }
    
}
