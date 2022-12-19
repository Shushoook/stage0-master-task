package com.epam.conditions;

import java.time.LocalDate;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year > 0 && month < 13 && month > 0) {
            LocalDate localDate = LocalDate.of(year, month, 1);
            System.out.println(localDate.lengthOfMonth());
        } else {
            System.out.println("invalid date");
        }
    }

}
