package com.whatsaap.dao;

import java.sql.Connection;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.whatsaap.entity.WhatsappUser;

public class WhatsappDAO implements WhatsappDAOInterface {

	@Override
	public int createProfileDAO(WhatsappUser wu) {
		
		//jdbc code
		
		//step1 LOAD DRIVE
		int i =0;
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");//type 4 driver, Exception - ClassNotFoundException
		
		//step2 create connection with database
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmindsdb","root","root");
		//3306 default code num of mysql                                                            //userid pswd
		
		//step 1 & 2 same for all
		
		//open mysql - create databse, connect 
		// create database happiestmindsdb;   connect happiestmindsdb.;   
		//step 3 create query
		//2 types of query : a. Static query will be created using Statement
		//b. dynamic query will be created using PreparedStatement
		
		PreparedStatement ps = con.prepareStatement("insert into `Wuser` values(?,?,?,?)");
		ps.setString(1, wu.getName());
		ps.setString(2, wu.getPassword());
		ps.setString(3, wu.getEmail());
		ps.setString(4, wu.getAddress());
		
		//execute query 
		//if DML query - insert,delete,update - we will use executeUpdate() method & return type of executeUpdate()
		//method will be int
		//it says num of rows affected by query
		//for select query we will use executeQuery() and return type of executeQuery() => resultSet 
	
		i=ps.executeUpdate();
		
		
		
		}
		
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
	
		
		
		return i;
	}

	@Override
	public WhatsappUser ViewprofileDAO(WhatsappUser wu) {
		// TODO Auto-generated method stub
		
		WhatsappUser w1 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmindsdb", "root","root");	
			PreparedStatement ps = con.prepareStatement("select * from Wuser where email = ?");
			ps.setString(1, wu.getEmail());
			
			ResultSet res = ps.executeQuery();
			
			if(res.next()) {
				String n = res.getString(1);
				String p = res.getString(2);
				String e = res.getString(3);
				String a = res.getString(4);
				
				w1=new WhatsappUser();
				w1.setName(n);
				w1.setPassword(p);
				w1.setEmail(e);
				w1.setAddress(a);
				
			}
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		
	}
		return w1;
	}

	@Override
	public List<WhatsappUser> viewAllProfileDAO() {
		// TODO Auto-generated method stub
List<WhatsappUser> ll=new ArrayList<WhatsappUser>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happiestmindsdb","root","root");
			PreparedStatement ps=con.prepareStatement("select * from whatsappuser");
			
			ResultSet res=ps.executeQuery();
			
			while(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				//DTO
				WhatsappUser w1=new WhatsappUser();
				w1.setName(n);
				w1.setPassword(p);
				w1.setEmail(e);
				w1.setAddress(a);
				
				ll.add(w1);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return ll;
	}
	

}
