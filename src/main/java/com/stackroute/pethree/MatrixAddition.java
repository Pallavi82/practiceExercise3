package com.stackroute.pethree;

/*Write a program to compute the addition of two matrix, Read the number of rows and columns
as input, also the values of each matrix
Output:
Input number of rows of matrix: 3
Input number of columns of matrix: 2
Input elements of first matrix: 1 2 3 4 5 6
Input the elements of second matrix: 9 8 7 6 5 4
Sum of the matrices:-
10 10
10 10
10 10
 */

import java.util.Scanner;

public class MatrixAddition {

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            System.out.print("Input number of rows in the matrix: ");
            int rows = s.nextInt();

            System.out.print("Input number of columns in the matrix: ");
            int columns = s.nextInt();

            int[][] a = new int[rows][columns];
            int[][] b = new int[rows][columns];

            System.out.println("Input elements of first matrix: ");

            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < columns; j++) {

                    a[i][j] = s.nextInt();
                }
            }
            System.out.println("Input elements of second matrix: ");

            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < columns; j++) {

                    b[i][j] = s.nextInt();
                }
            }

            int[][] c = new int[rows][columns];

            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < columns; j++) {

                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("The sum of the two matrices is");

            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < columns; j++) {

                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
