package javaInTwoS;

import java.util.Scanner;

public class methodAreaOfACircle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double radius = -999; //dummy value to show something has been entered
        char choice; //to store menu option/choice

        do
        {
            System.out.println(); //blank line
            System.out.println("**** CIRCLE CALCULATIONS ****");
            System.out.println();
            System.out.println("[1] Enter the radius of the circle");
            System.out.println("[2] Display the area of the circle");
            System.out.println("[3] Display the circumference of the circle");
            System.out.println("[4] QUIT");

            System.out.println("Enter choice [1, 2, 3, 4]");

            choice = keyboard.next().charAt(0); //take the first number

            switch (choice) // process the users answer
            {
                case '1':
                    radius = option1();
                    break;

                case '2':
                    option2(radius);
                    break;

                case '3':
                    option3(radius);
                    break;

                case '4':
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Options 1-4 only");
            }
        } while(choice != 4);



    }
    //option 1 gets the user to enter the radius of the circle
    static double option1()
    {
        double myRadius; //local variable
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        myRadius = keyboard.nextDouble();
        return myRadius;
    }

    //option 2 calculates and displays the area of a circle
    static void option2(double radiusIn)
    {
        if (radiusIn == -999)
        {
            System.out.println("Radius has not been entered");
        }
        else
        {
            double area; //local variable
            area = 3.1416 * radiusIn * radiusIn; //calculate the area
            System.out.println("the area of the circle is: " + area);
        }
    }

    //option 3 calculates and displays the circumference of the circle

    static void option3(double radiusIn)
    {
        if(radiusIn == -999)
        {
            System.out.println("Radius has not been entered");
        }
        else
        {
            double circumference; //local variable
            circumference = 2 * 3.1416 * radiusIn;
            System.out.println("The circumference is "+ circumference);
        }
    }
}
