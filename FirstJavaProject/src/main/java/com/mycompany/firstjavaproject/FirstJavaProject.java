/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstjavaproject;

import java.util.Scanner;

/**
 *
 * @author MainPC_gneil
 */
public class FirstJavaProject {

    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while(running){
            System.out.println("***********************");
            System.out.println("* Welcome to My Shop! *");
            System.out.println("***********************");
            System.out.println("1 - Login");
            System.out.println(".......................");
            System.out.println("0 - Exit");
            System.out.print("What do you want to do?");
            
            String input = scanner.nextLine();
            
            switch (input) {
                case "1":
                    System.out.println("Login part");
                    Login();
                    running = false;
                    break;
                case "2":
                    System.out.println("Thank you for using our services!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    running = false;
                    break;
            }
        }
    }
    
    private static void Login(){
        String user = "user";
        String userPass = "user";        
        String admin = "admin";
        String adminPass = "admin";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("User :" + " ");
        String userInput = scanner.nextLine();
        System.out.print("Password :" + " ");
        String passwordInput = scanner.nextLine();
        
        
        
        if (userInput.equals(admin) && passwordInput.equals(adminPass)) {
            System.out.println("Hello Admin");
        }
        else if(userInput.equals(user) && passwordInput.equals(userPass)){
            System.out.println("Hello User!");
        }
        else{
            System.out.println("Wrong Credentials");
        }
    }
}
