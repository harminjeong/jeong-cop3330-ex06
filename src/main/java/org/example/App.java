/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
package org.example;
import java.util.Scanner;
import java.util.Calendar;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String inputAge = input.nextLine();
        int age = Integer.parseInt(inputAge);
        System.out.print("At what age would you like to retire? ");

        String inputTarget = input.nextLine();
        int target = Integer.parseInt(inputTarget);
        int yearsLeft = target - age;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int targetYear = currentYear + yearsLeft;

        String output = "You have " + yearsLeft + " years left until you can retire.\n" + "It's " + currentYear + ", so you can retire in " + targetYear +  ".";

        System.out.print(output);
    }
}
