package com.java.day5;

public class CustomerInfo {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer.setCustId(1);
		customer.setCity("Hyderabad");
		customer.setName("Srividya");
		customer.setPremium(88424.32);
		
		System.out.println("Customer Id  " +customer.getCustId());
		System.out.println("Customer Name  " +customer.getName());
		System.out.println("Customer City   " +customer.getCity());
		System.out.println("Premium   " +customer.getPremium());
	}
}
