package org.oddeven;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		int number, remainder;
		System.out.println("Enter the integer number");
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		s.close();
		
		remainder = number%2;
		if (remainder==0) {
			System.out.println(number+ " is an Even Number");
			
		} else {
			System.out.println(number + " is an Odd Number");
		}
		
	}
}

