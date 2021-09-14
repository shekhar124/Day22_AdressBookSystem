package com.bl.controller;

import java.util.Scanner;

import com.bl.service.AdressBookService;

public class AdressBookController {
	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook");
		AdressBookService adressBookService = new AdressBookService();
		adressBookService.createPerson();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		final int EXIT_VALUE=3;
		while(choice !=EXIT_VALUE){
			System.out.println("1.Add Person\n2.Update Person\n"+EXIT_VALUE+".Exit");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				adressBookService.createPerson();
				adressBookService.print();
				break;
			case 2:
				System.out.println("enter name of person to update");
			String name = scan.next();
			adressBookService.updatePerson(name);
			adressBookService.print();
			break;
			case EXIT_VALUE :
				System.out.println("exit");
				break;
				default:
					System.out.println("Enter valid value");
					break;
			}
		}
	}

}
