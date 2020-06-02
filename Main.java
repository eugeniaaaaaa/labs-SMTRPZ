package com.company;

import com.company.entity.Product;
import com.company.util.CashMachineProcessor;

public class Main {

    public static void main(String[] args) {
        CashMachineProcessor cashMachineProcessor = new CashMachineProcessor();
        cashMachineProcessor.beginScan();
        cashMachineProcessor.addProduct(new Product("Каша",20),2);
        cashMachineProcessor.addProduct(new Product("Молоко",30),1);
        cashMachineProcessor.addProduct(new Product("Каша",200),5);
        cashMachineProcessor.addProduct(new Product("Хлеб",100),1);
        cashMachineProcessor.addProduct(new Product("Гречка",1000),2);
        System.out.println(cashMachineProcessor.getBill());

    }
}
