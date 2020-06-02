package com.company.exceptions;

public class NotEnoughMoney extends RuntimeException {
    public NotEnoughMoney(String mes){
        super(mes);
    }
}
