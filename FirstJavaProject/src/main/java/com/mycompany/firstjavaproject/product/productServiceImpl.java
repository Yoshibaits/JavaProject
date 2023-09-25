/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstjavaproject.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MainPC_gneil
 */
public class productServiceImpl implements productService{
    
    Scanner scanner = new Scanner(System.in);
    
            
            
    @Override
    public void manageProducts(){
            System.out.println("");
            System.out.println("***********************");
            System.out.println("*       PRODUCTS      *");
            System.out.println("***********************");
            System.out.println("");
            System.out.println("1 - Add New Product");
            System.out.println(".......................");
            System.out.println("2 - Remove Product");
            System.out.println("");
            System.out.println("0 - Back");
            System.out.println("");
            System.out.print("What do you want to do? ");
            String input = scanner.nextLine();
            
            switch (input) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    System.out.println("TEMPORARY DISABLED REMOVE PRODUCT");
                    break;
                case "0":
                    System.out.println("BACK STILL DISABLED ");
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    System.out.print("PRESS ENTER FOR THE CHOICES...");
                    scanner.nextLine();
                    
            }
    }
    @Override
    public void addProduct() {

        Product items = new Product();
        double price = 0;
        System.out.println("");
        System.out.println("***********************");
        System.out.println("*     ADD PRODUCT     *");
        System.out.println("***********************");
        System.out.println("");
        System.out.print("NAME: ");
        String name = scanner.nextLine();
        
        if(name != null){
            System.out.println("");
            System.out.print("PRICE: ");
            
            try {
                price = scanner.nextInt();
                
                if(price != 0){
                    System.out.println("Valid price entered: " + price);
                }
                else{
                    System.out.println("Price cannot be zero");
                }
            } 
            
            catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for price.");
            }
        }
        else{
            System.out.println("No name Provided");
        }
        items.setProductName(name);
        items.setPrice(price);
        List<Product> product = new ArrayList<>();
        product.add(items);
        System.out.println(product);
    }
}
    

