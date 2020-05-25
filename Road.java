package com.company;

import com.company.passanger.Human;
import com.company.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Road {
    private int humanCounter;
    private int carsCounter;
    private List<Vehicle> carsInRoad;


    public Road(int humanCounter, int carsCounter, List<Vehicle> carsInRoad) {
        this.humanCounter = humanCounter;
        this.carsCounter = carsCounter;
        this.carsInRoad = carsInRoad;
    }

    public int getCountOfHumans() {
        for (Vehicle vehicle : carsInRoad) {
            humanCounter += vehicle.getCountOfOccupiedPlaces();
        }
        return humanCounter;
    }

    public void addCarToRoad(Vehicle vehicle) {
        carsInRoad.add(vehicle);
        carsCounter++;
    }

    public int getHumanCounter() {
        return humanCounter;
    }

    public void setHumanCounter(int humanCounter) {
        this.humanCounter = humanCounter;
    }

    public int getCarsCounter() {
        return carsCounter;
    }

    public void setCarsCounter(int carsCounter) {
        this.carsCounter = carsCounter;
    }

    public List<Vehicle> getCarsInRoad() {
        return carsInRoad;
    }

    public void setCarsInRoad(List<Vehicle> carsInRoad) {
        this.carsInRoad = carsInRoad;
    }
}
