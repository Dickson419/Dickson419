package codeWarsChallenges;
import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class inBetween {
    public static void main(String[] args){
        between(1,5);

}
    public static int[] between(int a, int b) {
        // your code here

        int c = (b-a)+1; //get the length of the array. B is larger number - small + 1 gets the range
        int [] someArray = new int[c]; //array now the length of what ever the range is

        for(int i = 0; i < someArray.length; i++)
        {
            if(a <= b)
            {
                someArray[i] = a;
                a += 1; //increment a THE NUMBER. i will auto increment with loop.

            }
        }

        return someArray;
    }
}

