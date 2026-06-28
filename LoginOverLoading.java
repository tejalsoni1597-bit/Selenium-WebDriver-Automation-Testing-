package com.SeleniumWebDriver;

public class LoginOverLoading 
{
	 public void login(String username, String password)
	 {
	        System.out.println("Login using Username and Password");
	        System.out.println("Username: " + username);
	        System.out.println("Password: " + password);
	        System.out.println("Login Successful");
	        System.out.println();
	 }
	 public void login(String username, String password, int otp)
	 {
	        System.out.println("Login using Username, Password, and OTP");
	        System.out.println("Username: " + username);
	        System.out.println("Password: " + password);
	        System.out.println("OTP: " + otp);
	        System.out.println("Login Successful");
	        System.out.println();
	 }
	 public void login(long phoneNumber, String password)
	 {
	        System.out.println("Login using Phone Number and Password");
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Password: " + password);
	        System.out.println("Login Successful");
	        System.out.println();
	 }

	    public static void main(String[] args) 
	    {
	        LoginOverLoading obj = new LoginOverLoading();
	        obj.login("admin", "admin123");
	        obj.login("admin", "admin123", 123456);
	        obj.login(9876543210L, "admin123");
	    }
}
