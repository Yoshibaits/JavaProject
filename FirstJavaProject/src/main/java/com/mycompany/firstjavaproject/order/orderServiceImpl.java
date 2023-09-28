/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstjavaproject.order;

import com.mycompany.firstjavaproject.admin.adminService;
import com.mycompany.firstjavaproject.admin.adminServiceImpl;
import java.util.Scanner;

/**
 *
 * @author MainPC_gneil
 */
public class orderServiceImpl implements orderService{
    Scanner scanner = new Scanner(System.in);
    @Override
    
    public void manageOrders() {
        adminService adminserviceimpl = new adminServiceImpl();
        boolean running = true;
        System.out.println("");
        System.out.println("***********************");
        System.out.println("*        ORDERS       *");
        System.out.println("***********************");
        System.out.println("");
        // placement for condition for showing the orders
        System.out.println(".......................");
        System.out.println("1 - Mark Order As Delivered");
        System.out.println("");
        System.out.println("0 - Back");
        System.out.println("");
        System.out.print("What do you want to do? ");
        String input = scanner.nextLine();
        
        while (running) {            
            switch (input) {
                case "1":
                    System.out.println("disabled ");
                    running = false;
                    break;
                case "2":
                    System.out.println("disabled");
                    running = false;
                    break;
                case "0":
                    adminserviceimpl.administrator();
                    running = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    System.out.print("PRESS ENTER FOR THE CHOICES...");
            } 
        } 
    }

    @Override
    public void updateOrders() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
