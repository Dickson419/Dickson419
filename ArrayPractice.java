package javaInTwoS;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){

        //declare array of length 10
       // int[] grades = new int[10];
//        int[] grades = {1,2,3,4,5,6,7,8,9,10}; //initialise an array of length as many items given to it.
//
//
//        //print how many elements
//        System.out.println(grades.length);
//
//        grades[2] = 2;
//        grades[1]= 12;
//
//        //print an individual element with indexing
//        System.out.println(grades[2]);
//
//        //printing arrays
//        System.out.println(grades); //returns a memory location...
//
//        System.out.println(Arrays.toString(grades)); //displays contents of array
//        //System.out.println(Arrays.deepToString(grades)); prints 2D arrays
//
//                                        //ITERATE THROUGH AN ARRAY
//
//        int[] newGrades = new int[10];
//
//        Scanner keyboard = new Scanner(System.in);
//        Scanner input = new Scanner(System.in);
//        for(int i = 0; i<newGrades.length; i++)
//        {
//            System.out.println("What grade did you get?");
//            newGrades[i] = keyboard.nextInt();
//        }
//
//        System.out.println(Arrays.toString(newGrades));
//        System.out.println();
//
//
//                                        //USER TO DECLARE LENGTH OF ARRAY
//
//
//        int size = input.nextInt();
//        System.out.println("Enter the length of array required: ");
//        int[] assessment = new int[size];
//
//        for(int i = 0; i < assessment.length; i++)
//        {
//            System.out.println("Enter your assessment grades: ");
//            assessment[i] = input.nextInt();
//        }
//
//        System.out.println(Arrays.toString(assessment));


                                // SEARCH THROUGH AN ARRAY

        int[] nextAssessment = {3,4,3,4,5,6,6,7,8,9,4}; //declare array
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter grade to find: ");
        int find = keyboard.nextInt(); //take input
        int total = 0;

        for(int i = 0; i<nextAssessment.length; i++) //iterate over total length of array
        {
            if(nextAssessment[i] == find)
            {
                System.out.println("FOUND at index " + i);
                total += 1;
            }

        }System.out.println("TOTAL found in array = " + total);


                                //SORT ARRAY

        Arrays.sort(nextAssessment); //sort smaller arrays
        //Arrays.parallelSort(nextAssessment); //method for bigger arrays

        System.out.println(Arrays.toString(nextAssessment));





    }
}
