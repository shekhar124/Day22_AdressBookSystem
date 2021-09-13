package com.bl.controller;

import com.bl.service.AdressBookService;

public class AdressBookController {
	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook");
		AdressBookService adressBookService = new AdressBookService();
		adressBookService.createPerson();

	}

}
