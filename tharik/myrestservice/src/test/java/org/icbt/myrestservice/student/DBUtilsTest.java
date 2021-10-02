/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.myrestservice.student;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tharik
 */
public class DBUtilsTest {
    
    public DBUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    /**
     * Test of getPerson method, of class DBUtils.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");        
        Person person = new Person(88, "Andrew", 44);
        
        //Add the person
        boolean result = DBUtils.addPerson(person);
        assertEquals(true, result);

        //Check the added person
        Person resultPerson = DBUtils.getPerson(person.getId());
        assertEquals(person.getId(), resultPerson.getId());
        assertEquals(person.getName(), resultPerson.getName());
        assertEquals(person.getAge(), resultPerson.getAge());
        
        //Update the person
        person = new Person(88, "Andrew2", 54);
        result = DBUtils.updatePerson(person);
        assertEquals(true, result);
        
        //Check the added person
        resultPerson = DBUtils.getPerson(person.getId());
        assertEquals(person.getId(), resultPerson.getId());
        assertEquals(person.getName(), resultPerson.getName());
        assertEquals(person.getAge(), resultPerson.getAge());
        
        //Delete the person
        result = DBUtils.deletePerson(person.getId());
        resultPerson = DBUtils.getPerson(person.getId());
        assertEquals(null, resultPerson);
    }

  
    
}
