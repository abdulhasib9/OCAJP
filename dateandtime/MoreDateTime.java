package dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class MoreDateTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1788, Month.APRIL,3);
        System.out.println(localDate);
        localDate = localDate.plusDays(3).plusMonths(3);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(12,43,22);
        System.out.println(localTime);
        localTime=localTime.plusHours(2).plusMinutes(2);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(1432,Month.APRIL,4,10,23);
        System.out.println(localDateTime);

        //before java 8

        Date myDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(myDate);
        calendar.set(Calendar.DATE,1);
    }
}
