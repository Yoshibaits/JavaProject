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
//    Product productList = new Product();
    List<Product> productList = new ArrayList<>();
    
    
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

        boolean running = true;
        System.out.println("");
        System.out.println("***********************");
        System.out.println("*     ADD PRODUCT     *");
        System.out.println("***********************");
        System.out.println("");
        
        while (running) {            
            System.out.print("NAME: ");
            String name = scanner.nextLine();
            if(name != null){
                System.out.println("");
                System.out.print("PRICE: ");
                double price = 0;
                try {
                    price = Integer.parseInt(scanner.nextLine());
                } 
                catch (NumberFormatException e) {
                    System.out.println("ERROR: Invalid Number");
                }
                System.out.println("Are you sure you want to add this Product (Y/N): ");
                
                String response = scanner.nextLine();
                
                switch (response) {
                    case "Y":
                        Product product = new Product(name, price);
                        productList.add(product);
                        System.out.println("");
                        System.out.println("Product added Successfully");
                        System.out.println("Press ENTER to continue....");
                        scanner.nextLine();
                        break;
                    case "N":
                        System.out.println("");
                        System.out.println("Action canceled");
                        System.out.println("Press ENTER to continue....");
                        scanner.nextLine();
                        manageProducts();
                        break;
                    default:
                        System.out.println("invalid Choice going back to Homepage");
                        manageProducts();
                        break;
                }
            }
            else{
                System.out.println("Error: Invalid input.");
                manageProducts();
                
            }
        }


    }
}
    

