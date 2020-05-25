package com.company.vehicle;

import com.company.exceptions.OverFillException;
import com.company.exceptions.PassangerNotFountException;
import com.company.passanger.Human;

import java.util.ArrayList;
import java.util.List;

public class Vehicle<T> {
    private String engine;
    private String model;
    private String mark;
    private int wheels;
    private int seat;
    private double gasTankCapacity;
    private double weight;
    private int countOfOccupiedPlaces;
    private List<T> passangers;

    public Vehicle(String engine, int wheels, int seat, double gasTankCapacity, double weight,String mark,String model) {
        this.engine = engine;
        this.wheels = wheels;
        this.seat = seat;
        this.gasTankCapacity = gasTankCapacity;
        this.weight = weight;
        this.passangers = new ArrayList<>();
        this.mark = mark;
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getGasTankCapacity() {
        return gasTankCapacity;
    }

    public void setGasTankCapacity(double gasTankCapacity) {
        this.gasTankCapacity = gasTankCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public List<T> getPassangers() {
        return passangers;
    }

    public void setPassangers(List<T> passangers) {
        this.passangers = passangers;
    }

    public void addPassanger(T passanger) throws OverFillException {
        if (seat == countOfOccupiedPlaces) {
            throw new OverFillException();
        } else {
            this.passangers.add(passanger);
            countOfOccupiedPlaces++;
        }

    }
    public void removePassanger(T passanger) throws PassangerNotFountException {
        if(!passangers.contains(passanger)){
            throw new PassangerNotFountException((Human)passanger);
        }else{
            passangers.remove(passanger);
            countOfOccupiedPlaces--;
        }
    }

    public int getCountOfOccupiedPlaces() {
        return countOfOccupiedPlaces;
    }

    public void setCountOfOccupiedPlaces(int countOfOccupiedPlaces) {
        this.countOfOccupiedPlaces = countOfOccupiedPlaces;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void ride() {
        System.out.println("Riding");
    }

    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seat=" + seat +
                ", gasTankCapacity=" + gasTankCapacity +
                ", weight=" + weight +
                ", countOfOccupiedPlaces=" + countOfOccupiedPlaces +
                ", passangers=" + passangers +
                '}';
    }
}
