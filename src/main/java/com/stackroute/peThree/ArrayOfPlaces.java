package com.stackroute.peThree;

import java.util.Scanner;

public class ArrayOfPlaces {

    public String[] removeVowels(String[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i].contains("a")) {
                input[i] = input[i].replace("a", "");
            }

            if (input[i].contains("e")) {
                input[i] = input[i].replace("e", "");
            }

            if (input[i].contains("i")) {
                input[i] = input[i].replace("i", "");
            }

            if (input[i].contains("o")) {
                input[i] = input[i].replace("o", "");
            }

            if (input[i].contains("u")) {
                input[i] = input[i].replace("u", "");
            }
        }
        return input;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of places to be considered ");

        int num_of_elements = input.nextInt();
        String[] elements=new String[num_of_elements];

       for (int i = 0; i < num_of_elements; i++) {

            System.out.println("Please enter an element");
            elements[i]=input.next() + " ";
        }


        ArrayOfPlaces arrayOfPlaces = new ArrayOfPlaces();
        String[] modifiedWords=arrayOfPlaces.removeVowels(elements);
        for (String word:modifiedWords) {
            System.out.println(word);
        }

    }
}