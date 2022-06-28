package javaInTwoS;

// Display the timestables using a for loop
//output should look like... 1 X 6 = 6 and so on

public class multiplicationForLoops {
    public static void main(String[] args) {
        int table = 6;
        for (int i = 1; i < 13; i++)
        {
            int answer = i*table;
            System.out.println(i + " X " + table + " = " + answer);
        }
    }
}

