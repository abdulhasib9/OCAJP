package dateandtime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FormatingDateTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1993, Month.JANUARY,3);
        LocalDateTime localDateTime = LocalDateTime.of(1299,Month.JANUARY,23,10,40,23);


        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        DateTimeFormatter dateTimeFormatterShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(dateTimeFormatterShort.format(localDateTime));

        DateTimeFormatter mediumDateTimeFormater = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(mediumDateTimeFormater.format(localDateTime));
        LocalTime localTime = LocalTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter dateTimeFormatterMedium = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
       // DateTimeFormatter dateTimeFormatterLarge = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        System.out.println(dateTimeFormatter.format(localTime));
        System.out.println(dateTimeFormatterMedium.format(localTime));
       // System.out.println(dateTimeFormatterLarge.format(localTime));

        //custom formatters
        DateTimeFormatter customFormator = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(customFormator.format(localDateTime));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
        System.out.println(new Date());
    }
}
