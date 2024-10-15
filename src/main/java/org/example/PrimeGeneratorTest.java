package org.example;

import java.util.*;

public class PrimeGeneratorTest {
        PrimesGenerator generated;

        PrimeGeneratorTest(PrimesGenerator generated) {
                this.generated = generated;
        }

        public void show() {
                System.out.println("В прямом порядке: ");
                for (int number : generated) {
                        System.out.print(number + " ");
                }

                System.out.println("\nВ обратном порядке: ");
                Iterator<Integer> reverseIterator = generated.reverseIterator();
                while (reverseIterator.hasNext()) {
                        System.out.print(reverseIterator.next() + " ");
                }
        }
}