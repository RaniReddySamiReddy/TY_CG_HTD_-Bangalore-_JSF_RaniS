package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.UserDAOImpl;
import com.capgemini.jdbc.services.UserServices;
import com.capgemini.jdbc.services.UserServicesImpl;

public class UserFactory {
   private UserFactory() {
	   
   }
   
   public static UserDAOImpl instanceOfUserDAOImpl() {
	   UserDAOImpl dao = new UserDAOImpl();
	   return dao;
   }
   public static UserServices instanceOfUserServices() {
	   UserServices services = new UserServicesImpl();
	   return services;
   }
}
