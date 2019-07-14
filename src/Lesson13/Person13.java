package Lesson13;

public class Person13 {
    public static void main(String[] args) {

        ExtendedPerson person1 = new ExtendedPerson("Гончар Сергей Владимирович");
        String fullName = person1.getFullName();
        System.out.println(fullName);

        ExtendedPerson person = new ExtendedPerson("Гончар","Сергей",
                "Владимирович","15.12.1977");

        String shortName = person.getShortName();
        System.out.println(shortName);
        int age = person.getAge();
        System.out.println( "Полных лет " + age);

    }
}
