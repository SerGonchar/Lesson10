//Создать массив из 100 обьектов типа Person заполненных случайными данными (Например создать массив
// на несколько имен и выбирать из него случайным образом).
//1.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
//не было человека весом 3 кг и ростом 180 итд.

package Lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorPerson {

    private static List<String> NAMES = new ArrayList<>();
    private static List<String> SURNAMES = new ArrayList<>();

    public static void main(String[] args) {

        readParameters("Name.txt", NAMES);
        readParameters("SurName.txt", SURNAMES);

        Person[] listOfPerson = new Person[100];


        for (int i = 0; i < listOfPerson.length; i++) {
            Person person = new Person(generateName(), generateSurName());
            person.setAge(generateAge());
            person.setWeigt(generateWeight());
            person.setHeight(generateHeight());
            listOfPerson[i] = person;
        }

        for (Person ofPerson : listOfPerson) {
            System.out.format(ofPerson.getName() + " " + ofPerson.getSurName() + " , age " + ofPerson.getAge() +
                    " , haight " + ("%.2f%n"ofPerson.getHeight()) + " , weight " + ofPerson.getWeigt());//здесь доб....
        }

    }

    private static double generateHeight() {
        return  160 + Math.random() * 200 - 160;

    }

    private static double generateWeight() {

        return 60 + Math.random() * 120 - 60;
    }

    private static int generateAge() {
        Random random = new Random();
        return random.nextInt(70 - 20) + 20;
    }

    private static void readParameters(String s, List<String> names) {
        try (BufferedReader br = new BufferedReader(new FileReader(s))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                names.add(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generateSurName() {
        Random random = new Random();
        int i = random.nextInt(SURNAMES.size());
        return SURNAMES.get(i);
    }

    private static String generateName() {
        Random random = new Random();
        int i = random.nextInt(NAMES.size());
        return NAMES.get(i);
    }
}