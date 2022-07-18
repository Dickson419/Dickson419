package javaInTwoS;

import java.util.Scanner;

//code will be similar to the previous array code but making use of methods

public class arraysAsMethods {
    public static void main(String[] args){
        double [] temperature;
        temperature = enterTemps(); //change from memory allocation to a method call
        displayTemps(temperature); //METHOD calls



    }

    // ... = varargs (variable arguments)
    //Allow to enter a series of doubles(data types) into the method
    //which are then placed into an array.
    //rather than passing an array -> gives flexability
//    static void enterTemps(double... temperatureIn)
//    {
//        Scanner keyboard = new Scanner(System.in);
//        for(int i = 0; i< temperatureIn.length; i++)
//        {
//            System.out.println("Enter max temperature: ");
//            temperatureIn[i] = keyboard.nextDouble();
//        }
//    }

    //Alt version to RETURN an array

    static double[] enterTemps()
    {
        Scanner keyboard = new Scanner(System.in);
        double[] temperatureOut = new double[7];

        for(int i = 0; i < temperatureOut.length; i++)
        {
            System.out.println("Enter the MAX temperature for the day: ");
            temperatureOut[i] = keyboard.nextDouble();
        }
        return temperatureOut;
    }

    //method to display temperature
    static void displayTemps(double[] temperatureIn)
    {
        System.out.println();
        System.out.println("*** TEMPERATURES ENTERED ***");
        System.out.println();

        for(int i = 0; i < temperatureIn.length; i++)
        {
            System.out.println("Day " + i+1 + " " + temperatureIn[i]);
        }
    }

    // return an array
}
