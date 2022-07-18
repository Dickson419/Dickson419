package javaInTwoS;
import java.util.Scanner;

public class loopExercises {
    public static void main(String[] args){
        //1a. Display all even numbers from 1-20
        //1b. Modify ex1 so that the user enters a number. Output should display all even numbers from 1-userNumber
        //1c. Modify the program further so that it shows which are odd and even numbers i.e 1 is odd, 2 is even...

//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("What number do you want to go up to? ");
//        int number = keyboard.nextInt();
//
//        for(int i = 0; i<= number; i++)
//        {
//            if(i % 2 == 0)
//            {
//                System.out.println(i + " Is Even");
//            }
//            else
//            {
//                System.out.println(i + " Is Odd");
//            }
//        }

        //2. Display the following shapes. Hint: Nested loops
        //******
        //******
        //******

        for(int i = 1; i < 4; i++)
        {
            for(int j = 1; j<=6; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        //***
        //***
        //*********
        //*********
        //***
        //***

        for(int i =1; i<=2; i++){
            for(int j = 1; j<=3; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }

        //****
        //***
        //**
        //*

        for(int i = 0; i< 4; i++) //outer loop runs four times
        {
            for(int j = 0; j<=i; j++) //inner loop -
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i< 4; i++) //outer loop runs four times
        {
            for(int j = 4; j>=i; j--) //inner loop - start with 4 *s. Control follows i if J is > execute loop
            {
                System.out.print("*");
            }
            System.out.println();
        }


        //Use a for loop to display the 6 times table. Modify this so the user inputs
        //which times table they want displayed.

        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.print("Enter a number to see the times table for it: ");

        for(int i = 1; i<=12; i++)
        {

                System.out.println(number +" X " + i + " = " + number*i);

        }



        //Carry out calculations about a circle. Add a menu option.



        //Create a virtual vending machine. It should have a menu and keep a record of of many items
        //are 'sold'. When the user exits display how many items have been sold.






    }
}
