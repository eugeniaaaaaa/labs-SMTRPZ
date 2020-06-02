package com.company;

import com.company.exceptions.NotEnoughMoney;

import java.util.List;

class Bank {

    private static volatile List<Account> accounts = BankAccountsGenerator.generateAccount(4);
    private static final Object tieLock = new Object();

    void operateTransfer(final Account from, final Account to, final Double amount) throws NotEnoughMoney {
        int fromId = from.getAccountId();
        int toId = from.getAccountId();
        if (fromId < toId) {
            synchronized (from) {
                synchronized (to) {
                    doTransfer(from, to, amount);
                }
            }
        } else if (fromId > toId) {
            synchronized (to) {
                synchronized (from) {
                    doTransfer(from, to, amount);
                }
            }
        }else {
            synchronized (tieLock){
                synchronized (from){
                    synchronized (to){
                        doTransfer(from,to,amount);
                    }
                }
            }
        }
    }

    private void doTransfer(final Account fromAcct, final Account toAcct, final Double amount) throws NotEnoughMoney {
        if (fromAcct.getMoney().compareTo(amount) < 0)
            throw new NotEnoughMoney("Not enough");
        else {
            Account newAccFrom = fromAcct.withdraw(amount);
            Account newAccTo = toAcct.deposit(amount);
            accounts.set(newAccFrom.getAccountId(),newAccFrom);

            accounts.set(newAccTo.getAccountId(),newAccTo);
            System.out.println("From : " + fromAcct.getAccountId() + "  money : " + fromAcct.getMoney() + '\n' +

                    " to : " + toAcct.getAccountId() + "  money " + toAcct.getMoney() + '\n' +
                    "how much : " + amount
            );
        }
    }


    static List<Account> getAccounts() {
        return accounts;
    }

    static Double calculateAllMoney() {
        double f = 0;
        for (Account account : getAccounts()) {
            f += account.getMoney();
        }
        return f;
    }
}
