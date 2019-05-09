package com.stackroute.pethree;

/*Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
assume the digits are a string and use split()
Input: 98,96,95,94,93
Output: 98,96,95,94,93 non consecutive numbers
Input: 54,53,52,51,50,49,48
Output : 54,53,52,51,50,49,48 are consecutive numbers
Input: 1,2,3,4,5,6,6
Output: 1,2,3,4,5,6,6 non consecutive numbers*/

import java.lang.Math;

public class SeriesOfSevenDigits {

    public void checkDigits(int[] input) {

        for (int i = 0; i < input.length - 1; i++) {
            if (Math.abs(input[i] - input[i + 1]) != 1) //checks if absolute of index i minus absolute of index i+1 is not 1 then displays "not consecutive num"

                System.out.println("Not consecutive numbers");
        }

        System.out.println("Consecutive numbers");
    }


    public static void main(String[] args) {

        SeriesOfSevenDigits seriesOfSevenDigits = new SeriesOfSevenDigits();
        int[] input1={3,4,5,6,7,8,9};
        seriesOfSevenDigits.checkDigits(input1);

    }
}

//this program will print consecutive numbers because 3,4,5,6,7,8,9 are consecutive numbers