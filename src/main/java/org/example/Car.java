package org.example;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int builtYear;
    public int speedInKNH;

    public Car(String brand, String model, String color, int builtYear) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.builtYear = builtYear;
    }

    public void startCar() {
        System.out.println("Car has brum brum!");
    }

    public void accelerateCar() {
        speedInKNH += 10;
    }
}
