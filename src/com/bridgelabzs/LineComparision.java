package com.bridgelabzs;

import java.util.Scanner;

/**
 * this program calculate and 
 * compare length of 2 lines
 * @author Sheetal
 * @since 2021-08-05
 */
public class LineComparision {
	
	/**
	 * this is the main method that
	 * use math formula to calculate length of 2lines
	 * and compare them
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation program");
		Scanner s = new Scanner(System.in);
		//taking inputs for line1
		System.out.println("Enter x co-ordinate of first point: ");
		int x1 = s.nextInt();
		System.out.println("Enter y co-ordinate of first point: ");
		int y1 = s.nextInt();
		System.out.println("Enter x co-ordinate of second point: ");
		int x2 = s.nextInt();
		System.out.println("Enter y co-ordinate of second point: ");
		int y2 = s.nextInt();
		//taking inputs for line2
		System.out.println("Enter x co-ordinate of third point: ");
		int x3 = s.nextInt();
		System.out.println("Enter y co-ordinate of third point: ");
		int y3 = s.nextInt();
		System.out.println("Enter x co-ordinate of forth point: ");
		int x4 = s.nextInt();
		System.out.println("Enter y co-ordinate of forth point: ");
		int y4 = s.nextInt();
		
		//computation
		Double length_of_line1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		Double length_of_line2 = Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
		System.out.printf("Length of 1st line is : %.2f %n", length_of_line1);
		System.out.printf("length of 2nd line is : %.2f %n", length_of_line2);
		int comp = length_of_line1.compareTo(length_of_line2);
		if(comp > 0)
			System.out.println("Length of first line is greater than length of second line");
		else if(comp < 0)
			System.out.println("Length of first line is less than length of second line");
		else
			System.out.println("Both lines are equal.");
	}
}
