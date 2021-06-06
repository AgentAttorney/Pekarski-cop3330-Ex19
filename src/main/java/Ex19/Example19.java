package Ex19;
import javax.swing.*;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example19 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your height in inches and weight? ");
        int height = input.nextInt();
        int weight = input.nextInt();
        if((height < 0 || (weight < 0)))
        throw new ArithmeticException("You did not enter a valid weight and/or height");

        System.out.println("You entered a valid weight and height.");
        Person first_person = new Person();
        first_person.setHealth(height, weight);
        double person_BMI = first_person.determineBMI();
        if(person_BMI < 18.5 || person_BMI > 25)
        {
            // unhealthy weight
            // System.out.print("case BMI bad");
            System.out.print("Make sure you consult your doctor about your health.");
        }
        else
        {
            // healthy weight
            //System.out.print("Case BMI good");
            System.out.print("You are in a healthy BMI range, remember to stay healthy.");
        }


    }
}
