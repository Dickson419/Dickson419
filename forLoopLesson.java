package javaInTwoS;

import java.util.Scanner;

public class forLoopLesson {
    public static void main(String[] args){
        //Repeat something 5 times
        for(int i =1; i <=5; i++) //loop to repeat 5 times
        {
            System.out.println("*****");
        }

        //count up to 10
        System.out.println("Display the numbers 1-10 using a for loop!");
        for(int i = 1; i<=10; i++)
        {
            System.out.println(i);
        }

        //Only display even numbers
        System.out.println("Even numbers from 10 to 1");
        System.out.println();

        for(int i = 10; i >=1; i--)
        {
            //body of the loop containing an if statement
            if(i % 2 == 0) //check if number is even - look at remainder(evens have no remainder)
            {
                System.out.println(i);
            }
        }

        //Nested loops

        System.out.println("Nested loop");
        for(int i = 1; i <=5; i++) //Outer loop - how many rows
        {
            for(int j = 1; j <= 5; j++) { //inner loop - how many stars
                System.out.println("*");
                //inner loop ends here
            }
            System.out.println(); //start a new line
        }

        //Display a triangle of stars

        System.out.println("Display a triangle of stars");
        for(int i = 1; i <= 5; i++ ) //outer loops controls the number of rows
        {
            //inner loop determines how many stars in each row
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*"); //make sure not printLn
            }
            System.out.println();
        }


        // Display a set amount of stars by asking for input

        int number; // to hold user number
        Scanner keyboard = new Scanner(System.in);
        // ask for user response
        System.out.println("How many squares?");
        number = keyboard.nextInt();

        for(int i = 1; i <= number; i++) //number of rows fixed to 'number'
        {
            for(int j = 1; j<= number; j ++) //number of stars fixed to number
            {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
