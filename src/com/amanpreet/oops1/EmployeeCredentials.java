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
		String email = emp.getFirstName()+emp.getLastName()+"@"+department+"."+emp.getCompanyName()+"."+"com";
		return email;
	}
	public void showCredentails(String department) {
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows ");
		System.out.println("Email -->"+ GenerateEmail(department));
		System.out.println("Password -->"+generatePassword());
		
	}
	
	public String generatePassword() {
		  String[] charCategories = new String[] {
		            "abcdefghijklmnopqrstuvwxyz",
		            "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
		            "0123456789", "@#$%"
		   
		    };
		 
		  StringBuilder password = new StringBuilder(8);
	        Random random = new Random(System.nanoTime());

	        for (int i = 0; i < 8; i++) {
	            String charCategory = charCategories[random.nextInt(charCategories.length)];
	            int position = random.nextInt(charCategory.length());
	            password.append(charCategory.charAt(position));
	        }

	        return new String(password);
	}
}
