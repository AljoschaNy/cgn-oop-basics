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

    public void greeting() {
        System.out.println("Hallo, ich bin " + name + " und " + age + " Jahre alt.");
    }
}
