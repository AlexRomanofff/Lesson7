package Lesson8;

        import java.util.Calendar;
        import java.util.GregorianCalendar;
        import java.util.Locale;

public class DayOfBirthdayWeek  {

    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        c.set(1981, Calendar.APRIL, 23);
        Locale loc = Locale.ENGLISH;
        System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG_FORMAT,loc));


        Calendar right = Calendar.getInstance();
        System.out.println(right.toInstant());
    }
}
