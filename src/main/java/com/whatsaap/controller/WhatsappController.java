package com.whatsaap.controller;
import java.util.*;

import com.whatsaap.entity.WhatsappUser;
import com.whatsaap.service.WhatsappService;
import com.whatsaap.service.WhatsappServiceInterface;
import com.whatsaap.utility.SortByAddress;
public class WhatsappController implements WhatsappControllerInterface {

	@Override
	public void createProfileController() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name = sc.next();
		
		System.out.println("Enter Password");
		String password = sc.next();
		
		System.out.println("Enter Email");
		String email = sc.next();
		
		System.out.println("Enter Address");
		String address = sc.next();
		
		//send to service layer
		
		WhatsappUser wu = new WhatsappUser();
		//creating new obj - binding above values
		
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.setAddress(address);
		
		// obj to service layer  1. create service layer 2. method
		
		WhatsappServiceInterface ws = new WhatsappService();
		
		int i = ws.createProfileService(wu);
		
		if(i>0) {
			System.out.println("Profile created");
		}
		else {
			System.out.println("Couldn't create Profile");
		}

	}


		

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email to view profile");
		String email = sc.next();
		
		//transfer above mail id using dto
		
		WhatsappUser wu = new WhatsappUser();
		wu.setEmail(email);
		
		WhatsappServiceInterface ws = new WhatsappService();
		WhatsappUser w1 = ws.viewProfileService(wu);
		
		if(w1!=null) {
			System.out.println("Your profile is ");
			System.out.println("Name is "+  w1.getName());
			System.out.println("Password is "+  w1.getPassword());
			System.out.println("Email is "+  w1.getEmail());
			System.out.println("Address is "+  w1.getAddress());
			
		}
		else {
			System.out.println("Profile not exist for email id " + email);
		}
	}




	@Override
	public void viewAllProfileService() {
		// TODO Auto-generated method stub
		WhatsappServiceInterface ws = new WhatsappService();
		List <WhatsappUser> ll = ws.viewAllProfileSrivce();
        System.out.println(ll.size()+"    record found");
		
		System.out.println("record unsorted");
		
		for(WhatsappUser w1:ll) {
			 System.out.println("*************************************** ");
			 System.out.println("Name is "+w1.getName());
			 System.out.println("Password is "+w1.getPassword());
			 System.out.println("Email is "+w1.getEmail());
			 System.out.println("Address is "+w1.getAddress());
		}
		
		Collections.sort(ll, new SortByAddress());
		
		System.out.println("record in sorted order");
		
		for(WhatsappUser w1:ll) {
			 System.out.println("*************************************** ");
			 System.out.println("Name is "+w1.getName());
			 System.out.println("Password is "+w1.getPassword());
			 System.out.println("Email is "+w1.getEmail());
			 System.out.println("Address is "+w1.getAddress());
		}
		
	}
		
	}

