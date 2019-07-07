package Lesson10;//5. Заполнить массив случайными числами. Создать массив который в 2 раза больше исходного и дважды продублировать в
//   нем исходный массив.
//   Например: был массив [1,2,3] => [1,2,3,1,2,3]

import java.util.Arrays;
import java.util.Random;

public class Duplication5 {

    public static void main(String[] args) {

        int[] arrayOne = new int[5];

        Random random = new Random();
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(40);
        }

        System.out.println("\n Начальный массив             " + Arrays.toString(arrayOne));

        int[] arrayTwo = new int[arrayOne.length*2];

        System.arraycopy(arrayOne, 0, arrayTwo, 0, arrayOne.length);
        System.arraycopy(arrayOne, 0, arrayTwo, 5, arrayOne.length);
        System.out.println("\n Продублированный массив      " + Arrays.toString(arrayTwo));
    }
}

