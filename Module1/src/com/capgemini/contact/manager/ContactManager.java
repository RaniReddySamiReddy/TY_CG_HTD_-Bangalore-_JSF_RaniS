package com.capgemini.contact.manager;

import com.capgemini.contact.dao.ContactDAO;
import com.capgemini.contact.dao.ContactDAOImpl;

public class ContactManager {
	private ContactManager() {}
	
	public static ContactDAO getContactDAO(){
		return new ContactDAOImpl();
		
	}

}
