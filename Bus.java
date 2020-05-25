package com.company.vehicle;

import com.company.exceptions.OverFillException;
import com.company.passanger.Human;
import com.company.passanger.Policeman;

import java.util.ArrayList;

public class Bus<T extends Human> extends Vehicle<T> {


    public Bus(String engine, int wheels, int seat, double gasTankCapacity, double weight, String mark, String model) {
        super(engine, wheels, seat, gasTankCapacity, weight, mark, model);
    }
}
