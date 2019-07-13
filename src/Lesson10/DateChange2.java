package Lesson10;
/*
Дз10
2. задана строка с датой вида `15.08.1995 18:30:15`. Написать методы:
- возвращает дату в формате `15 Aug`
- возвращает время в формате `6:30 pm`
2.1. Записать строку в файл.
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateChange2 {

    public static void main(String[] args) {

        String setDate = new String("15.08.1995 18:30:15");

        System.out.println(setDate);

        String changeDate = changeDate(setDate, "dd MMM");
        String changeTime = changeDate(setDate, "h:mm a");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test2.txt"))) {
            writer.write("возвращает дату в формате `15 Aug`    " + changeDate + "\r" +
                    "возвращает время в формате `6:30 pm`    " + changeTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String changeDate(String setDate, String s) {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy kk:mm:ss", Locale.US);
        try {
            Date date = df.parse(setDate);
            DateFormat destinationFormat = new SimpleDateFormat(s, Locale.US);
            return destinationFormat.format(date);
        } catch (Exception e) {
            System.out.println("Can't parse");
        }
        return setDate;
    }
}


