package com.company;

import java.util.Random;

public class TransactionThread extends Thread {

    @Override
    public void run() {
        Bank bank = new Bank();
        Account from = Bank.getAccounts().get(new Random().nextInt((Bank.getAccounts().size())));
        Account to = Bank.getAccounts().get(new Random().nextInt((Bank.getAccounts().size())));
        double amount = from.getMoney() * new Random().nextDouble();
        bank.operateTransfer(from, to, amount);
    }
}
