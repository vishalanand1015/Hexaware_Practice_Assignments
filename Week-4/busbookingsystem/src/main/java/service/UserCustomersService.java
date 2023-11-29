package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IUserCustomersDAO;
import entities.UserCustomers;

@Service
public class UserCustomersService implements IUserCustomers {
	@Autowired
	IUserCustomersDAO dao;

	@Override
	public int createUser(UserCustomers usercustomer) {
		// TODO Auto-generated method stub
		return dao.createUser(usercustomer);
	}

	@Override
	public int updateUser(UserCustomers usercustomer) {
		// TODO Auto-generated method stub
		return dao.updateUser(usercustomer);
	}

	@Override
	public int deleteUser(int User_ID) {
		// TODO Auto-generated method stub
		return dao.deleteUser(User_ID);
	}

	@Override
	public UserCustomers getUserById(int User_ID) {
		// TODO Auto-generated method stub
		return dao.getUserById(User_ID);
	}

	@Override
	public List<UserCustomers> getAllUserCustomers() {
		// TODO Auto-generated method stub
		return dao.getAllUserCustomers();
	}

}
