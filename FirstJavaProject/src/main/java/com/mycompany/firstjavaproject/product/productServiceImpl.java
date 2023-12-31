/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstjavaproject.product;


import com.mycompany.firstjavaproject.admin.adminService;
import com.mycompany.firstjavaproject.admin.adminServiceImpl;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MainPC_gneil
 */
public class productServiceImpl implements productService{
    private ProductList productList = new ProductList();
    Scanner scanner = new Scanner(System.in);
    
    // created in hopes of getting the details of this productServiceImpl
    // in short words for the instance productList
    // cannot get the values to productList instance to be used for customerServiceImpl
    @Override
    public List<Product> getItemsList() {
        return productList.getItems();
    }
    
    
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
                adminService adminserviceimpl = new adminServiceImpl();
                adminserviceimpl.administrator();
                break;
            default:
                System.out.println("INVALID CHOICE");
                System.out.print("PRESS ENTER FOR THE CHOICES...");
                scanner.nextLine();       
        }
    }
    @Override
    public void addProduct() {
        boolean mainrun = true;
        boolean run = true;
        double price = 0;
        System.out.println("");
        System.out.println("***********************");
        System.out.println("*     ADD PRODUCT     *");
        System.out.println("***********************");
        System.out.println("");
        
        while (mainrun) {// promt user to add Name;     
            System.out.print("NAME: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                System.out.println("Error: Invalid input.");
            }
            else if(name != null){
                while (run) {// promt user to add price;
                    System.out.print("PRICE: ");
                    try {
                        price = Integer.parseInt(scanner.nextLine());
                        run = false;
                    } 
                    catch (NumberFormatException e) {
                        System.out.println("ERROR: Invalid Number");
                    }
                }
                System.out.println("Are you sure you want to add this Product (Y/N): ");
                String response = scanner.nextLine();
                
                if (response.equalsIgnoreCase("Y")){
                    Product product = new Product(name, price);
                    productList.addItem(product);// Added to LIST 
                    System.out.println("");
                    System.out.println("Product added Successfully");
                    System.out.println("Press ENTER to continue....");
                    scanner.nextLine();
                    manageProducts();
                    mainrun = false;
                }
                else if(response.equalsIgnoreCase("N")){
                    System.out.println("");
                    System.out.println("Action canceled");
                    System.out.println("Press ENTER to continue....");
                    scanner.nextLine();
                    manageProducts();
                    mainrun = false; 
                }
                else{
                    System.out.println("Error: invalid character");
                    manageProducts();
                }
            }
        }
    }
    
    @Override
    public void removeProduct() {
        boolean mainrun = true;
        boolean idrun = true;
        String response;
        
        System.out.println("");
        System.out.println("***********************");
        System.out.println("*    REMOVE PRODUCT   *");
        System.out.println("***********************");
        System.out.println("");
        
        while (mainrun) {            
            System.out.print("Product ID: ");
            String id = scanner.nextLine();
            if(id == null){
                System.out.println("Error: Invalid Input");
            }
            else if(id != null){
                try {
                    while (idrun) {                        
                        int numid = Integer.parseInt(id);
                        System.out.println("Are you sure you want to remove this product (Y/N) :");
                        response = scanner.nextLine();
                        if(response.equalsIgnoreCase("Y")){
                            productList.removeItem(numid);
                            System.out.println("Product removed successfully!");
                            System.out.println("Press ENTER to continue....");
                            scanner.nextLine();
                            manageProducts();
                            idrun = false;
                        }
                        else if(response.equalsIgnoreCase("N")){
                            System.out.println("Action canceled");
                            manageProducts();
                            idrun = false;
                            mainrun = false;
                        }
                        else{
                            System.out.println("Error: invalid character");
                        }
                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("ERROR: Invalid Number");
                }
            }
            
        }
    } 
}

    

