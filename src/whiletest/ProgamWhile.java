package whiletest;

import java.util.Scanner;

public class ProgamWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int resp = 0; 
		double raid = 0;
		System.out.print("Enter a number: ");
		resp = sc.nextInt();
		raid = Math.sqrt(resp);
		showSqrt(raid); //For what i knew, start normal then do the while**
		
		while (resp != 0) { //Tell the condition**
			System.out.print("Enter another nubmer: "); // White your code**
			resp = sc.nextInt();
			raid = Math.sqrt(resp);
			showSqrt(raid);
		}
		
		sc.close();

	}
	public static void showSqrt(double sqrt) {
		if (sqrt != 0 ) {
			System.out.printf("Raid: %.3f%n", sqrt);
		}
		else {
			System.out.println("Terminated");
		}
	}
}
