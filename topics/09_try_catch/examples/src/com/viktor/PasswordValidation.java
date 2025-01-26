package com.viktor;

import java.util.Scanner;

public class PasswordValidation {

    public static void validate(String pass){
        boolean isValid = false;
        // logic

        if(!isValid){
            throw new IllegalStateException("Password is not valid because 123");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Print pass!");
            String input = scanner.next();

            try
            {
                validate(input);
                break;
            }
            catch (IllegalStateException e)
            {
                System.out.println(e.getMessage());
                System.out.println("Try again!");
            }
        }
    }
}
