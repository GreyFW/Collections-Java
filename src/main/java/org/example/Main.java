package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер задания: ");
        int taskNumber;

        if (scanner.hasNextInt()) {
            taskNumber = scanner.nextInt();
        } else {
            System.out.println("Некорректный ввод.");
            return;
        }

        switch (taskNumber) {
            case 1: {
                System.out.print("Введите размер массива: ");
                int size;

                if (scanner.hasNextInt()) {
                    size = scanner.nextInt();
                } else {
                    System.out.println("Некорректный ввод.");
                    break;
                }

            }
            case 2: {

            }
            case 3: {

            }
            case 4: {

            }
            case 5: {

            }

            default: {
                System.out.println("Нет задания с таким номером.");
                break;
            }
        }
    } // end of the main() func;
} // end of the Main class;