/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstjavaproject.product;

import com.mycompany.firstjavaproject.admin.adminServiceImpl;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MainPC_gneil
 */
public class productServiceImpl implements productService{
    ProductList productList = new ProductList();
    Scanner scanner = new Scanner(System.in);
     // Only one instance but the Items cant be retrieved from another method.
    
    @Override
    public void manageProducts() {

            System.out.println("");
            System.out.println("***********************");
            System.out.println("*       PRODUCTS      *");
            System.out.println("***********************");
            System.out.println("");
            
            List<Product> items = productList.getItems();
            
            if(items.isEmpty()){
                System.out.println("No products");
            }

            else{
                System.out.println("ID    NAME   PRICE");
                for(Product product : items){

                    System.out.println(product.getID()+ "    " + product.getProductName() + "    " + product.getPrice());
                }
            }
            System.out.println(".......................");
            System.out.println("1 - Add New Product");
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
                    removeProduct();
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
        adminServiceImpl adminserviceimpl = new adminServiceImpl();
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
                        productList.addItem(product);           
//                        manageProducts(productList); // Looping of for each <List>
                        
                        System.out.println("");
                        System.out.println("Product added Successfully");
                        System.out.println("Press ENTER to continue....");
                        scanner.nextLine();
                        manageProducts();
                        running = false;
//                        adminserviceimpl.administrator();
                        break;
                    case "N":
                        System.out.println("");
                        System.out.println("Action canceled");
                        System.out.println("Press ENTER to continue....");
                        scanner.nextLine();
                        manageProducts();
                        running = false;
                        break;
                    default:
                        System.out.println("invalid Choice going back to Homepage");
                        manageProducts();
                        running = false;
                        break;
                }
            }
            else{
                System.out.println("Error: Invalid input.");
                manageProducts();
                running = false;
            }
        }
    }
    

    
    


    @Override
    public void removeProduct() {
        List<Product> items = productList.getItems();
        System.out.println("");
        System.out.println("***********************");
        System.out.println("*    REMOVE PRODUCT   *");
        System.out.println("***********************");
        System.out.println("");
        System.out.print("Product ID: ");
        String id = scanner.nextLine();
        
        for(Product product: items){
            if(id != null){
                try {
                   Integer.parseInt(id);
                } 
                catch (NumberFormatException e) {
                    System.out.println("ERROR: Invalid Number");
                }
            }
        }
        
    }
}

    

