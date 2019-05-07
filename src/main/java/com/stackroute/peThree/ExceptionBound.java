package com.stackroute.peThree;

import java.util.Scanner;

public class ExceptionBound {

            public static void main (String[] args) {

            while (true) {

                int[] a = {1, 2, 3};
                int num;
                System.out.print("Enter number of integers : ");

                Scanner input = new Scanner(System.in);
                num = input.nextInt();

                try {
                    a = new int[num];
                    System.out.print("Enter number : ");
                    num = input.nextInt();
                    System.out.println(a[num]);
                    a = new int[num];
                }
                catch (NegativeArraySizeException x) {
                    System.out.println(x);
                }
                catch (IndexOutOfBoundsException x) {
                    System.out.println(x);
                }
                catch (NullPointerException x) {
                    System.out.println(x);
                }
                finally {
                    System.out.println("Finally arrived");
                }

                }
        }
    }
