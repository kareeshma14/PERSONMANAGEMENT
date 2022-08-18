package com.milestone3.PersonManagement.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Manager {
	private List<Customer> customers;

	public Manager() {
		super();
		this.customers = new ArrayList<Customer>();
		addCustomers();
	}

	private void addCustomers() {
		customers.add(new Customer(101, "Phoebe", 26, 30000));
		customers.add(new Customer(103, "Rachel", 21, 40007));
		customers.add(new Customer(111, "Ross", 27, 80007));
		customers.add(new Customer(109, "Monica", 28, 35060));
		customers.add(new Customer(102, "Chandler", 47, 74000));
		customers.add(new Customer(104, "Joey", 29, 20003));
		customers.add(new Customer(126, "Klaus", 48, 54000));
		customers.add(new Customer(133, "Hailey", 29, 63000));
		customers.add(new Customer(154, "Michael", 28, 42500));
		customers.add(new Customer(166, "Paul", 36, 40400));
		customers.add(new Customer(137, "Nina", 16, 74000));
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Customer> getCustomersByName() {
		List<Customer> newList = new ArrayList<Customer>(customers);
		Collections.sort(newList);
		return newList;
	}

	public void updatePurchaseAmount(int id, Scanner in) throws CustomerNotFoundException {
		boolean isCustomerFound = false;
		Customer foundedCustomer = null;
		for (Customer customer : customers) {
			if (customer.getId() == id) {
				isCustomerFound = true;
				foundedCustomer = customer;
			}
		}
		if (!isCustomerFound) {
			throw new CustomerNotFoundException("Customer with id " + id + " is not present in the list.");
		}
		System.out.println("Enter new purchase amount: ");
		int amount = in.nextInt();
		foundedCustomer.setPurchaseAmount(amount);
		System.out.println("Updated Customer " + foundedCustomer);
	}
}
