package com.amanpreet.oops1;

import java.util.Scanner;

public class ShowClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first Name");
		String firstName = sc.nextLine();
		
		System.out.println("Please enter your last Name");
		String lastName = sc.nextLine();
		
		Employee emp = new Employee(firstName, lastName);
		
		System.out.println("Select your department \n1. Technical \n2. Admin \n3. Human Resources \n4. Legal");
		int department = sc.nextInt();
		
		EmployeeCredentials empCredentials = new EmployeeCredentials(emp);
		switch(department) {
		case 1: 
		{
			empCredentials.showCredentails("tech");

		}break;
		case 2: {
			empCredentials.showCredentails("admin");
		}break;
		case 3: {
			empCredentials.showCredentails("human");

		}break;
		case 4: {
			empCredentials.showCredentails("legal");

		}break;
		default: {}break;
		}

	}

}
