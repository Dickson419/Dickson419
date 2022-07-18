package javaInTwoS;

import java.util.Scanner;

public class arraysMultiDimensional {
    public static void main(String[] args){
        //declare a 2D array
        double [][] temperature;
        temperature = new double[4][7]; //Create memory
        //4 down, 7 across i.e 4 weeks and 7days per week

        //initialise a 2D array
        int [][] a2DArray = {
                {11, 34, 3, -2},
                {45, 11, 4, -5}
        };

        //Nested for loops are used to process/control access to a 2D array
        Scanner keyboard = new Scanner(System.in);

        //outer loop controls the week column
        for (int week = 1; week <= temperature.length; week++ )
        {
            for(int day = 1; day <= temperature[0].length; day++)
            {
                System.out.println("Enter temperatures for the week: ");
                //must take one off the loop counters (as they start at 0
                temperature[week-1][day-1] = keyboard.nextDouble();
            }
        }
    }
}
