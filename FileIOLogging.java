package com.SeleniumWebDriver;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FileIOLogging {

	    public static void main(String[] args) {

	        // Hardcoded credentials
	        String validUsername = "admin";
	        String validPassword = "admin123";

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Username: ");
	        String username = sc.nextLine();

	        System.out.print("Enter Password: ");
	        String password = sc.nextLine();

	        // Get current date and time
	        LocalDateTime now = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	        String timeStamp = now.format(formatter);

	        try {
	            FileWriter writer = new FileWriter("results.txt", true);

	            if (username.equals(validUsername) && password.equals(validPassword)) {
	                System.out.println("Login Successful");
	                writer.write(timeStamp + " - Login Successful - Pass\n");
	            } else {
	                System.out.println("Access Denied");
	                writer.write(timeStamp + " - Login Failed - Fail\n");
	            }

	            writer.close();
	            System.out.println("Result saved in results.txt");

	        } catch (IOException e) {
	            System.out.println("Error writing to file.");
	            e.printStackTrace();
	        }

	        sc.close();
	    }
}


