package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] array = {8.7, -2.4, -4.8, 2.6, 3.1, 6.3, -51.4, 1.0, 57.2, 44.1, 14.7, -8.3, 47.5, 4.8, 7.3};
        boolean wasNegative = false;
        double sum = 0.0;
        int counter = 0;

        for (double each : array) {
           /*
           boolean isPositive = true;

            if (each < 0) {
                isPositive = false;
            } else if (isPositive) {
                System.out.println(each);
            }*/
            if (each > 0 && wasNegative) {
                sum += each;
                counter++;
                System.out.println(each);
            } else {
                wasNegative = true;
            }

        }
        System.out.println(sum / counter);
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sort(double[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
	 /*
        ДЗ на сообразительность:

        Вам необходимо написать следующий алгоритм сортировки массива по возрастанию:
        каждую итерацию выбирать самый минимальный элемент и смещать его в начало.
         При этом каждую новую итерацию начинать сдвигаясь вправо, то есть первый проход
         — с первого элемента, второй проход — со второго и т.д.
        И при каждой итерации распечатывать текущее состояние массива
         */