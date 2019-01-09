package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientAddress {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml"); //default constructor will be called
        //this will create four objects as four beans are present in xml file in "<beans>" container.

        //will do the typecasting cuz it is returning a string but it is an object of employee class
        EmployeeAddress e1 = (EmployeeAddress) context.getBean("empAddConstructorInjection");  //setter getter will work here
        System.out.println("Employee details " + e1);   //it will call toString

        EmployeeAddress e2 = (EmployeeAddress) context.getBean("empAddSetterInjection");  //setter getter will work here
        System.out.println("Employee details " + e2);   //it will call toString

        //explicit destructor
        ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
        cxt.close(); //close the context
    }
}
