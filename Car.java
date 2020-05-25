package com.company.vehicle;

import java.util.List;

public class Car<T> extends Vehicle<T> {

    public Car(String engine, int wheels, int seat, double gasTankCapacity, double weight, String mark, String model) {
        super(engine, wheels, seat, gasTankCapacity, weight, mark, model);
    }
}
