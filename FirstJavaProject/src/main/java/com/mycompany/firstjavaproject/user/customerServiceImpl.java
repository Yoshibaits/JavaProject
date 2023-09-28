package com.mycompany.firstjavaproject.user;

import com.mycompany.firstjavaproject.admin.adminService;
import com.mycompany.firstjavaproject.admin.adminServiceImpl;
import com.mycompany.firstjavaproject.product.Product;
import com.mycompany.firstjavaproject.product.ProductList;
import com.mycompany.firstjavaproject.product.productService;
import com.mycompany.firstjavaproject.product.productServiceImpl;
import java.util.List;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MainPC_gneil
 */
public class customerServiceImpl implements customerService{
//    productService productserviceimpl = new productServiceImpl(); // Creates new instance (meaning completely new instance)
//    productServiceImpl list ; //returns null can't use to retain values
//    List<Product> items = productserviceimpl.displayProducts();
//    List<Product> items = productList.getItems(); // created aninstance that will retrieve values
//    private productService productServiceImpl;//null
    
    
    Scanner scanner = new Scanner(System.in);
    adminService  adminserviceimpl = new adminServiceImpl();

    private productService productServiceImpl = new productServiceImpl();  
    public List<Product> items = productServiceImpl.getItemsList(); // this will not giveyou the value of the previous instance because this is a different one 
    // in Shop() method it will return as no products

    
    @Override
    public void customerHomeScreen() {
        boolean running = true;
        System.out.println("");
        System.out.println("***********************");
        System.out.println("*       CUSTOMER      *");
        System.out.println("***********************");
        System.out.println("");
        System.out.println("1 - Shop");
        System.out.println("2 - My Orders");
        System.out.println(".......................");
        System.out.println("0 - Logout");
        String input = scanner.nextLine();
        
        while (running) {            
            switch (input) {
                case "1":
                    shop();
                    running = false;
                    break;
                case "2":
                    System.out.println("My orderes disabled");
                    running = false;
                    break;
                case "0":
                    adminserviceimpl.loginPage();
                    running = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    System.out.print("PRESS ENTER FOR THE CHOICES...");
            } 
        }
    }

    @Override
    public void shop() {
        boolean running = true;
        System.out.println("***********************");
        System.out.println("*         SHOP        *");
        System.out.println("***********************");

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
        System.out.println("0 - Back");
        System.out.println("");
        System.out.print("What do you want to order? ");
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
                    customerHomeScreen();
                    running = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    System.out.print("PRESS ENTER FOR THE CHOICES...");
            } 
        } 
    }
}
