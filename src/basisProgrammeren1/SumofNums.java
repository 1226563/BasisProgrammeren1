package basisProgrammeren1;

import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number: ");
        int number = 0;

        for (int i =0; i<10; i++) {
            System.out.print("Enter a number: ");
            number = console.nextInt();
            sum = sum + number; 
        }

        System.out.println("The sum is " + sum);

    }
}