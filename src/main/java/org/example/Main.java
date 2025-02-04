package org.example;

import java.util.*;

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
                List<Human> humans = new ArrayList<>();
                humans.add(new Human("Peter","Parker", 15));
                humans.add(new Human("Miles", "Morales", 13));
                humans.add(new Human("Jessica", "Drew", 20));
                humans.add(new Human("Gwendolyn", "Stacy", 19));

                // a) HashSet; не гарантирует никакого порядка элементов
                HashSet<Human> humansHashSet = new HashSet<>(humans);
                System.out.println("a) " + humansHashSet);

                // b) LinkedHashSet; в порядке добавления
                LinkedHashSet<Human> humansLinkedHS = new LinkedHashSet<>(humans);
                System.out.println("b) " + humansLinkedHS);

                // c) TreeSet сортирует по естественному порядку (comparable implementation), у нас по возрасту
                TreeSet<Human> humansTreeSet = new TreeSet<>(humans);
                System.out.println("c) " + humansTreeSet);

                // d) Пустой TreeSet, отсортир. по фамилии
                TreeSet<Human> humansTreeSetComparator = new TreeSet<>(new HumanComparatorByLastName());
                humansTreeSetComparator.addAll(humans);
                System.out.println("d) " +  humansTreeSetComparator);

                break;
            }
            case 4: {

                System.out.print("\nВведите ваш текст: ");
                String input;
                scanner.nextLine(); // убираем "остатки" предыдущих вводов;

                if (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                } else {
                    System.out.println("Некорректный ввод.");
                    return;
                }
                TaskFour taskFourObj = new TaskFour(input);

                break;
            }
            case 5: {
                System.out.println("Для примера: ");
                Map<Integer, String> input = new HashMap<>();
                input.put(10, "ten");
                input.put(21, "twenty one");
                input.put(13, "thirteen");
                input.put(7, "seven");

                System.out.println("До того, как поменяли местами: ");
                System.out.println(input);

                System.out.println("После того, как поменяли местами: ");
                TaskFive taskFiveObj = new TaskFive();
                Map<String, Integer> swapped = taskFiveObj.swapKeysValues(input);
                System.out.println(swapped);

                System.out.println();

                break;
            }

            default: {
                System.out.println("Нет задания с таким номером.");
                break;
            }
        }
    } // end of the main() func;
} // end of the Main class;