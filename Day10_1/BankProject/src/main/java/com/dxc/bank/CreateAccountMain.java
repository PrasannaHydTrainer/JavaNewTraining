package com.dxc.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class CreateAccountMain {

	public static void main(String[] args) {
		BankDAO dao = new BankDAO();
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		System.out.println("Enter FirstName  ");
		bank.setFirstName(sc.next());
		System.out.println("Enter LastName   ");
		bank.setLastName(sc.next());
		System.out.println("Enter City   ");
		bank.setCity(sc.next());
		System.out.println("Enter State   ");
		bank.setState(sc.next());
		System.out.println("Enter Amount    ");
		bank.setAmount(sc.nextInt());
		System.out.println("Enter CheqFacil   ");
		bank.setCheqFacil(sc.next());
		System.out.println("Enter AccountType   ");
		bank.setAccountType(sc.next());
		try {
			System.out.println(dao.createAccount(bank));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
