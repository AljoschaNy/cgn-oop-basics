package org.example;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BMW","3.20","blue",2018);
        Car myCar2 = new Car("Dacia", "Sandero","blue",2020);

        System.out.println("Speed before = " + myCar2.speedInKNH);
        myCar2.accelerateCar();
        System.out.println("Speed after = " + myCar2.speedInKNH);




        myCar.startCar();
    }
}