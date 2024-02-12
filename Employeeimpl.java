package com.fundamentals;

import org.testng.Assert;

public class Employeeimpl {

    public static void main(String[] args) {

        Employee emp1= new Employee("csp", 230);
        Employee emp2= new Employee("dff", 23);

        Assert.assertEquals(emp1, emp2);
        
    }
    
}
