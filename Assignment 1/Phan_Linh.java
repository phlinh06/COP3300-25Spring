/*
Name: Linh Phan
NID: li460489
PiD:5666634
Date: 2/10/2025
Course: COP3330-0003
Description: Programming assignment 1, making a random receipt for a store
*/

package assignment1;

import java.util.Scanner;

public class Phan_Linh {

	public static void main(String[] args) {
		
		//create a random receipt number
		 int receiptNumber;
		 int receiptMin = 1000;
		 int receiptMax = 2000;
		 receiptNumber = (int) (Math.random() * (receiptMax - receiptMin)) + receiptMin;
		 System.out.println("******************************\n****** S Store ***************\n******************************");
		 System.out.println("receipt number      " + receiptNumber);
		 
		 //create a random month number
		 int monthNumber;
		 String monthName = "";
		 int monthMin = 1;
		 int monthtMax = 12;
		 monthNumber = (int) (Math.random() * (monthtMax - monthMin + 1)) + monthMin;
		 
		 //converting month number into word
		 if (monthNumber == 1) {
			 monthName = "January";
		 } else if (monthNumber == 2) {
			 monthName = "February";
		 } else if (monthNumber == 3) {
			 monthName = "March";
		 } else if (monthNumber == 4) {
			 monthName = "April";
		 } else if (monthNumber == 5) {
			 monthName = "May";
		 } else if (monthNumber == 6) {
			 monthName = "June";
		 } else if (monthNumber == 7) {
			 monthName = "July";
		 } else if (monthNumber == 8) {
			 monthName = "August";
		 } else if (monthNumber == 9) {
			 monthName = "September";
		 } else if (monthNumber == 10) {
			 monthName = "October";
		 } else if (monthNumber == 11) {
			 monthName = "November";
		 } else if (monthNumber == 12) {
			 monthName = "December";
		 }
		 
		 //create a random day number
		 int dayNumber;
		 int dayMin = 1;
		 int dayMax = 28;
		 dayNumber = (int) (Math.random() * (dayMax - dayMin + 1)) + dayMin;
		 
		 //create a random year number
		 int yearNumber;
		 int yearMin = 1900;
		 int yearMax = 2100;
		 yearNumber = (int) (Math.random() * (yearMax - yearMin)) + yearMin;
		 
		 System.out.println(monthName + " " + dayNumber + " " + yearNumber);
		 
		 //taking in user's items input
		 
		 Scanner scan = new Scanner(System.in);
		 String item = "";
		 int itemNumber = 0;
		 double total = 0;
		
		 //loop to scan user input 
		 while (!item.equals("DONE")) {
			 //scanning item name
			 System.out.print("Write item name ");
			 item = scan.nextLine();
			 if (item.compareTo("DONE") == 0) {
				 break;
			 }
			 itemNumber++;
			 
			 //capitalizing first letter of items
			 item = item.substring(0, 1).toUpperCase() + item.substring(1);
			 
			 //scanning item price
			 System.out.print("Write price ");
			 float price = scan.nextFloat();
			 scan.nextLine();
			 
			 //figuring out what item to tax and what items that are tax free (food)
			 if (item.compareTo("food") == 0 || item.compareTo("Food") == 0) {
				 price = Math.round(price);
				 System.out.println("item number " + itemNumber + " " + item + " " + price);
				 total = total + price;
			 }
			 else {
				 float taxed = (float) (price*1.3);
				 taxed = Math.round(taxed);
				 System.out.println("item number " + itemNumber + " " + item + " " + taxed);
				 total = total + taxed;
			 }
		 }
		 System.out.println(itemNumber + " items      total " + total);
		 scan.close();

	}

}
