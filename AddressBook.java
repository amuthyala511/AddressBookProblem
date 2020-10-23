package com.addressbook;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook
{
   static final int ONE = 1;
   static final int TWO = 2;
   static final int THREE = 3;
   static final int FOUR = 4;
   static final int FIVE = 5;
   public static List<ContactPerson> persons = new ArrayList<>();
   static Scanner scan = new Scanner(System.in);
   public static void main(String[] args)
   {
      int choice = 0;
      AddressBook contact = new AddressBook();
      System.out.println("WELCOME TO ADDRESS BOOK PROGRAM IN ADDRESS BOOK MAIN CLASS ON MASTER BRANCH");
      while (choice < 4)
      {
         System.out.println("1.Add Person ");
         System.out.println("2.Print persons details");
         System.out.println("3.Edit the person details");
         System.out.println("4.Exit");
         choice = scan.nextInt();
         switch (choice)
         {
            case 1:
               contact.addPerson();
               break;
            case 2:
               contact.printPersonDetails();
               break;
            case 3:
               contact.editPersonDetails();
               break;
         }
      }
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
<<<<<<< HEAD
		ContactPerson person1 = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber);
=======
      ContactPerson person1 = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber);
>>>>>>> UC3_EditExistingContact
      persons.add(person1);
      System.out.println("person details added successfully");
   }
   public void printPersonDetails()
   {
      if (persons.isEmpty())
      {
         System.out.println("There are no contacts to print");
      }
      else
      {
         for(ContactPerson contact : persons)
         {
            System.out.println(contact);
         }
      }
   }
   public void editPersonDetails()
   {
      if (persons.isEmpty())
      {
         System.out.println("There are no contacts to edit");
      }
      else
      {
         String address, city, state;
         int phone, zip;
         int id;
         for(ContactPerson contact : persons)
         {
            System.out.println("ID: # "+persons.indexOf(contact)+" : "+contact);
         }
         System.out.println("Enter ID of contact to Edit : ");
         id = scan.nextInt();
         System.out.println(persons.get(id));
         System.out.println("please select the option to edit...\n1.Address\n2.city\n3.state\n4.zip\n5.phone number");
         int choice = scan.nextInt();
         switch (choice)
         {
            case ONE:
               System.out.println("Enter Address: ");
               address = scan.nextLine();
               persons.get(id).setAddress(address);
               break;
            case TWO:
               System.out.println("Enter City: ");
               city = scan.nextLine();
               persons.get(id).setCity(city);
               break;
            case THREE:
               System.out.println("Enter State: ");
               state = scan.nextLine();
               persons.get(id).setState(state);
            case FOUR:
               System.out.println("Enter Zip: ");
               zip = scan.nextInt();
               persons.get(id).setZip(zip);
               break;
            case FIVE:
               System.out.println("Enter Mobile number: ");
               phone = scan.nextInt();
               persons.get(id).setPhoneNumber(phone);
               break;
            default:
               System.out.println("Please Enter Valid Option: ");
               editPersonDetails();
         }
      }
   }
}
