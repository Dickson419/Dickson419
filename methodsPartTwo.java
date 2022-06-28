package javaInTwoS;

import java.util.Scanner;

//variables have SCOPE this means where the program can see them. Normally in brackets as part of a method these will be LOCAL variables/scope
public class methodsPartTwo {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        double price, tax;
        System.out.println("*** Product Price check ***");
        System.out.println("Enter initial price: ");
        price = keyboard.nextDouble();
        System.out.println("Enter tax rate: ");
        tax = keyboard.nextDouble();

        //Original code...
        //price = price * (1 + tax/100);

        price = addTax(price, tax); //method call. Takes two parameters as input
        System.out.println("Cost after tax = " + price);

        System.out.println(isEven(3));
    }

    //STATIC - can be used by the class
    //DOUBLE - replaces VOID as a data type of double is to be returned
    //BRACKETS - data types declared. Formal parameters
    static double addTax(double priceIn, double taxIn)
    {
        return priceIn * (1 + taxIn/100);
    }

    //More examples of methods
    //Square Root
    static double squareRoot(double numberIn)
    {
        return numberIn * numberIn;
    }

    //Return the bigger value
    static int max(int firstIn, int secondIn) {
        if (firstIn > secondIn)
        {
            return firstIn;
        }
        else
        {
            return secondIn;
        }

    }

    //Check if a number is even

    static boolean isEven(int numberIn)
    {
        if(numberIn % 2 == 0)
        {
            return true;
        }
        return false;
    }


    

}
