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
public class ProductList {
    private List<Product> items = new ArrayList<>();
    
    
    
    public void addItem(Product product){
        items.add(product);
    }
    public void removeItem(Product product){
        items.remove(product);
    }

    public List<Product> getItems() {
        return items;
    }
    
}
