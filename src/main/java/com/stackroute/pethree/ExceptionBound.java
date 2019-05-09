package com.stackroute.pethree;

/*Write a program that will generate exceptions of type NegativeArraySizeException,
  IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
  displaying the message stored in the exception object.*/

import java.util.Scanner;

public class ExceptionBound {

            public static void main (String[] args) {

            while (true) {

                int[] arr =new int[5];  //taking an array of size 5

                int num;

                System.out.print("Enter number of integers : ");
                Scanner input = new Scanner(System.in);  //asking user to input the number of integers to be taken

                num = input.nextInt();

                try {

                    for(int i=1;i<num;i++)  //loop to input integers into enter array
                    {
                        System.out.println(arr[num]);
                    }
                    System.out.print("Enter number : ");
                    Scanner input1 = new Scanner(System.in); //asking user to input integers in the array
                    int no = input1.nextInt();

                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.toString());  //throws ArrayIndexOutOfBound Exception
                }
                catch (NegativeArraySizeException x) {
                    System.out.println(x);   //throws NegativeArraySize Exception
                }
                catch (NullPointerException x) {
                    System.out.println(x);  //throws NullPointer Exception
                }
                finally {
                    System.out.println("Finally arrived"); //Finally block gets executed
                }

            }
        }
    }