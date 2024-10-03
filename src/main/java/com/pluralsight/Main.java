package com.pluralsight;
import java.util.*;


public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        //declare variables
        String firstName;
        String middleName;
        String lastName;
        String suffix;
        String suffixComma = ", ";

        //inputs
        System.out.println("Welcome the the Full Name Generator. Please enter your first name: ");
        firstName = reader.nextLine();

        System.out.println("Enter your middle name. If you do not have one, please press the enter button: ");
        middleName = reader.nextLine();
       // reader.nextLine();

        System.out.println("Enter your last name: ");
        lastName = reader.nextLine();

        System.out.println("If you have a suffix, please enter here. " +
                "If you do not have one, please press the enter button: ");
        suffix = reader.nextLine();
       // reader.nextLine();

        String fullName = firstName + " " + middleName + " " + lastName + suffixComma + suffix;

        if(middleName.equals (" ")){
            fullName = fullName.replaceAll(middleName, " ");
        }

      /*trying to format suffix the same one as middle name with mixed success :/
       if(suffixComma.equals (" ")){
            fullName = fullName.replaceAll(suffixComma, " ");
        } */

        System.out.println("Full name: " + fullName);

    }
}