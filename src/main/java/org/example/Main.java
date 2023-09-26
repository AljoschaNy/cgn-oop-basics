package org.example;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BMW","3.20","blue",2018);
        Car myCar2 = new Car("Dacia", "Sandero","blue",2020);

        //System.out.println("Speed before = " + myCar2.speedInKNH);
        //myCar2.accelerateCar();
        //System.out.println("Speed after = " + myCar2.speedInKNH);
        //myCar.startCar();

        Person personAljoscha = new Person("Aljoscha",32,"male");
        Person personIskren = new Person("Iskren", 32, "male");
        Person personAlex = new Person("Alexander",16, "unknown");

        //personAljoscha.greeting();
        //personAlex.greeting();
        //personIskren.greeting();

        Person personTest = new Person("Test1");
        System.out.println("Test1's age = " + personTest.age);
        System.out.println("Test1's gender = " + personTest.gender);
        personTest.greeting();

        Person personTest2 = new Person("Test2",24);
        System.out.println("Test2's gender = " + personTest2.gender);
        personTest2.greeting();
    }

}