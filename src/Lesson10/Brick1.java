package Lesson10;//1. Дан кирпич со сторонами a,b,c и отверстие со сторонами x,y. Определить пройдет ли кирпич в отверстие.

import java.util.Arrays;
import java.util.Scanner;

public class Brick1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер отверстия");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Введите размеры кирпича");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] holeSides = {x, y};
        int[] brickSides = {a, b, c};

        Arrays.sort(brickSides);
        Arrays.sort(holeSides);

        if (brickSides[0] < holeSides[0] && brickSides[1] < holeSides[1]) {
            System.out.println("Проходит");
        } else {
            System.out.println("Не Проходит");
        }
    }
}
