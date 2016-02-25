package Lesson8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Frame8_2  {
    public static void main(String[] args) throws Exception {
        LocalDate dateOfBirth = LocalDate.of(1981, Month.APRIL, 23);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String date = dateOfBirth.format(formatter);
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        System.out.println(sdf.format(date1));

        Date date2 = sdf.parse("23 квіт. 2000");
        System.out.println(sdf.format(date2));

    }


}
