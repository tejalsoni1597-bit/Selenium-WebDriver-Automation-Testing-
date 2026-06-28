package com.SeleniumWebDriver;
import java.util.HashMap;
import java.util.Map;

public class MultiUserLogin {
	public static void main(String[] args) {

        // Store multiple username-password pairs
        HashMap<String, String> users = new HashMap();

        users.put("admin", "admin123");
        users.put("tejal", "tejal123");
        users.put("john", "john123");
        users.put("user1", "pass123");

        // Valid credentials
        String validUsername = "admin";
        String validPassword = "admin123";

        // Batch login simulation
        for (Map.Entry<String, String> entry : users.entrySet()) {

            String username = entry.getKey();
            String password = entry.getValue();

            System.out.println("Testing Login for: " + username);

            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Access Denied");
            }

            System.out.println("----------------------");
        }

}
}
