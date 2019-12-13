package com.capgemini.contact.dao;

import java.util.List;

import com.capgemini.contact.bean.ContactBean;


public interface ContactDAO {
	public List<String> getAllContactNames();
	public ContactBean searchForContact(String name);
	boolean addContact(String name);
    

}
