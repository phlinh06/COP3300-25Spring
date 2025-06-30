/*
Name: Linh Phan
NID: li460489
PiD: 5666634
Date: 3/3/2025
Course: COP3330-0003
Description: Programming Assignment 2, Results of 1000 dices
 */
package assignment2;

import java.util.ArrayList;

public class Phan_Linh {
	public static void main (String arg[]) {
		Dice dice = new Dice();
		int[] results = new int[11];
		//determine how many times a sum was rolled
		for(int i = 0; i < 1000; i++) {
			dice.rollDice();
			int sum = dice.getFaceValueSum();
			results[sum-2] = results[sum-2] + 1;
		}
		//printing out the sum results
		for (int i = 0; i < 11; i++) {
			System.out.println("Number of " + (i+2) + " are " + results[i]);
		}
		int yCounter = 175;
		while(yCounter >= 0) {
			//printing out the histogram
			if(yCounter >= 100) {
				System.out.print(yCounter + "|");
			}
			else if(yCounter > 0) {
				System.out.print(" " + yCounter + "|");
			}
			else {
				System.out.print("  " + yCounter + "|");
			}
			for(int i = 0; i < results.length; i++) {
				if(i != 0) {
					System.out.print(" ");
				}
				if (results[i] >= yCounter) {
					System.out.print("* ");
				}
				else if(results[i] < yCounter) {
					System.out.print("  ");
				}
			}
			System.out.print("\n");
			yCounter = yCounter - 25;
		}
		System.out.println("    --------------------------------\n    2  3  4  5  6  7  8  9  10 11 12");
	}
}