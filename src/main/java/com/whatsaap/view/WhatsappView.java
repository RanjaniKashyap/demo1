package com.whatsaap.view;
import java.util.*;

import com.whatsaap.controller.WhatsappController;
import com.whatsaap.controller.WhatsappControllerInterface;

public class WhatsappView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss = "y";
		while(ss.equals("y")) {
		System.out.println("*********MAIN MENU***********");
		System.out.println("Press 1 to create profile");
		System.out.println("Press 2 to view profile");
		System.out.println("Pfress 3");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		
		int choice = sc.nextInt();
		//view will interact with controller
		
		WhatsappControllerInterface wc = new WhatsappController();
		
		switch(choice) {
		case 1:
			wc.createProfileController();
			
			break;
		case 2:
			wc.viewProfileController();
			break;
		
		case 3 :
			wc.viewAllProfileService();
			break;
		
		default: System.out.println("Wrong Choice");
		}
		}
	}


}
