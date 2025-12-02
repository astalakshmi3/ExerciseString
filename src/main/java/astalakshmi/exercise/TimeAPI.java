package astalakshmi.exercise;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class TimeAPI {

    public static void main (String[] args) {
        calender();

        // 1. Create Local Date of the Current Day.
        LocalDate today = LocalDate.now();
        System.out.println("Ex 1:" + today);

        //2. Create Local Current day and following the pattern.
        LocalDate today1 = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM");
        System.out.println("Ex 2:" + today1.format(formatter));

        // 3.  create Local date of last monday
        LocalDate today2 = LocalDate.now();
        LocalDate lastMonday = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        for (int j = 0; j < 7; j++) {
            System.out.println(lastMonday.plusDays(j));
        }

        // 4. Create local date object from String using .parse().
        LocalDate date = LocalDate.parse("2024-03-15");
        System.out.println(date);

        // 5. Create local date of my birthday.
        LocalDate birthday = LocalDate.of(1987, 7, 3);
        DayOfWeek day = birthday.getDayOfWeek();
        System.out.println(day);

        // 6. Create current date plus 10 year and minus 10 year.
        LocalDate result = LocalDate.now().plusYears(10).minusMonths(10);
        System.out.println(result);

        // 7.Create year, month and day of my birthday.
        LocalDate birthday1 = LocalDate.of(1987, 7, 3);
        LocalDate modified = LocalDate.now().plusYears(10).minusMonths(10);

        Period p = Period.between(birthday1, modified);
        System.out.println(p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + " days");

        // 8. Create a period of 4 year, 7 months and 29 days.
        Period pe = Period.of(4, 7, 29);
        LocalDate result1 = LocalDate.now().plus(pe);
        System.out.println(result1);

        //9. Create object of current time.
        LocalTime now = LocalTime.now();
        System.out.println(now);

        // 10. Create nanosecond.
        LocalTime na = LocalTime.now();
        System.out.println(na.getNano());

        //11. Create String using .parse().
        LocalTime time = LocalTime.parse("10:32:53");
        System.out.println(time);

        // 12. Create Local time from Current time.
        LocalTime now2 = LocalTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(now.format(formatter1));

        // 13. Create LocalDateTime with date and time.
        LocalDate dat = LocalDate.of(2018,4,5);
        LocalTime dt = LocalTime.of( 10, 0);
        System.out.println(dt);

        // 14. Display the string look like exercise 13.
        LocalDateTime dat1 = LocalDateTime.of(2018, 4, 5, 10, 0);
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE d MMMM HH:mm");
        System.out.println(dat1.format(formatter4));


        //15. Create object by combining LocalDate and LocalTime.
        LocalDate date1 = LocalDate.of(2024, 1, 10);
        LocalTime time1 = LocalTime.of(14, 30);
        LocalDateTime date2 = LocalDateTime.of(date1, time1);
        System.out.println(dt);

        // 16. Get LocalTime and LocalDate to separate object.
        LocalDateTime cur = LocalDateTime.now();
        LocalDate date4 = cur.toLocalDate();
        LocalTime time2 = cur.toLocalTime();
        System.out.println(date4);
        System.out.println(time2);

    }
    // Simple Calculator for the year 2018.
    static void calender ()
    {
        for (int month = 1; month <= 12; month++) {
            YearMonth ym = YearMonth.of(2018, month);
            System.out.println("\n---- " + ym.getMonth() + " 2018 ----");

            for (int day = 1; day <= ym.lengthOfMonth(); day++) {
                System.out.println(LocalDate.of(2018, month, day));
            }
        }

    }
}
