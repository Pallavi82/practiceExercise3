package com.stackroute.pethree;

/*Write a program to set up an array of places, Loop round and remove the vowels. Display the new
words in console
Input:
India
United States
Germany
Egypt
czechoslovakia
Output:
Place Name without Vowels:0 Ind
Place Name without Vowels:1 Untd Stts

Place Name without Vowels:2 Grmny
Place Name without Vowels:3 Egypt
Place Name without Vowels:4 czchslvk */

import java.util.Scanner;

public class ArrayOfPlaces {

    public String[] removeVowels(String[] input) {  //removes vowels from the string input
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
        System.out.println("Enter number of places to be considered ");  //asks the user to input the number of places which are to be considered

        int numOfElements = input.nextInt();
        String[] elements=new String[numOfElements]; //elements array to input places

       for (int i = 0; i < numOfElements; i++) {  //loop to input the places in elements array

            System.out.println("Please enter an element");
            elements[i]=input.next() + " ";
        }


        ArrayOfPlaces arrayOfPlaces = new ArrayOfPlaces(); //arrayOfPlaces object created
        String[] modifiedWords=arrayOfPlaces.removeVowels(elements); //calls the removeVowels function
        for (String word:modifiedWords) {
            System.out.println(word);
        }

    }
}