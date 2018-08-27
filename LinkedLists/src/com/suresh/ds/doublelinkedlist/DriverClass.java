package com.suresh.ds.doublelinkedlist;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		DoublyLinkedList dllist = new DoublyLinkedList();

		System.out.println("Doubly Linked List Test.\n");

		char ch;

		do {

			System.out.println("\nSingle Linked List Operations \n");
			System.out.println("1. Insert at the Begining.");
			System.out.println("2. Length.");
			System.out.println("3. AtTheEnd.");
			int choice = scan.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter the element to be inserted.");
				dllist.insertAtTheBegin(scan.nextInt());
				break;
			case 2:
				System.out.println("length:" + dllist.getLength());
				break;
			case 3:
				System.out.println("Enter the elemenet to inserted at the end.");
				dllist.AtTheEnd(scan.nextInt());
				break;
			default:
				System.out.println("Wrong operation.");
				break;
			}

			System.out.println("DLL:");
			dllist.display();

			System.out.println("\nDo you want to continue. say (Y/N):");
			ch = scan.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
		scan.close();
	}

}
