package com.stackroute.peThree;

import java.util.Scanner;

public class StudentMarks {


        private int lowestGrade = 0;
        private int highestGrade = 100;

        private int[] stuGrades;

        private Scanner in;

        public static void main(String[] args)
        {
            StudentMarks studentMarks = new StudentMarks();
            studentMarks.in = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            int numOfStudents = studentMarks.in.nextInt();

            studentMarks.averageOfGrades(numOfStudents);
        }

        private void averageOfGrades(int numOfStudents)
        {
            if (numOfStudents <= 0) {
                System.out.println("Invalid number of students.");
                return;
            }
            stuGrades = new int[numOfStudents];

            double sum = 0;
            int    i   = 0;
            while (i < numOfStudents)
            {
                System.out.printf("Enter the grade for student  %1$d:", (i+1));
                int grade = in.nextInt();

                if ((grade >= lowestGrade) && (grade <= highestGrade)) {

                    stuGrades[i] = grade;
                    sum = sum + grade;
                    i++;
                    continue;
                }
                System.out.println("Invalid grade, please try again.");
            }
            System.out.printf("The average is : %1$.2f\n", (sum / numOfStudents));
        }

    }
