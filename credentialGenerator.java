package com.lab.fop.it.admin.support;

import com.lab.fop.employee.*;

import java.util.Random;

public class credentialGenerator {
    int department;

    credentialGenerator(String firstName, String lastName, int department){
        setDepartment(department);
    }

    public void setDepartment(int department){
        this.department = department;
    }
    public String departmentName(int department){
        switch(department){
            case 1:
                return "tech";
            case 2:
                return "adm";
            case 3:
                return "hr";
            case 4:
                return "lgl";
             default:
                 System.out.println("Invalid Selection!!!!");
                 System.exit(0);
                 return " ";
        }

    }

    public char[] generatePassword(){
        String capLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String smallLetters = "qwertyuiopasdfghjklzxcvbnm";
        String specChar = "!@#$%^&*()_+<>?";

        String value = capLetters + smallLetters + specChar;
        Random random = new Random();
        char[] password = new char [8];

        for(int i=0; i<8;i++){
            password[i]=value.charAt(random.nextInt(value.length()));
        }
        return password;
    }

    public String generateEmailId(String firstName,String lastName,String departmentName){
        return firstName+"."+lastName+"@"+departmentName+".company.com";
    }

    public void showCredentials(employeeDetails emp, String email, char[] password,String firstName){
        System.out.println("Dear " +firstName+ " please find your credentials below: ");
        System.out.println("Email-Id: "+email);
        System.out.print("Password: ");
        System.out.print(generatePassword());
    }
}
