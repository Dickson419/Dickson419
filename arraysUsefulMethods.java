package javaInTwoS;

import java.util.Scanner;

public class arraysUsefulMethods {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int[] someArray; //declare an integer array
        //ask the user to determine the size of the array
        System.out.println("How many elements to store?");
        int size = keyboard.nextInt();

        someArray = new int[size];

        //method calls here
    }
    //methods to interact with the array
    //Array Maximum

    static int max(int[] arrayIn)
    {
        int result = arrayIn[0]; //set result to the first element

        //loop from the 2nd item to the last item in the array
        for(int i =1; i < arrayIn.length; i++) {
            if (arrayIn[i] > result) //compare one item to the next
            {
                result = arrayIn[i]; //perform a swap
            }
        } return result;
    }

    //array summation - calculate the total of all numbers in an array

    static int sum(int[] arrayIn)
    {
        int total = 0;
        for(int i = 0; i<arrayIn.length; i++)
        {
            total = arrayIn[i] + total;

        }
        return total;
    }

    //array memebership - used to determine if an element is in an array
    // i.e check if a new userID is already present

    static boolean checkMembership(int[] memberIn)
    {
        Scanner keyboard = new Scanner(System.in);
        int item = keyboard.nextInt();

        for(int i = 0; i<memberIn.length; i++)
        {
            if (memberIn[i] == item)
            {
                return true;
            }

        } return false;
    }

    //array search - finds an item in an array aka Linear search

    static int find(int[] findIn)
    {
        int found;
        Scanner keyboard = new Scanner(System.in);
        found = keyboard.nextInt();

        for(int i = 0; i<findIn.length; i++)
        {
            if(findIn[i] == found)
            {
                return findIn[i];
            }
        }
        return -999;
    }

}
