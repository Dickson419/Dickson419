package javaInTwoS;

//Array list introduction
//Lists can dynamically resize

// SYNTAX for LISTS
// ArrayList <Integer> grades
// < > = a generic = creates a class that can work with various types = put in a datatype!
// grades.add(5) --> use list to add a value in brackets
// grades.get(INDEX)
// grades.set(INDEX, VALUE) i.e (0, 10) update index 0 with a value of 10
// grades.size();

import java.util.ArrayList;
import java.util.List;

public class arrayPracticeThree {
    public static void main(String[] args){
        //Make a generic list called grades = Make a specific array list (could e a linked list, or data structure)
        List<Integer> grades = new ArrayList<Integer>();

        //add
        grades.add(4);
        grades.add(6);
        grades.add(1, 7); //index, element i.e number

        System.out.println(grades.get(2));
        //pass in index and get value
        System.out.println(grades.indexOf(4)); // -1 means does not exist
        //see is list contains an element. Can be used with an IF statement.
        System.out.println(grades.contains(7));
        if(grades.contains(4))
        {
            System.out.println("4 is here!");
        }

        //check if list is empty
        if(!grades.isEmpty()) //if grades is NOT empty
        {
            System.out.println(grades.get(0));
        }

        //in a While loop to remove elements
//        while(!grades.isEmpty())
//        {
//            System.out.println(grades.remove(0));
//        }
        grades.clear(); //remove all elements from a list



    }
}
