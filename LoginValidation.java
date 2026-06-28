package com.SeleniumWebDriver;

import java.util.Scanner;

// Custom Exception
class InvalidLoginException extends Exception {

    public InvalidLoginException(String message) {
        super(message);
    }
}

public class LoginValidation {

    // Method to validate login
    public static void validateLogin(String username, String password)
            throws InvalidLoginException {

        String validUsername = "admin";
        String validPassword = "admin123";

        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Login Successful");
        } else {
            throw new InvalidLoginException("Invalid Username or Password");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try {
            validateLogin(username, password);
        } catch (InvalidLoginException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        sc.close();
    }
}