package com.aloofly.my_cart_application.model;

import java.util.ArrayList;

public class Customer {
	private int pinCode;
	private String name;
	private String contactNumber;
	private ArrayList<Product>allProduct;

	public ArrayList<Product> getAllProduct() {
		return allProduct;
	}

	public void setAllProduct(ArrayList<Product> allProduct) {
		this.allProduct = allProduct;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}
