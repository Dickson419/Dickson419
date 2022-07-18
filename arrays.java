package javaInTwoS;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args){

        //array creation
        //cannot mix data types
        //declare type, [] to specify array, name array
        //double [] temperature;
        int [] age;

        //assign space in memory
        //someArray = new int[10]; //size of array is 10
        //temperature = new double[7]; //array size of 7(items)
        double[] height = new double[7];

        //FOR loop to iterate through an array
        double[] temperature = {23, 31.2, 23.5, 12.8, 16.6, 26.5, 27}; //with {} no need to allocate memory manually

        for(int i=0; i < temperature.length; i++) //use of length method
        {
            System.out.println(temperature[i]);
        }

        // TEMPERATURE READOUT PROGRAM

        Scanner keyboard = new Scanner(System.in);
        //create array and allocate memory
        double [] temp;
        temp = new double[7];

        //enter temperatures
        for(int i = 0; i< temp.length; i++)
        {
            System.out.println("Enter a temperature for the day: ");
            temp[i] = keyboard.nextDouble();
        }

        //display temperatures
        System.out.println();
        System.out.println("*** Temperatures entered ***");
        System.out.println();

        for(int i = 0; i<temp.length; i++)
        {
            System.out.println("Day" + (i+1) + " " + temp[i]);
        }


    }

}
