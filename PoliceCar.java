package com.company.vehicle;

import com.company.passanger.Policeman;

public class PoliceCar<T extends Policeman> extends Car<T> {


    public PoliceCar(String engine, int wheels, int seat, double gasTankCapacity, double weight, String mark, String model) {
        super(engine, wheels, seat, gasTankCapacity, weight, mark, model);
    }
}
