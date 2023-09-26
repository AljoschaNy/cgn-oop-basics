package org.example;

public class Person {
    public String name;
    public int age;
    public String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name) {
        this.name = name;
        age = 18;
        gender = "unknown";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        gender = "unknown";
    }

    public void greeting() {
        System.out.println("Hallo, ich bin " + name + " und " + age + " Jahre alt.");
    }
}
