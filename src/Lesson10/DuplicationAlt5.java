package Lesson10;//5. Заполнить массив случайными числами. Создать массив который в 2 раза больше исходного и дважды продублировать в
//   нем исходный массив.
//   Например: был массив [1,2,3] => [1,2,3,1,2,3]

import java.util.Arrays;
import java.util.Random;

public class DuplicationAlt5 {

    public static void main(String[] args) {
        int[] arrayOne = new int[5];
        Random random = new Random();
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(40);
        }
        System.out.println("\n Начальный массив        " + Arrays.toString(arrayOne));

        int[] arrayTwice = new int[arrayOne.length * 2];
        for (int j = 0; j < arrayOne.length; j++) {
            arrayTwice[j] = arrayOne[j];
            arrayTwice[j + arrayOne.length] = arrayOne[j];
        }
        System.out.println("\n Продублированный массив " + Arrays.toString(arrayTwice));
    }
}

