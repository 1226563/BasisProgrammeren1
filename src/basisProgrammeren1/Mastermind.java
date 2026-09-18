package basisProgrammeren1;

import java.util.Scanner;

public class Mastermind {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String gok1;
        String gok2;
        String gok3;
        String gok4;

        System.out.println("rij 1 vakje 1:");
        gok1 = input.nextLine();

        System.out.println("rij 2 vakje 2:");
        gok2 = input.nextLine();

        System.out.println("rij 3 vakje 3:");
        gok3 = input.nextLine();

        System.out.println("rij 4 vakje 4:");
        gok4 = input.nextLine();

        System.out.println("" + gok1 + " " + gok2 + " " + gok3 + " " + gok4);

        input.close();
    }
}