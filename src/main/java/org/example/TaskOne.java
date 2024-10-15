package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class TaskOne {

    public static void firstTaskArray(int n) {
        // a) создать массив из N случ. чисел от 0 до 100
        Integer[] arrayA = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arrayA[i] = random.nextInt(101);
        }
        System.out.println("\na) Массив случайных чисел:\n" + Arrays.toString(arrayA));

        // b) На основе массива создайте список List
        List<Integer> listA = new ArrayList<>(Arrays.asList(arrayA));
        System.out.println("\nb) Список на основе массива:\n" + listA);

        // c) Отсортируйте список по возрастанию
        Collections.sort(listA);
        System.out.println("\nc) Отсортировали по возрастанию:\n" + listA);

        // d) Отсортируйте список в обратном порядке
        listA.sort(Collections.reverseOrder());
        System.out.println("\nd) Отсортировали в обратном порядке:\n" + listA);

        // e) Перемешайте список
        Collections.shuffle(listA);
        System.out.println("\ne) Перемешали список:\n" + listA);

        // f) Выполните циклический сдвиг на 1 элемент
        Collections.rotate(listA, 1);
        System.out.println("\nf) Сдвинули на 1 элемент:\n" + listA);

        // g) Оставьте в списке только уникальные элементы
        Set<Integer> removeDuplicates = new LinkedHashSet<>(listA);
        listA = new ArrayList<>(removeDuplicates);
        System.out.println("\ng) Оставили в списке только уникальные элементы:\n" + listA);

        // h) Оставьте в списке только дублирующиеся элементы
        List<Integer> duplicatesOnly = new ArrayList<>();
        List<Integer> checker = new ArrayList<>();
        for (Integer number : arrayA) {
            if (!checker.contains(number)) {
                checker.add(number);
            } else {
                duplicatesOnly.add(number);
            }
        }
        System.out.println("\ng) Оставили в списке только дублирующиеся элементы:\n" + duplicatesOnly);

        // i) Из списка получите массив
        Integer[] arrayFromList = listA.toArray(new Integer[0]);

        // j) Посчитайте количество вхождений каждого числа в массив
        HashMap<Integer, Integer> occurances = new HashMap<>();
        for (Integer number : arrayA) {
            occurances.put(number, occurances.getOrDefault(number, 0) + 1);

        }

    }
}
