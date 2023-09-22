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
        System.out.println("Hello World!");
                
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while(running){
            System.out.println("Hello World!");
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
                    break;
                case "2":
                    System.out.println("Thank you for using our services!");
                    
                default:
                    System.out.println("Invalid choice.");
            }
    
        }
    }
    
}
