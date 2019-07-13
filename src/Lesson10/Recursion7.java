package Lesson10;
//7*. Вывести все перестановки строки используя рекурсию

public class Recursion7 {

    private static int count = 0;

    public static void main(String[] args) {
        String word = "spider";
        permutation(word);
        System.out.println(count + "  Вариантов");
    }

    private static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            count++;
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }
}


