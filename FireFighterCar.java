package com.company.vehicle;

import com.company.passanger.FireFighter;

import java.util.List;

public class FireFighterCar<T extends FireFighter> extends Car<T> {

    public FireFighterCar(String engine, int wheels, int seat, double gasTankCapacity, double weight, String mark, String model) {
        super(engine, wheels, seat, gasTankCapacity, weight, mark, model);
    }
}
