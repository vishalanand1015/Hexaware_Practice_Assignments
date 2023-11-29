package service;

import java.util.List;

import entities.Admin;




public interface IAdmin {
	public int createAdmin(Admin admin);
	public int updateAdmin(Admin admin);
	public int  deleteAdmin(int Admin_ID);
	public Admin getAdmin(int Admin_ID);
	public List<Admin>getAllAdmin();
	

}
