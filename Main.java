package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Bank.calculateAllMoney());
        for (int itter = 0; itter < 1000; itter++) {
            new TransactionThread().start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Bank.calculateAllMoney());
    }
}
