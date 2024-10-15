package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер задания: ");
        int taskNumber;

        if (scanner.hasNextInt()) {
            taskNumber = scanner.nextInt();
        } else {
            System.out.println("Некорректный ввод.");
            return;
        }

        switch (taskNumber) {
            case 1: {
                System.out.print("\nВведите размер массива: ");
                int size;

                if (scanner.hasNextInt()) {
                    size = scanner.nextInt();
                } else {
                    System.out.println("Некорректный ввод.");
                    break;
                }

                TaskOne taskOneObj = new TaskOne();
                taskOneObj.firstTaskArray(size);
                break;
            }
            case 2: {
                System.out.print("\nВведите количество простых чисел на генерацию: ");
                int n;
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                } else {
                    System.out.println("Некорректный ввод.");
                    return;
                }

                PrimesGenerator taskTwo = new PrimesGenerator(n);
                PrimeGeneratorTest primesTest = new PrimeGeneratorTest(taskTwo);
                primesTest.show();

                break;
            }
            case 3: {
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                break;
            }

            default: {
                System.out.println("Нет задания с таким номером.");
                break;
            }
        }
    } // end of the main() func;
} // end of the Main class;