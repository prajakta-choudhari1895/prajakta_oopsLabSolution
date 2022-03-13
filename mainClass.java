package com.lab.fop.it.admin.support;
import com.lab.fop.employee.*;

import java.util.Scanner;

public class mainClass {

    public static void main(String args[]){
        String firstName, lastName;
        int department;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Welcome to the World of Company---------");
        System.out.println("Please help us with the below details to generate your credentials!");
        System.out.println("Enter your firstName: ");
        firstName = sc.next();
        System.out.println("Enter your lastName: ");
        lastName = sc.next();
        System.out.println("Please Select your Department: ");
        System.out.println("1. Technical" );
        System.out.println("2. Admin" );
        System.out.println("3. Human Resources" );
        System.out.println("4. Legal" );
        department = sc.nextInt();


        employeeDetails emp = new employeeDetails(firstName,lastName);
        credentialGenerator cg = new credentialGenerator(firstName,lastName, department);
        cg.showCredentials(emp,cg.generateEmailId(firstName,lastName, cg.departmentName(department)),cg.generatePassword(),firstName);

    }
}
