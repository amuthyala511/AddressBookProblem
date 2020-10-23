package com.addressbook;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook
{
	public static List<ContactPerson> persons = new ArrayList<ContactPerson>;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("WELCOME TO ADDRESS BOOK PROGRAM IN ADDRESS BOOK MAIN CLASS ON MASTER BRANCH");
		AddressBook contact = new AddressBook();
		contact.addPerson();
	}
	public void addPerson()
	{
		System.out.println("Enter person details");
		System.out.println("Enter FirstName: ");
		String firstName = scan.next();
		System.out.println("Enter lastName: ");
		String lastName = scan.next();
		System.out.println("Enter Address: ");
		String address = scan.next();
		System.out.println("Enter city: ");
		String city = scan.next();
		System.out.println("Enter state: ");
		String state = scan.next();
		System.out.println("Enter zip: ");
		int zip = scan.nextInt();
		System.out.println("Enter phone number: ");
		int phoneNumber = scan.nextInt();
		ContactPerson person1 = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber);
		persons.add(person1);
		System.out.println("person details added successfully");
	}
}
