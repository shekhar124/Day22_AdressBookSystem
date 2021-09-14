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
		
		adressBookModels.add(adressBookModel);
	}
	//edit person detils
	
	public void updatePerson(String name) {
		int flag = 0;
		for (AdressBookModel model : adressBookModels) {
			if(model.getFirstName().equals(name)) {
				flag = 1;
				System.out.println("enter what to update(city/state/phone/zip):");
				String update = scan.next();
				switch (update) {
				case "city": 
					System.out.println("enter city name to update:");
					String city = scan.next();
					model.setCity(city);
					break;
				case "state":
					System.out.println("enter the state to update:");
					String state = scan.next();
					model.setState(state);
					break;
				case "phone":
					System.out.println("enter phone no to update");
					int phone = scan.nextInt();
					model.setPhoneNo(phone);
					break;
				case "zip":
					System.out.println("entr zip code");
					int zip = scan.nextInt();
					model.setZipCode(zip);
					break;
					 
					
				default:
					System.out.println("u entered romg");
					break;
				}
				
			}

		}
		if(flag==0)
			System.out.println("u entred detiles rong");
		else
			System.out.println("sucessfully updated .tq");
	}

	public void print() {
		for(AdressBookModel iteams : adressBookModels) {
			System.out.println(iteams);
		}
		
	}
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

