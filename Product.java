package com.company.entity;

import java.util.Objects;

public class Product implements Comparable {
    private String productName;
    private double itemPrice;

    public Product(String productName, double itemPrice) {
        this.productName = productName;
        this.itemPrice = itemPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return itemPrice;
    }

    public void setProductPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }

    @Override
    public int compareTo(Object o) {
        return this.getProductName().compareTo(((Product) o).getProductName());
    }

}
