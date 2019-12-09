package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UserLogin {
       public static void main(String[] args) {
		UserServices services = UserFactory.instanceOfUserServices();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter username");
		String username=sc.nextLine();
	
		System.out.println("enter password");
		String password=sc.nextLine();
		
		sc.close();
		System.out.println(" password....." + password);
		UserBean userBean=services.userLogin(username,password);
		if(userBean!=null) {
			System.out.println("User detail fetched........");
			System.out.println(userBean);
		}else {
			System.err.println("something went wrong.......");
		}
	}
}
