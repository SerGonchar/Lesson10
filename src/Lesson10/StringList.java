package Lesson10;

//3. Создать отдельный класс StringList у которого есть public static методы: add(String value)
// / int size() / clean() / get(int i) / print() - который представляет собой обертку над массивом.
// При добавлении каждого елемента массив автоматически растет.
//3.1. Используя StringList считать текстовый файл из нескольких строк. Подсчитать сколько у него строк/слов/символов

import java.util.Arrays;

public class StringList {
    private static String[] mass = new String[1];

    public static void add(String value) {

        if (mass[mass.length - 1] != null) {
            String[] massTemp = mass;
            mass = new String[mass.length + 1];
            for (int i = 0; i < massTemp.length; i++) {
                mass[i] = massTemp[i];
            }
        }
        mass[mass.length - 1] = value;
    }

    public static int size() {
        return mass.length;
    }

    public static void clean() {
        mass = new String[1];
    }

    public static String get(int i) {
        return mass[i];
    }

    public static void print() {
        System.out.println(Arrays.toString(mass));
    }
}
