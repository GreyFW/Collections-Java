package org.example;

// task 2

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimesGenerator implements Iterable<Integer> {
    private List<Integer> primes = new ArrayList<>();
    int size;

    public PrimesGenerator(int n) {
        this.size = n;
        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                primes.add(number);
                count++;
            }
            number++;
        }
    }

    public int getSize() {
        return this.size;
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Iterator<Integer> iterator() {
        return primes.iterator();
    }

    public Iterator<Integer> reverseIterator() {

        return new Iterator<Integer>() { // анонимный класс
            int currentIndex = primes.size() - 1;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public  Integer next() {
                return primes.get(currentIndex--);
            }
        };
    }


}
