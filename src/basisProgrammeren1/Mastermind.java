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

		if (gok1.equals(codePin1)) {
			System.out.println("Zwart");
		} else if (gok1.equals(codePin2)) {
			System.out.println("Wit");
		} else if (gok1.equals(codePin3)) {
			System.out.println("Wit");
		} else if (gok1.equals(codePin4)) {
			System.out.println("Wit");
		} else {
			System.out.println("Niks");
		}

		if (gok2.equals(codePin2)) {
			System.out.println("Zwart");
		} else if (gok2.equals(codePin1)) {
			System.out.println("Wit");
		} else if (gok2.equals(codePin3)) {
			System.out.println("Wit");
		} else if (gok2.equals(codePin4)) {
			System.out.println("Wit");
		} else {
			System.out.println("Niks");
		}

		if (gok3.equals(codePin3)) {
			System.out.println("Zwart");
		} else if (gok3.equals(codePin1)) {
			System.out.println("Wit");
		} else if (gok3.equals(codePin2)) {
			System.out.println("Wit");
		} else if (gok3.equals(codePin4)) {
			System.out.println("Wit");
		} else {
			System.out.println("Niks");
		}

		if (gok4.equals(codePin4)) {
			System.out.println("Zwart");
		} else if (gok4.equals(codePin1)) {
			System.out.println("Wit");
		} else if (gok4.equals(codePin2)) {
			System.out.println("Wit");
		} else if (gok4.equals(codePin3)) {
			System.out.println("Wit");
		} else {
			System.out.println("Niks");
		}

		System.out.println("Jouw gok is: " + gok1 + " " + gok2 + " " + gok3 + " " + gok4);

		if (gok1.equals(codePin1) && gok2.equals(codePin2) && gok3.equals(codePin3) && gok4.equals(codePin4)) {

			System.out.println("gewonnen");

		} else {
			System.out.println("verloren");
		}

	}
}