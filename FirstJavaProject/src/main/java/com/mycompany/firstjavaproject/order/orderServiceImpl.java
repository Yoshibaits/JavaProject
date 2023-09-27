/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstjavaproject.order;

/**
 *
 * @author MainPC_gneil
 */
public class orderServiceImpl implements ordersService{

    @Override
    public void manageOrders() {
        System.out.println("");
        System.out.println("***********************");
        System.out.println("*        ORDERS       *");
        System.out.println("***********************");
        System.out.println("");
        
        
        System.out.println(".......................");
        System.out.println("1 - Mark Order As Delivered");
        System.out.println("");
        System.out.println("0 - Back");
        System.out.println("");
        System.out.print("What do you want to do? ");
    }

    @Override
    public void updateOrders() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
