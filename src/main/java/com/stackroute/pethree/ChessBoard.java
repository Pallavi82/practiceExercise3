package com.stackroute.pethree;

/*Write a program to create a ChessBoard pattern with the help of multidimensional array, where
        WWrepresents white color and BB represents Black color.
        Output:
        My Chess Board
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|*/

public class ChessBoard {

        public static void main(String args[]) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if ((i + j) % 2 == 0)
                        System.out.print("WW|"); //displays WW(white) whenever the row position plus column position is divisible by 2
                    else
                        System.out.print("BB|"); //displays BB(black) else
                }
                System.out.println();
            }
        }
    }
