package com.company.entity;


import com.company.entity.Product;

import java.util.HashMap;
import java.util.Map;

public class SalesReceipt {
    private Map<Product, Integer> products;
    private double price;

    public SalesReceipt() {
        products = new HashMap();
        price = 0;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double  price) {
        this.price = price;
    }
}