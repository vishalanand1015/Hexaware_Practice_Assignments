package service;

import java.util.List;


import entities.UserCustomers;



public interface IUserCustomers {

	public int createUser(UserCustomers usercustomer);
	public int updateUser(UserCustomers usercustomer);
	public int  deleteUser(int User_ID);
	public UserCustomers getUserById(int User_ID);
	public List<UserCustomers>getAllUserCustomers();
	
	

}
