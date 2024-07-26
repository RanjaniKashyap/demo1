package com.whatsaap.dao;

import java.util.List;

import com.whatsaap.entity.WhatsappUser;

public interface WhatsappDAOInterface {

	int createProfileDAO(WhatsappUser wu);

	WhatsappUser ViewprofileDAO(WhatsappUser wu);

	List<WhatsappUser> viewAllProfileDAO();

}
