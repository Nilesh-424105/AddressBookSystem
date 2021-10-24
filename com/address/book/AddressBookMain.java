package com.address.book;

/*
 * Ability To Create Contact In Address Book
 */

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome To Address Book Computation Program");

		AddressBook contact = new AddressBook();

		// Create New Contact in Address Book
		System.out.println("To Create New Contact");
		contact.newContacts();

		// Read this added contact
		System.out.println("Read Added Contact");
		contact.readContact();

	}

}
