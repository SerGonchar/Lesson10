package Lesson10;
//3.1. Используя StringList считать текстовый файл из нескольких строк.
// Подсчитать сколько у него строк/слов/символов

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringListMain3 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                StringList.add(currentLine);
            }
            printInfo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printInfo() {
        System.out.println("Line count: " + StringList.size());

        int charCount = 0;
        int wordsCount = 0;
        for (int i = 0; i < StringList.size(); i++) {
            charCount += StringList.get(i).length();
            String[] words = StringList.get(i).split("[\\s+']+");
            wordsCount += words.length;
        }
        System.out.println("Words count: " + wordsCount);
        System.out.println("Char count: " + charCount);
    }
}
