package javaInTwoS;

import java.util.Scanner;

public class whileLoopLesson {
    public static void main(String[] args) {
        //while(/* TEST GOES HERE */)
        {
            // Instructions to be repeated
        }

        // example 1
        System.out.println("What exam mark did you get?");
        int mark;
        Scanner keyboard = new Scanner(System.in);
        mark = keyboard.nextInt();

        while (mark < 0 || mark > 100) {
            //display error message and allow for re-input
            System.out.println("invalid, try again: ");
            mark = keyboard.nextInt();
        }
        //now out of the loop with a valid input
        if (mark >= 40) {
            System.out.println("You have passed!");
        } else {
            System.out.println("You have failed!");
        }

        System.out.println("Good luck with the next exam!");


        // DO WHILE loop
        //has test at end of loop rather than at the front
        //... it will always run once

        // do
        // {
        //   instructions to be repeated go here
        // } while (/* TEST goes here */) ; //note semi-colon

        char response; //variable to hold user's response
        do //place code in loop
        {
            //program instructions here
            System.out.println("Another go? (y/n)");
            response = keyboard.next().charAt(0); //get user reply
            //charAt(0) returns letter at set index

        } while (response == 'y' || response == 'Y'); //test at end of loop




        // Timetable, with menu, example code

        char group, answer;
        Scanner key = new Scanner(System.in);
        System.out.println("***** LAB TIMES *****");

        do //put code in a loop
        {
            //offer menu options
            System.out.println(); //blank line
            System.out.println("[1] Time for group A");
            System.out.println("[2] Time for group B");
            System.out.println("[3] Time for group C");
            System.out.println("[4] QUIT");

            System.out.println("Enter choice [1, 2, 3, 4]");
            answer = key.next().charAt(0); //get response
            System.out.println();

            switch(answer) // process the users answer
            {
                case '1':
                    System.out.println("10.00 am");
                    break;

                case '2':
                    System.out.println("13.00 pm");
                    break;

                case '3':
                    System.out.println("11.00 am");
                    break;

                case '4':
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Options 1-4 only");
            }
        } while (response != '4'); //test for quit option


    }
}
