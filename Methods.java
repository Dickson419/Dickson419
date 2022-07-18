package javaInTwoS;
import java.util.Scanner;

//METHOD - part of a class and contains instructions
//Normally performs a single well defined task i.e conversions, calculate area etc
// main is the method which has been used so far
//... what is called a function in Python!

public class Methods {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int day, month, year;

        //prompt for day
        System.out.println("Please enter your day of birth");

        //Display confidentiality message
//        System.out.println("Pleae note all information is kept in the strictest confidentiality");
//        System.out.println("No personal information will be shared with third parties");
        displayMessage();

        //prompt for month
        System.out.println("Please enter yout month of birth");

        //Display confidentiality message
//        System.out.println("Pleae note all information is kept in the strictest confidentiality");
//        System.out.println("No personal information will be shared with third parties");
        displayMessage();

        // prompt for year
        System.out.println("Please enter your year of birth");

        //Display confidentiality message
//        System.out.println("Pleae note all information is kept in the strictest confidentiality");
//        System.out.println("No personal information will be shared with third parties");
        displayMessage();

        //So we keep repeating 'confidentiality agreement'
        //        System.out.println("Pleae note all information is kept in the strictest confidentiality");
        //        System.out.println("No personal information will be shared with third parties");
        //If only we had a way to make this code more efficient...
        // CREATE a method and then call it!







    }

    //^^^ Declared outside of the class ^^^

    //STATIC = can be called by other methods in the class IF they too are static
    //VOID = \indicates that the method does not return information/data
    static void displayMessage()
    {
        //Display confidentiality message
        System.out.println("Pleae note all information is kept in the strictest confidentiality");
        System.out.println("No personal information will be shared with third parties");
        System.out.println();
    }






}
