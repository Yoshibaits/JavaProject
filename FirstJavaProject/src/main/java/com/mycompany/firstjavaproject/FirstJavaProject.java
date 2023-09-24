/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstjavaproject;

import java.util.Scanner;

/**
 *
 * @author MainPC_gneil
 */
public class FirstJavaProject{
    
    public static void main(String[] args) {
        homePage();
    
    }
    
    public static void homePage(){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while(running){
            System.out.println("***********************");
            System.out.println("* Welcome to My Shop! *");
            System.out.println("***********************");
            System.out.println("1 - Login");
            System.out.println(".......................");
            System.out.println("0 - Exit");
            System.out.println("");
            System.out.print("What do you want to do? ");
            
            
            String input = scanner.nextLine();
            
            switch (input) {
                case "1":
                    loginPage();
                    running = false;
                    break;
                case "0":
                    System.out.println("");
                    System.out.println("Thank you for using our services!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    System.out.println("");
                    running = false;
                    break;
            }
        }
    }
    
    public static void loginPage(){
        
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
                homePage();
            }
        }
    public static void administrator(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("");
            System.out.println("***********************");
            System.out.println("*    ADMINISTRATOR    *");
            System.out.println("***********************");
            System.out.println("");
            System.out.println("1 - Manage Products");
            System.out.println(".......................");
            System.out.println("2 - Manage Orders");
            System.out.println("");
            System.out.println("0 - Logout");
            System.out.println("");
            System.out.print("What do you want to do? ");
            
            String input = scanner.nextLine();
            
            switch (input) {
            case "1":
                System.out.println("MANAGE PRODUCTS");
                break;
                
            case "2":
                System.out.println("MANAGE ORDERS");
                break;
            case "0":
                System.out.println("LOGOUT");
                break;
            default:
                System.out.println("INVALID CHOICE");
                System.out.print("PRESS ENTER FOR THE CHOICES...");
                scanner.nextLine();
                administrator();
        }
    }
}
