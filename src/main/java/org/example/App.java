/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = scanner.nextInt();

        final int drivingAge = 16;

        int res = (age < drivingAge) ? 1 : 0;
        if (res == 1)
            System.out.println("You are not legally old enough to drive.");
        else if (res == 0)
            System.out.println("You are legally old enough to drive.");
    }
}