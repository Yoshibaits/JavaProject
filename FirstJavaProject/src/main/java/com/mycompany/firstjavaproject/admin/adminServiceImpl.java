/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstjavaproject.admin;

import com.mycompany.firstjavaproject.Login;
import static com.mycompany.firstjavaproject.Main.homePage;
import com.mycompany.firstjavaproject.order.orderService;
import com.mycompany.firstjavaproject.order.orderServiceImpl;
import com.mycompany.firstjavaproject.product.productService;
import com.mycompany.firstjavaproject.product.productServiceImpl;
import com.mycompany.firstjavaproject.user.customerServiceImpl;
import java.util.Scanner;

/**
 *
 * @author MainPC_gneil
 */
public class adminServiceImpl implements adminService{
    Scanner scanner = new Scanner(System.in);

        
    @Override
    public void loginPage() {
        
        Login login = new Login();
        String admin = login.getAdmin();
        String adminPass = login.getAdminPass();
        String user = login.getUser();
        String userPass = login.getUserPass();

        
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
            System.out.println("");
            administrator();
        }
        else if(userInput.equals(user) && passwordInput.equals(userPass)){
            System.out.println("Hello User!");
            System.out.println("");
            customerServiceImpl customerserviceimpl = new customerServiceImpl();
            customerserviceimpl.customerHomeScreen();
        }
        else{
            System.out.println("");
            System.out.println("ERROR: Invalid Credentials.");
            System.out.print("Press " +  "ENTER" + " to continue...");
            scanner.nextLine();
            homePage(); // temporary disable 
        }
    }

    @Override
    public void administrator() {
        productService productserviceimpl = new productServiceImpl();
        orderService orderserviceimpl = new orderServiceImpl();
        System.out.println("");
        System.out.println("***********************");
        System.out.println("*    ADMINISTRATOR    *");
        System.out.println("***********************");
        System.out.println("");
        System.out.println(".......................");
        System.out.println("1 - Manage Products");
        System.out.println("2 - Manage Orders");
        System.out.println("");
        System.out.println("0 - Logout");
        System.out.println("");
        System.out.print("What do you want to do? ");
        String input = scanner.nextLine();
        System.out.println("");            
        

        switch (input) {
        case "1":
            productserviceimpl.manageProducts();
            break;

        case "2":
            System.out.println("MANAGE ORDERS");
            orderserviceimpl.manageOrders();
        case "0":
            System.out.println("LOGOUT");
            homePage();
            break;
        default:
            System.out.println("INVALID CHOICE");
            System.out.print("PRESS ENTER FOR THE CHOICES...");
            scanner.nextLine();
            administrator();
        }
    }
    //    Outside the class
}

