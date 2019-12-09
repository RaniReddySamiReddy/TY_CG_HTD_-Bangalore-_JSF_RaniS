package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UpdateUser {
	public static void main(String[] args) {
		UserServices services = UserFactory.instanceOfUserServices();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter userid");
		int userid=Integer.parseInt(sc.nextLine());
	
		System.out.println("enter password");
		String password=sc.nextLine();
		
		System.out.println("enter email");
		String email=sc.nextLine();
		
		sc.close();
		
		if(services.updateUser(userid,password,email)) {
			System.out.println("User updated........");
		}else {
			System.err.println("something went wrong.......");
		}
	}
}
