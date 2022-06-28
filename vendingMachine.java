//package javaInTwoS;
//
//import java.util.Scanner;
//
//public class vendingMachine {
//    char group, answer;
//    Scanner key = new Scanner(System.in);
//    System.out.println("***** LAB TIMES *****");
//
//        do //put code in a loop
//    {
//        //offer menu options
//        System.out.println(); //blank line
//        System.out.println("[1] Time for group A");
//        System.out.println("[2] Time for group B");
//        System.out.println("[3] Time for group C");
//        System.out.println("[4] QUIT");
//
//        System.out.println("Enter choice [1, 2, 3, 4]");
//        answer = key.next().charAt(0); //get response
//        System.out.println();
//
//        switch(answer) // process the users answer
//        {
//            case '1':
//                System.out.println("10.00 am");
//                break;
//
//            case '2':
//                System.out.println("13.00 pm");
//                break;
//
//            case '3':
//                System.out.println("11.00 am");
//                break;
//
//            case '4':
//                System.out.println("Goodbye!");
//                break;
//
//            default:
//                System.out.println("Options 1-4 only");
//        }
//    } while (response != '4'); //test for quit option
//}
