package basisProgrammeren1;

import java.util.Scanner;

public class ComputeAvg {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int[] cijfers = new int[5];
		for (int index = 0; index < cijfers.length; index++) {
			cijfers[index] = sc.nextInt();
		}
		double sum = 0;
		for (int index = 0; index < cijfers.length; index++) {
			sum = sum + cijfers[index];
		}

		int gemiddelde = sum / cijfers.length;
		System.out.println("Het gemiddelde van de student is: " + gemiddelde);

	}

}
