package com.SeleniumWebDriver;

import java.util.Scanner;

public class conditionalloginvalidation {
	public static void main(String[] args) {
		String validusername ="Tejal";
		String validpassword = "tejal123";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Username : ");
		String username = sc.nextLine();
		
		System.out.print("Enter Passward : ");
		String password = sc.nextLine();
		
		if(username.equals(validusername) && password.equals(validpassword))
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Access Denied");
		}
		sc.close();
		
	}

}
