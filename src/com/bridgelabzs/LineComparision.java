package com.bridgelabzs;

import java.util.Scanner;

/**
 * this program calculate length of line 
 * @author Sheetal
 * @since 2021-08-05
 */
public class LineComparision {
	
	/**
	 * this is the main method that
	 * use math formula to calculate length
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation program");
		Scanner s = new Scanner(System.in);
		//taking inputs
		System.out.println("Enter x co-ordinate of first point: ");
		int x1 = s.nextInt();
		System.out.println("Enter y co-ordinate of first point: ");
		int y1 = s.nextInt();
		System.out.println("Enter x co-ordinate of second point: ");
		int x2 = s.nextInt();
		System.out.println("Enter y co-ordinate of second point: ");
		int y2 = s.nextInt();
		
		//computation
		double lenght_of_line = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.printf("Length of end point is : %.2f ", lenght_of_line);
	}
}
