package javaInTwoS;

import java.util.Arrays;
import java.util.List;

public class ArrayPracticeTwo {
    public static void main(String[] args){

                                //ARRAY METHODS

        //COMPARING ARRAYS

        String[] first = new String [5];
        int[] second = {34,67,89,53,68,13,11,90};

//        if(Arrays.equals(first, second))
//        {
//            System.out.println("Arrays are equal");
//        }
//        else
//        {
//            System.out.println("Arrays are NOT equal");
//        }

                                //FILL
        //fill an array with characters, spaces, null etc
        Arrays.fill(first, "");
        System.out.println(Arrays.toString(first));

        //as a List - a more dynamic way of storing data
        //Keyword List: <> for data type: Name: = an array
        List <String> test = Arrays.asList(first);
        System.out.println(test);

                                //2D Arrays

        int[][] grades = new int[5][5]; //creates a 5x5 table
        int [][] grades2 = {
                {1, 2, 3},
                {4, 5, 6, 10, 12},
                {7, 8, 9}
        }; // to get 5 grades2[1][1]

        System.out.println(grades2.length); //how many indexes
        System.out.println(grades2[1].length); //how many elements in each row

        //two for loops needed when working with 2D arrays
        for(int row = 0; row < grades2.length; row++) //handles row
        {
            for(int col = 0; col < grades2[row].length; col++) //handles column
            {
                System.out.print(grades2[row][col]); //display contents of row
            }
            System.out.println(); //new line for next row
        }


    }
}
