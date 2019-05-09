package com.stackroute.pethree;

/*Create a class with a main( ) that throws an object of class Exception inside a try block.
a. Give the constructor for Exception a String argument.
b. Catch the exception inside a catch clause and print the String argument.
c. Add a finally clause and print a message to prove you were there.*/

import java.lang.*;
import java.io.FileNotFoundException;

public class TryCatch {

    TryCatch(String msg) {

        msg = "This is bound to execute";
        System.out.println(msg);

    }

    public static void main(String[] args) throws Exception {
        try {
            throw new FileNotFoundException();
        }
        catch (FileNotFoundException e) {
            throw new Exception("File not found");  //throws FileNotFound Exception
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

            System.out.println("Finally block executed"); //Finally block gets executed
        }

    }
}

