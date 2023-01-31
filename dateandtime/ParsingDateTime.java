package dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate localDate = LocalDate.parse("02 15 2019", dateTimeFormatter);

        System.out.println(localDate);
        String dateString = localDate.format(dateTimeFormatter);
        System.out.println(dateString);

        LocalDate StringToDate = LocalDate.parse(dateString, dateTimeFormatter);
        System.out.println(StringToDate);

    }
}
