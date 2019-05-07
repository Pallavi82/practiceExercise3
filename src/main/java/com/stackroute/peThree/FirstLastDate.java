package com.stackroute.peThree;

import java.util.*;
import java.text.SimpleDateFormat;

public class FirstLastDate {

        public static void main(String[] args) {

            Calendar c = Calendar.getInstance();
            c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()+1);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");

            System.out.println(simpleDateFormat.format(c.getTime()));

            c.add(Calendar.DATE, 6);
            System.out.println(simpleDateFormat.format(c.getTime()));
        }
    }

