package ifElseEx;

import java.util.Scanner;

public class AgeValidity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean drivingUnderAge = false;
		int age = sc.nextInt();
		
		drivingUnderAge = age <=17;
		
		System.out.println(drivingUnderAge);
	}

}
