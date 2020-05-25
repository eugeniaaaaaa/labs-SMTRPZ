package com.company.vehicle;

import com.company.passanger.Human;
import com.company.passanger.Policeman;

import java.util.List;

public class TaxiCar<T extends Human> extends Car<T> {


    public TaxiCar(String engine, int wheels, int seat, double gasTankCapacity, double weight, String mark, String model) {
        super(engine, wheels, seat, gasTankCapacity, weight, mark, model);
    }
}
