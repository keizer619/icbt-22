/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mu;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author tharik
 */
@WebService(serviceName = "MyWebService")
public class MyWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "num1") int num1, @WebParam(name = "num2")  int num2) {
        return num1 + num2;
    }
    
    @WebMethod(operationName = "getPerson")
    public Person getPerson(){ 
        return new Person("123V", "George Smith", "Male", "077", "1980");
    }
}
