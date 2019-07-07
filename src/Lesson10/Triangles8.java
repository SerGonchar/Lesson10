package Lesson10;//8*. Подсчитать количество треугольников, у которых стороны заданы целыми числами, и площадь которых не больше 100.
// * (опционально) Сделать задание так чтобы не было повторяющихся треугольников, например (3,4,5) и (5,3,4) - повторяющиеся.

public class Triangles8 {
    public static void main(String[] args) {

        int score = 0;
        for (int i = 1; i <= 200; i++) {
            for (int j = i; j <= 200; j++) {
                for (int k = j; k < i + j; k++) {
                    double semiPerim = (i + j + k) / 2.0;
                    double s = Math.sqrt(semiPerim * (semiPerim - i) * (semiPerim - j) * (semiPerim - k));
                    if (s <= 100.0) {
                        score++;
                    }
                }
            }
        }
        System.out.println("\nКоличество треугольников: " + score);
    }
}
