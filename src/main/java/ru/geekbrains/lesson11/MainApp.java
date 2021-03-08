package ru.geekbrains.lesson11;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        /**
         * Задание 1.
         * Написать метод, который меняет два элемента массива местами
         * (массив может быть любого ссылочного типа);
         */
        System.out.println("Задание 1");
        Integer[] intArr = new Integer[2]; //Инициализация массива
        intArr[0] = 1;
        intArr[1] = 2;

        System.out.println("Исходный массив " + Arrays.deepToString(intArr));
        swap(intArr, 0, 1);
        System.out.println("Меняем местами " +Arrays.deepToString(intArr));
        System.out.println("");
        /**
         * Задание 2.
         * Написать метод, который преобразует массив в ArrayList
         */
        System.out.println("Задание 2");
        String [] sm = {"A","B","C","D","E","F"};
        List<String> listOfStrings;
        listOfStrings = Arrays.asList(sm);
        System.out.println(listOfStrings);
        System.out.println("");
        /**
         * Задание 3.
         * Создаем кроробки с фруктами. Складываем Яблоки и Апельсины.
         * Получаем вес. Пекладываем из одной коробки в другую.
         */
        System.out.println("Задание 3");
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2, orange3);

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());

    }

    private static void swap(Integer[] intArr, int i, int i1) {
        Integer tmp = intArr[i];
        intArr[i] = intArr[i1];
        intArr[i1] = tmp;
    }
}
