package com.milestone3.PersonManagement;

import java.util.List;
import java.util.Scanner;

import com.milestone3.PersonManagement.Customer.Customer;
import com.milestone3.PersonManagement.Customer.CustomerNotFoundException;
import com.milestone3.PersonManagement.Customer.Manager;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		Manager customerManager = new Manager();
		Scanner in = new Scanner(System.in);
		int option = 3;
		do {
			menu();
			option = in.nextInt();
			switch (option) {
			case 1:
				seperator();
				printCusotmers(customerManager.getCustomersByName());
				seperator();
				break;
			case 2:
				seperator();
				System.out.println("Enter customer id: ");
				int id = in.nextInt();
				try {
					customerManager.updatePurchaseAmount(id, in);
					seperator();
				} catch (CustomerNotFoundException e) {
					errorSeperator();
					System.out.println(e.getMessage());
					errorSeperator();
				}
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
		} while (option != 3);
		System.out.println("Exit done");
		in.close();
	}

	private static void printCusotmers(List<Customer> customers) {
		customers.stream().forEach(System.out::println);
	}

	public static void menu() {
		System.out.println("Menu\n1. Display customer based on their name in ascending order"
				+ "\n2. Updated purchaseAmount by ID\n3. Exit\nEnter menu option");
	}

	public static void seperator() {
		System.out.println("---------------------------------------------------------------");
	}

	public static void errorSeperator() {
		System.out.println("----------------------------------------------------------------");
	}

}
