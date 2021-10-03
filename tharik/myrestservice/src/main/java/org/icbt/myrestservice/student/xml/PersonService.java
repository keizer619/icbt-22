/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.myrestservice.student.xml;

import org.icbt.myrestservice.student.Person;


/**
 *
 * @author tharik
 */
public interface PersonService {
    public Response addPerson(Person p);

    public Response deletePerson(int id);
    
    public Response updatePerson(Person p);

    public Person getPerson(int id);

    public Person[] getAllPersons();
}
