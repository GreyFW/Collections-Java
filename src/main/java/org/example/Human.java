package org.example;

import java.util.Comparator;

public class Human implements Comparable<Human> {

    private String name;
    private String lastName;
    private int age;

    public Human(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return (name + " " + lastName + ", " + "age = " + age);
    }

    @Override
    public int compareTo(Human other) {
        return Integer.compare(this.age, other.age);
    }
}
