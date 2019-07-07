package Lesson10;
//4. Заполнить массив случайными числами. Подсчитать:
//        - количество элементов которые больше своего соседа слева
//        - количество четных элементов
//        - количество элементов которые меньше среднего арифметического

import java.util.Arrays;
import java.util.Random;

public class ArrayCheck4 {
    public static void main(String[] args) {
        int moreLeft = 0;
        int evenScore = 0;
        int averMore = 0;

        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(40);
        }

        System.out.println("\n" + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                moreLeft++;
            }
        }
        System.out.println("Количество элементов больше соседа слева " + moreLeft);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                continue;
            }
            if (array[i] % 2 == 0) {
                evenScore++;
            }
        }
        System.out.println("Количество четных элементов " + evenScore);

        double average = 0;
        for (int v : array) {
            average = (average + v);
        }
        average = average / array.length;

        for (int v : array) {
            if (v < average) {
                averMore++;
            }
        }
        System.out.println("Количество элементов меньше среднего арифметического (" + average + ")  " + averMore);
    }
}