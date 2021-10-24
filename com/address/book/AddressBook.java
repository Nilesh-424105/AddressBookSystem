package com.address.book;

import java.util.Scanner;

public class AddressBook {

	// Declare Variable
	private String firstName, lastName, address, city, state, email, zip, phoneNumber;

	// create Method to Add New Contacts
	public void newContacts() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name");
		setFirstName(sc.nextLine());

		System.out.println("Enter Last Name");
		setLastName(sc.nextLine());

		System.out.println("Enter Address");
		setAddress(sc.nextLine());

		System.out.println("Enter City");
		setCity(sc.nextLine());

		System.out.println("Enter State");
		setState(sc.nextLine());

		System.out.println("Enter Email");
		setEmail(sc.nextLine());

		System.out.println("Enter Zip");
		setZip(sc.nextLine());

		System.out.println("Enter Phone Number");
		setPhoneNumber(sc.nextLine());

		sc.close();
	}

	// Create Method To Read Contact
	public void readContact() {

		System.out.println("Full Name:    " + firstName + " " + lastName);
		System.out.println("Address:      " + address + ", " + city + ", " + state + "(" + zip + ")");
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Email ID:     " + email);

	}

	// Getters and Setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
