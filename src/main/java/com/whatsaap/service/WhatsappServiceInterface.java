package com.whatsaap.service;

import java.util.List;

import com.whatsaap.entity.WhatsappUser;

public interface WhatsappServiceInterface {

	int createProfileService(WhatsappUser wu);

	//WhatsappUser ViewprofileService();

	WhatsappUser viewProfileService(WhatsappUser wu);

	List<WhatsappUser> viewAllProfileSrivce();

}
