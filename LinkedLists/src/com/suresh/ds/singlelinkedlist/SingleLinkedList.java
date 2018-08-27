package com.suresh.ds.singlelinkedlist;

import java.util.Scanner;

public class SingleLinkedList {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/* Create the object of the LinkedList */
		LinkedList list = new LinkedList();
		System.out.println("Single Linked List Test.\n");

		char ch;
		/* Perform the list operations */
		do {
			System.out.println("\nSingle Linked List Operations \n");
			System.out.println("1. Insert at the Begining.");
			System.out.println("2. Insert at the End.");
			System.out.println("3. Inset at the position.");
			System.out.println("4. Delete at the beginning");
			System.out.println("6. Delete at the position.");
			System.out.println("7. Check empty.");
			System.out.println("8. Get size.");
			System.out.println("9. get The Head node.");
			System.out.println("10. Remove Everything from the list.");
			System.out.println("11. Position of first Value.");
			System.out.println("12. RemoveMatched.");

			int choice = scan.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter the element to insert at the start:");
				ListNode newNode = new ListNode(scan.nextInt());
				list.insertAtTheBegin(newNode);
				break;
			case 2:
				System.out.println("Enter the element to insert at the end:");
				ListNode newNodeAtEnd = new ListNode(scan.nextInt());
				list.insertAtTheEnd(newNodeAtEnd);
				break;
			case 3:
				System.out.println("Enter the position of the element to inserted:");
				int position = scan.nextInt();
				System.out.println("Enter the element to inserted:");
				int data = scan.nextInt();
				list.insert(position, data);
				break;
			case 4:
				ListNode node = list.removeAtTheBegin();
				System.out.println("element removed at the beginning:" + node.getData());
				break;
			case 5:
				ListNode nodeEnd = list.removeFromTheEnd();
				System.out.println("element removed at the beginning:" + nodeEnd.getData());
				break;
			case 6:
				System.out.println("Enter the position of the element to removed:");
				list.remove(scan.nextInt());
				break;
			case 7:
				System.out.println("Empty status:" + list.isEmpty());
				break;
			case 8:
				System.out.println("Size of the list:" + list.getLength());
				break;
			case 9:
				if (list.getHead() == null) {
					System.out.println("there are no element in the linked list.");
				} else {
					System.out.println("Head of the Linked List:" + list.getHead().getData());
				}
				break;
			case 10:
				list.clearList();
				break;
			case 11:
				System.out.println("Enter the value to get the position:");
				int valPosition = list.getPosition(scan.nextInt());
				if (valPosition == 0) {
					System.out.println("value not found.");
				} else {
					System.out.println("Position of the value:" + valPosition);
				}
				break;
			case 12:
				System.out.println("Enter the specified node to be removed form the linked list.");
				list.removeMatched(new ListNode(scan.nextInt()));
				break;
			default:
				System.out.println("Wrong Entry.\n");
				break;
			}
			list.diaplay();
			System.out.println("\nDo you want to continue (Type y/yes ot No/n):");
			ch = scan.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');

		scan.close();
	}

}
