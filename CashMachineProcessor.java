package com.company.util;

import com.company.entity.Product;
import com.company.entity.SalesReceipt;

import java.util.*;

public class CashMachineProcessor {
    private SalesReceipt salesReceipt;

    public void beginScan() {
        salesReceipt = new SalesReceipt();
    }

    public void addProduct(Product product, int count) {
        if (salesReceipt.getProducts().containsKey(product)) {
            salesReceipt.getProducts().put(product, salesReceipt.getProducts().get(product) + count);
        } else {
            salesReceipt.getProducts().put(product, count);
        }
        salesReceipt.setPrice(product.getProductPrice() * count + salesReceipt.getPrice());
    }

    public void removeProduct(Product product) {
        if (salesReceipt.getProducts().get(product) == 1) {
            salesReceipt.getProducts().remove(product);
        } else {
            salesReceipt.getProducts().put(product, salesReceipt.getProducts().get(product) - 1);
        }
        salesReceipt.setPrice(salesReceipt.getPrice() - product.getProductPrice() * salesReceipt.getProducts().get(product));
    }

    public void clearOrder() {
        salesReceipt.setProducts(new HashMap<>());
        salesReceipt.setPrice(0);
    }

    public boolean isEmpty() {
        return salesReceipt.getProducts().isEmpty();
    }

    public int getAmount(Product product) {
        if (salesReceipt.getProducts().containsKey(product)) {
            return salesReceipt.getProducts().get(product);
        }
        return 0;
    }


    public String getBill() {
        String result = "";

        List<Product> keys = sortProducts(salesReceipt.getProducts().keySet());
        for (Product prod : keys) {
            result += prod.getProductName() + " * ";
            result += salesReceipt.getProducts().get(prod) + "\n";
        }
        result += String.format("Price: %.2f", salesReceipt.getPrice());
        return result;
    }

    private List<Product> sortProducts(Set<Product> products) {
        List<Product> aList = new ArrayList<>();
        aList.addAll(products);
        Collections.sort(aList);
        return aList;
    }

    public double getPrice() {
        return salesReceipt.getPrice();
    }

    public Map<Product, Integer> getProducts() {
        return salesReceipt.getProducts();
    }
}

