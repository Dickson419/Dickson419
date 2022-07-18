package javaInTwoS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayPracticeListsFour {
    public static void main(String[] args){
        List<Integer> grades = Arrays.asList(5, 4, 6, 7, 8, 9, 12, 34, 67); //returns a list from an array

        //print the list. Convert to array then to a string - similar to print array method but extra step!
        System.out.println(Arrays.toString(grades.toArray()));

        //iterate with a for loop
        //grades.size() --> will need this method to get list length
        for(int i = 0; i < grades.size(); i++)
        {
            System.out.println(grades.get(i)); //.get() replaces grades[i] for using index
            grades.set(i, grades.get(i) * 2); //change to value of i to be multiplied by two
            System.out.println(grades.get(i));
            System.out.println();
        }

        System.out.println();
        System.out.println("FOR EACH");
        //FOR EACH loop
        //Does the same as above...

        for(int grade : grades) // grade takes the place of i : grades is where i comes from
        {
            System.out.println(grade); //numers have been doubled so printed result shows that
        }



    }

}
