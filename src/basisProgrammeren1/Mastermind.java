package basisProgrammeren1;

import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String codemaker;
		String codekraker;

		String blauwPin;
		String oranjePin;
		String paarsPin;
		String groenPin;
		String roodPin;
		String geelPin;

		int zwartePinnen;
		int wittePinnen;
		int rij;

		blauwPin = "blauw";
		oranjePin = "oranje";
		paarsPin = "paars";
		groenPin = "groen";
		roodPin = "rood";
		geelPin = "geel";

		zwartePinnen = 0;
		wittePinnen = 0;

		String gok1;
		String gok2;
		String gok3;
		String gok4;

		String codePin1;
		String codePin2;
		String codePin3;
		String codePin4;

		codePin1 = blauwPin;
		codePin2 = groenPin;
		codePin3 = roodPin;
		codePin4 = geelPin;

		for (rij = 1; rij <= 10; rij++) {

			if (zwartePinnen < 4) {

				zwartePinnen = 0;

				System.out.println("Voer kleur 1 in:");
				gok1 = input.nextLine();

				System.out.println("Voer kleur 2 in:");
				gok2 = input.nextLine();

				System.out.println("Voer kleur 3 in:");
				gok3 = input.nextLine();

				System.out.println("Voer kleur 4 in:");
				gok4 = input.nextLine();

				if (gok1.equals(codePin1)) {
					zwartePinnen = zwartePinnen + 1;
					System.out.println("Zwart");
				} else if (gok1.equals(codePin2)) {
					System.out.println("wit");
				} else if (gok1.equals(codePin3)) {
					System.out.println("wit");
				} else if (gok1.equals(codePin4)) {
					System.out.println("wit");
				} else {
					System.out.println("niks");
				}

				if (gok2.equals(codePin2)) {
					System.out.println("Zwart");
					zwartePinnen = zwartePinnen + 1;
				} else if (gok2.equals(codePin1)) {
					System.out.println("wit");
				} else if (gok2.equals(codePin3)) {
					System.out.println("wit");
				} else if (gok2.equals(codePin4)) {
					System.out.println("wit");
				} else {
					System.out.println("niks");
				}

				if (gok3.equals(codePin3)) {
					System.out.println("Zwart");
					zwartePinnen = zwartePinnen + 1;
				} else if (gok3.equals(codePin1)) {
					System.out.println("wit");
				} else if (gok3.equals(codePin2)) {
					System.out.println("wit");
				} else if (gok3.equals(codePin4)) {
					System.out.println("wit");
				} else {
					System.out.println("niks");
				}

				if (gok4.equals(codePin4)) {
					System.out.println("Zwart");
					zwartePinnen = zwartePinnen + 1;
				} else if (gok4.equals(codePin1)) {
					System.out.println("wit");
				} else if (gok4.equals(codePin2)) {
					System.out.println("wit");
				} else if (gok4.equals(codePin3)) {
					System.out.println("wit");
				} else {
					System.out.println("niks");
				}

				System.out.println("Jouw gok is: " + gok1 + " " + gok2 + " " + gok3 + " " + gok4);

				if (zwartePinnen == 4) {
					System.out.println("gewonnen");
				}
			}
		}

		if (zwartePinnen < 4) {
			System.out.println("verloren");
		}

	}
}