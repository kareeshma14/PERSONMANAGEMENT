package com.milestone3.PersonManagement.Customer;

public class Customer implements Comparable<Customer> {
	private int id;
	private String name;
	private int age;
	private int purchaseAmount;

	public Customer(int id, String name, int age, int purchaseAmount) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.purchaseAmount = purchaseAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", purchaseAmount=" + purchaseAmount + "]";
	}

	public int compareTo(Customer o) {
		return this.getName().compareTo(o.getName());
	}}
