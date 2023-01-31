package dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate localDate= LocalDate.of(1999, Month.APRIL,1);
        LocalTime localTime = LocalTime.of(10,30);

        //Date classes from java 7
        System.out.println("----------------------------------------------------------------");
        System.out.println(new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.set(1999,calendar.JANUARY,3);
        Date january = calendar.getTime();
        System.out.println(january);

    }
}
