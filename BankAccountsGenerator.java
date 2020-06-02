package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class BankAccountsGenerator {
    static List<Account> generateAccount(int count) {
        List<Account> accounts = new ArrayList<>();
        for (int itter = 0; itter < count; itter++) {
            double randomValue = 0.0 + (100.0 - 0.0) * new Random().nextDouble();
            accounts.add(new Account(randomValue,itter));
        }
        return accounts;
    }
}
