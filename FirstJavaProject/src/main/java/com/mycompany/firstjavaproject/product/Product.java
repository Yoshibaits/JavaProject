/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstjavaproject.product;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MainPC_gneil
 */
public class Product {
    private List<Product> productList;
    private static int nextId = 1;
    private String productName;
    private int id;
    private double price;
    
    public Product(){
        productList = new ArrayList<>();
    }
    

    public Product(String productName, double price) {
        this.id = nextId++;
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
