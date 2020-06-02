package com.company;

import com.company.exceptions.NotEnoughMoney;

public class Account {
    private Double money;
    private int accountId;

    Account(Double money, int id) {
        this.money = money;
        this.accountId = id;
    }

    Account withdraw(Double amount) {
        if (this.getMoney() - amount > 0) {
            setMoney(this.getMoney() - amount);
        } else {
            throw new NotEnoughMoney(this.getMoney() + " < " + amount);
        }

        return this;
    }

    Account deposit(Double amount) {
        setMoney(this.getMoney() + amount);
        return this;
    }

    Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public int getAccountId() {
        return accountId;
    }
}
