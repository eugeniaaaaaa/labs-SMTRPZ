package com.company.exceptions;

import com.company.passanger.Human;

public class PassangerNotFountException extends Exception {
    public PassangerNotFountException(Human human){
        super("Пасажира с именем : " + human.getName() + " " + human.getSurname() + " не найдено.");
    }
}
