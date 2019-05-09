package com.stackroute.pethree;

/*Write a java program to calculate first and last date of a week.
        Output:
        First Date of Week: Mon 24/07/2017
        Last date of the week: Sun 30/07/2017*/

import java.util.*;
import java.text.SimpleDateFormat;

public class FirstLastDate {

        public static void main(String[] args) {

            Calendar c = Calendar.getInstance(); //gets default time zone
            c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()+1);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy"); //format of the date

            System.out.println(simpleDateFormat.format(c.getTime()));

            c.add(Calendar.DATE, 6);
            System.out.println(simpleDateFormat.format(c.getTime()));
        }
    }

