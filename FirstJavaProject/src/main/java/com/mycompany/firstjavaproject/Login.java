/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstjavaproject;

import static com.mycompany.firstjavaproject.FirstJavaProject.administrator;
import static com.mycompany.firstjavaproject.FirstJavaProject.homePage;
import java.util.Scanner;



/**
 *
 * @author MainPC_gneil
 */
public class Login implements function {
    
        private String user = "user";
        private String userPass = "user";        
        private String admin = "admin";
        private String adminPass = "admin";

    public String getUser() {
        return user;
    }

    public String getUserPass() {
        return userPass;
    }

    public String getAdmin() {
        return admin;
    }

    public String getAdminPass() {
        return adminPass;
    }

    @Override
    public void loginPage() {
        
            Login login = new Login();
            String admin = login.getAdmin();
            String adminPass = login.getAdminPass();
            String user = login.getUser();
            String userPass = login.getUserPass();
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("");
            System.out.println("***********************");
            System.out.println("*        LOGIN        *");
            System.out.println("***********************");
            System.out.println("");
            System.out.print("User : " + " ");
            String userInput = scanner.nextLine();
            System.out.print("Password : " + " ");
            String passwordInput = scanner.nextLine();


            if (userInput.equals(admin) && passwordInput.equals(adminPass)) {
                System.out.println("Hello Admin");
                administrator();
            }
            else if(userInput.equals(user) && passwordInput.equals(userPass)){
                System.out.println("Hello User!");
            }
            else{
                System.out.println("");
                System.out.println("ERROR: Invalid Credentials.");
                System.out.print("Press " +  "ENTER" + " to continue...");
                scanner.nextLine();
//                homePage(); // temporary disable 
            }
        }
}
