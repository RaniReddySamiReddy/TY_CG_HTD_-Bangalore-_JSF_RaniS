package com.capgemini.contact.app;

import java.util.List;
import java.util.Scanner;

import com.capgemini.contact.bean.ContactBean;
import com.capgemini.contact.dao.ContactDAO;
import com.capgemini.contact.manager.ContactManager;

public class ContactApp {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		ContactApp.useContact();
	}//end of main method

	public static  void contactMain() {

		System.out.println("Press 1 to call");
		System.out.println("Press 2 to message");
		System.out.println("Press 3 to go back to main menu");

		int ch1 = scn.nextInt();
		switch(ch1) {
		case 1:
			System.out.println("calling the contact");
			System.out.println("Press 1 to end the call");
			int a = scn.nextInt();
			if(a!=0) {
				System.out.println("Ending Call");
			}
			ContactApp.useContact();
			break;

		case 2:
			System.out.println("Type Message");
			String msg = scn.next();
			System.out.println("Your msg is :");
			System.out.println(msg);
			System.out.println("Sending Message....");
			ContactApp.useContact();
			break;
		case 3:
			ContactApp.useContact();
			break;

		}// end of switch

	}	

	public static void useContact() {
		System.out.println("Press 1 to Show all contact name");
		System.out.println("Press 2 to Search for contact");
		System.out.println("Press 3 to operate on contact");


		int ch = scn.nextInt();

		switch (ch) {
		case 1:
			ContactDAO dao = ContactManager.getContactDAO();
			List<String> alist = dao.getAllContactNames();
			for(String name:alist) {
				System.out.println(name);
			}
			ContactApp.useContact();
			break;
		case 2:
			System.out.println("Enter name");
			String name = scn.next();
			ContactDAO dao2 = ContactManager.getContactDAO();
			ContactBean bean2 = dao2.searchForContact(name);
			System.out.println(bean2.getName());
			System.out.println(bean2.getNumber());
			System.out.println(bean2.getGroups());
			ContactApp.contactMain();
			break;
		case 3:
			System.out.println("Press 1 to add contact");
			System.out.println("Press 2 to delete contact");
			System.out.println("Press 3 to edit contact");
			ContactApp.useContact();
			break;


		}

	}
}
