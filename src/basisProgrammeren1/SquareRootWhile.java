package basisProgrammeren1;

import java.util.Scanner;

public class SquareRootWhile {
		public static void main(String[] args) {
		    Scanner console = new Scanner(System.in);
		    int som = 0;

		    System.out.println("Type een getal (type -1 om te stoppen): ");
		    int getal = console.nextInt();

		    while (getal != -1) {
		        som = som + getal;
		        System.out.println("Type een getal (type -1 om te stoppen): ");
		        getal = console.nextInt();
		    } 

		    System.out.println("De som is " + som);
	}

}
