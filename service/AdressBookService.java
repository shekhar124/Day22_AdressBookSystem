package com.bl.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bl.model.AdressBookModel;

public class AdressBookService {

	static ArrayList<AdressBookModel> adressBookModels = new ArrayList<>();
	public static Scanner scan = new Scanner(System.in);

	// Add contact to AdressBook
	
	public void createPerson() {
		AdressBookModel adressBookModel = new AdressBookModel();
		System.out.println("Enter Your First Name");
		String firstName = scan.next();
		System.out.println("Enter Your Last Name");
		String lastName = scan.next();
		System.out.println("Enter Your city Name");
		String city = scan.next();
		System.out.println("Enter Your state Name");
		String state = scan.next();
		System.out.println("Enter Your phone Number");
		int phNo = scan.nextInt();
		System.out.println("Enter Your zip");
		int zip = scan.nextInt();
		System.out.println("Enter Your email");
		String email = scan.next();
		
		adressBookModel.setCity(firstName);
		adressBookModel.setLastName(lastName);
		adressBookModel.setPhoneNo(phNo);
		adressBookModel.setState(state);
		adressBookModel.setZipCode(zip);
		adressBookModel.setCity(city);
		adressBookModel.setEmailId(email);
	}
}
