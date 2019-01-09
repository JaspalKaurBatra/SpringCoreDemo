package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        //Object Construction | By the developer
        Employee eRef = new Employee(101, "JOhn", "heyo");
    /*
        //Spring Way | Inversion of Control
        Resource resource = new ClassPathResource("employeebean.xml");
        BeanFactory factory = new XmlBeanFactory(resource); // spring controller
        Employee e1 = (Employee) factory.getBean("emp"); //factory creates objects, bean is an object, getting that bean or object
        //or // Employee e1 = factory.getBean("emp",Employee.class);
        System.out.println("Employee details " + e1);   //it will call toString
    */

        //Spring Way | Inversion of Control
        ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml"); //default constructor will be called here
        //will do the typecasting because it is returning a string but it is an object of employee class
        Employee e1 = (Employee)context.getBean("emp");  //setter getter will work here
        System.out.println("Employee details " + e1);   //it will call toString

        //explicit destructor
        ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
        cxt.close(); //close the context
    }
}