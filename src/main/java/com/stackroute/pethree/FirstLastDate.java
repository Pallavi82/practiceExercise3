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
            c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()+1); //gets the week going on according to the default timezone

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy"); //the format in which date will be displayed

            System.out.println(simpleDateFormat.format(c.getTime())); //displays first date

            c.add(Calendar.DATE, 6); //first date of the week plus 6
            System.out.println(simpleDateFormat.format(c.getTime())); //displays last date of the week
        }
    }

