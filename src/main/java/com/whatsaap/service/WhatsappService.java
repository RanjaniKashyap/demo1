package com.whatsaap.service;

import java.util.List;

import com.whatsaap.dao.WhatsappDAO;
import com.whatsaap.dao.WhatsappDAOInterface;
import com.whatsaap.entity.WhatsappUser;

public class WhatsappService implements WhatsappServiceInterface {

	@Override
	public int createProfileService(WhatsappUser wu) {
		// TODO Auto-generated method stub
		
		WhatsappDAOInterface wd = new WhatsappDAO();
		int i = wd.createProfileDAO(wu);
		return i;
		
		
	}

	@Override
	public WhatsappUser viewProfileService(WhatsappUser wu) {
		// TODO Auto-generated method stub
		WhatsappDAOInterface wd = new WhatsappDAO();
		
		WhatsappUser w1 = wd.ViewprofileDAO(wu);
			
		return w1;
	}

	@Override
	public List<WhatsappUser> viewAllProfileSrivce() {
		// TODO Auto-generated method stub
		
		WhatsappDAOInterface wd=new WhatsappDAO();
		
		List<WhatsappUser> ll=	wd.viewAllProfileDAO();
			return ll;
		
	}


}

	