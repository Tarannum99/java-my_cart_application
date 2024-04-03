package com.aloofly.my_cart_application.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.aloofly.my_cart_application.model.Product;
import com.aloofly.my_cart_application.model.Customer;

public class CustomerController {
	public static void main(String[] args) {

		ArrayList<Customer> allCustomer = setCustomerDetails();
		getAllCustomer(allCustomer);
	}

	public static ArrayList<Customer> setCustomerDetails() {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Customer> allCustomer = new ArrayList<Customer>();

		System.out.println("******MY CART******" + "\n");
		System.out.println("Enter The Customer Quantity -> ");
		int customerCount = scanner.nextInt();
		for (int i = 0; i < customerCount; i++) {
			Customer customer = new Customer();
			ArrayList<Product> allProduct = new ArrayList<Product>();
			System.out.println("Enter PinCode");
			customer.setPinCode(scanner.nextInt());
			System.out.println("Enter Name");
			customer.setName(scanner.next());
			System.out.println("Enter Contact Number");
			customer.setContactNumber(scanner.next());

			System.out
					.println("Dear" + " " + customer.getName() + " " + " How Many Product do you want to purchase ? ");
			int productCount = scanner.nextInt();
			for (int j = 0; j < productCount; j++) {
				Product product = new Product();
				System.out.println("Enter Category Type");
				product.setCategoryType(scanner.next());
				System.out.println("Enter Product Name");
				product.setName(scanner.next());
				System.out.println("Enter Quantity");
				product.setNetQuantity(scanner.nextInt());

				allProduct.add(product);

			}
			allCustomer.add(customer);
			customer.setAllProduct(allProduct);

		}
		return allCustomer;

	}

	public static void getAllCustomer(ArrayList<Customer> allCustomer) {
		System.out.println("****MY CART****" + "\n");
		System.out.println("**Customer Details**" + "\n");
		for (int m = 0; m < allCustomer.size(); m++) {
			Customer customer = allCustomer.get(m);
			System.out.println("Customer Name  -: " + customer.getName());
			System.out.println("Pin Code       -: " + customer.getPinCode());
			System.out.println("Contact Number -: " + customer.getContactNumber() + "\n");

			System.out.println("**Product Details**" + "\n");
			for (int n = 0; n < customer.getAllProduct().size(); n++) {
				Product product = customer.getAllProduct().get(n);
				System.out.println("Product Name  -: " + product.getName());
				System.out.println("Category Type -: " + product.getCategoryType());
				System.out.println("Quantity      -: " + product.getNetQuantity() + "\n");

			}
			System.out.println("**Customer Details**" + "\n");

		}

	}

}
