package com.whatsaap.utility;

import java.util.Comparator;

import com.whatsaap.entity.WhatsappUser;

public class SortByAddress implements Comparator<WhatsappUser> {

	@Override
	public int compare(WhatsappUser o1, WhatsappUser o2) {
		// TODO Auto-generated method stub
		return o1.getAddress().compareTo(o2.getAddress());
	}

}
