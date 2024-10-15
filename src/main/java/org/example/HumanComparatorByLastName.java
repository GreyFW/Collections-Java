package org.example;

import java.util.Comparator;

public class HumanComparatorByLastName implements Comparator<Human> {

    @Override
    public int compare(Human firstHuman, Human secondHuman) {
        return firstHuman.getLastName().compareTo(secondHuman.getLastName());
    }
}
