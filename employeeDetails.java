package com.lab.fop.employee;

public class employeeDetails {

    public String firstName, lastName;


    public employeeDetails(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

}
