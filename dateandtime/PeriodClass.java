package dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class PeriodClass {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1233, Month.JANUARY,3);
        Period period = Period.ofWeeks(1);
        date =date.plus(period);
        System.out.println(date);
        System.out.println(LocalDateTime.now().plus(period));

        //Note !!
        //we can not chain method with period
    }


}
