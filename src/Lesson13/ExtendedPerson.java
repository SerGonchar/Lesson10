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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

public class ExtendedPerson {

    private String surName;
    private String name;
    private String patronymic;
    private String dateBirth;

    public ExtendedPerson(String name, String surName, String patronymic, String dateBirth) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.dateBirth = dateBirth;
    }

    public ExtendedPerson(String name, String surName, String patronymic) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
    }

    public ExtendedPerson(String allname) {
        String[] part = allname.split(" ");
        this.surName = part[0];
        this.name = part[1];
        this.patronymic = part[2];
    }

    public String getFullName() {
        return "фио " + "\"" + surName + " " + name + " " + patronymic + "\"";
    }

    public String getShortName() {
        return name + " " + surName.substring(0, 1) + ". " + patronymic.substring(0, 1) + ". ";
    }

    public int getAge() {
        if (dateBirth != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            int diff = 0;
            try {
                Date date = sdf.parse(dateBirth);
                Calendar dateOfBirth = Calendar.getInstance();
                dateOfBirth.setTime(date);
                Calendar dateNow = Calendar.getInstance();
                diff = dateNow.get(YEAR) - dateOfBirth.get(YEAR);
                if (dateOfBirth.get(MONTH) > dateNow.get(MONTH) ||
                        (dateOfBirth.get(MONTH) == dateNow.get(MONTH) && dateNow.get(DATE) > dateOfBirth.get(DATE))) {
                    diff--;
                }
            } catch (ParseException e) {
                System.out.print("дата рождения непонятна" + e.getMessage());
            }
            return diff;
        }
        return 0;
    }
}
