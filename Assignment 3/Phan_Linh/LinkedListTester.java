/*
Name: Linh Phan
NID: li460489
PiD: 5666634
Date: 4/7/2025
Course: COP3330-0003
Description: Programming Assignment 3, Linked List Implementation
 */
package assignment3;

public class LinkedListTester {
	
	public static void main(String[] args) {
		//creates linked list
		LinkedList list = new LinkedList();
		list.construct("data.txt");
		list.process();
		list.printFile("processed.txt");
	}

}
