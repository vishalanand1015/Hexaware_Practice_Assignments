package com.hexaware.busticketbooking.service;

import java.util.ArrayList;


import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.busticketbooking.entity.Admin;



@Service
public class AdminService implements IAdmin {
	

	@Override
	public int createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteAdmin(int Admin_ID) {
		// TODO Auto-generated method stub
		return 101;
	}

	@Override
	public Admin getAdmin(int Admin_ID) {
		Admin a=new Admin(1, "Vishal", "Anand", "va@123", "hacker", 85455);
		return a;
	}


	
	@Override
	public List<Admin> getAllAdmin() {
		
		List<Admin> getadmin =new ArrayList<>();
		getadmin.add(new Admin(1, "Vishal", "Anand", "va@123", "hacker", 85455));
		getadmin.add(new Admin(2, "Ashwin", "Tiwari", "at@123", "jod", 854785));
		

		return getadmin;
	}

}
