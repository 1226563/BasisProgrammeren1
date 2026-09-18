package basisProgrammeren1;

import java.util.Scanner;

public class Mastermind {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String codemaker = "Speler 1";
        String codekraker = "Speler 2";

        String blauwPin = "blauw";
        String oranjePin = "oranje";
        String paarsPin = "paars";
        String groenPin = "groen";
        String roodPin = "rood";
        String geelPin = "geel";

        String codePin1 = blauwPin;
        String codePin2 = groenPin;
        String codePin3 = roodPin;
        String codePin4 = geelPin;

        int rij = 1;
        boolean gewonnen = false;

        String gok1;
        String gok2;
        String gok3;
        String gok4;

        int zwartePinnen = 0;
        int wittePinnen = 0;

        System.out.println("Voer kleur 1 in:");
        gok1 = input.nextLine();

        System.out.println("Voer kleur 2 in:");
        gok2 = input.nextLine();

        System.out.println("Voer kleur 3 in:");
        gok3 = input.nextLine();

        System.out.println("Voer kleur 4 in:");
        gok4 = input.nextLine();

        System.out.println("Jouw gok is: " + gok1 + " " + gok2 + " " + gok3 + " " + gok4);

        System.out.println("De code is: " + codePin1 + " " + codePin2 + " " + codePin3 + " " + codePin4);

        input.close();
    }
}