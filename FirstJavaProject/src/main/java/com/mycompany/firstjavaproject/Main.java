/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstjavaproject;


import com.mycompany.firstjavaproject.admin.adminServiceImpl;
import com.mycompany.firstjavaproject.admin.adminService;
import java.util.Scanner;

/**
 *
 * @author MainPC_gneil
 */
public class Main{
    
    public static void main(String[] args) {
        homePage();
    
    }
    
    public static void homePage(){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        adminService admin = new adminServiceImpl();
        
        
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
                    admin.loginPage();
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
                    break;
            }
        }
    }
    


//    Outside the main function
}
