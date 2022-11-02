package school.mjc.stage0.conditions.finalTask;

import java.time.DateTimeException;
import java.time.Month;

public class DaysInMonth {
    public void printDays(int year, int month) {
        try {
            Month of = Month.of(month);
            if (((((year % 4) == 0) && ((year % 100) != 0)) || year % 400 == 0)) {
                System.out.println(of.length(true));
            } else {
                System.out.println(of.length(false));
            }
        } catch (DateTimeException e) {
            System.out.println("invalid date");
        }


    }
}
