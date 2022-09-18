package com.amanpreet.oops1;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeCredentials {
	Employee emp;
	EmployeeCredentials(Employee emp){
		this.emp = emp;
	}

	public String GenerateEmail(String department)
	{
		String email = emp.getFirstName()+emp.getLastName()+"@"+department+".abc.com";
		return email;
	}
	public void showCredentails(String department) {
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows ");
		System.out.println("Email --> "+ GenerateEmail(department));
		System.out.println("Password --> "+generatePassword());
		
	}
	
	public String generatePassword() {
		 
		  String lowerCase =  "abcdefghijklmnopqrstuvwxyz";
		  String upperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
		  String numbers = "1234567890";
		  String specialCase = "@#$%&";
		  String completeCases = lowerCase+upperCase+numbers+specialCase;
		 
		  StringBuilder password = new StringBuilder(8);
	        Random random = new Random(System.nanoTime());
	        password.append(lowerCase.charAt(random.nextInt(lowerCase.length())));
	        password.append(upperCase.charAt(random.nextInt(upperCase.length())));
	        password.append(numbers.charAt(random.nextInt(numbers.length())));
	        password.append(specialCase.charAt(random.nextInt(specialCase.length())));
	        for (int i = 0; i < 4; i++) {
	            password.append(completeCases.charAt(random.nextInt(completeCases.length())));
	        }

	        return new String(password);
	}
}
