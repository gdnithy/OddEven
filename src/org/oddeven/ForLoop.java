package org.oddeven;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int n = s.nextInt();
		System.out.println("Even Number and Odd Number from 0 to "+n);
		System.out.println("Even number    odd number");

		for (int i = 0; i <= n; i++) {

			if (i % 2 == 0) {
				System.out.print(i +"\t\t");
			} else {
				System.out.println(i);
		} 
		
	}
	}
}
