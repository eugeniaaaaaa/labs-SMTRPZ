package com.company.exceptions;

public class OverFillException extends Exception {
   public OverFillException(){
        super("Количество людей в машине не позволяет посадить ещё одного человека");
    }
}
