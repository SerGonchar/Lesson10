/*1.1 Написать класс Person, у которого если следующие поля:
- Фамилия, Имя, Отчество, дата рождения.
Написать конструкторы:
- на все поля,
- только на ФИО
- который принимает 1 параметр - строку с полным именем "Иванов Иван Иванович",
 и задает отдельные значения в поля Фамилия, Имя, Отчество.
Написать методы:
- который возвращает полное ФИО типа "Иванов Иван Иванович"
- краткое ФИО типа "Иванов И. И."
- который на основе даты рождения выводит количество полных лет.
*/


package Lesson13;

public class ExtendedPerson {
    private String name;
    private String surName;
    private String patronymic;
    private int dateBirth;

    public ExtendedPerson(String name, String surName, String patronymic) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
    }

    public ExtendedPerson(String name, String surName, String patronymic, int dateBirth) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.dateBirth = dateBirth;
    }
    public ExtendedPerson (String  fullname){
        String[] part = fullname.split(" ");
        this.surName = part[0]; // это фамилия
        this.name = part[1];
        this.patronymic = part [2];
    }
}
