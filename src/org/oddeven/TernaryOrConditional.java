package org.oddeven;

import java.util.Scanner;

public class TernaryOrConditional {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer number");
		int number = s.nextInt();
		int remainder = number%2;
		
		String evenodd = (remainder==0)? "Even Number":"Odd Number";
		System.out.println(number+" is an "+evenodd);
	}

}
