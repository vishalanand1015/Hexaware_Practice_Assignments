package dao;

import java.util.List;

import entities.Admin;




public interface IAdminDAO {
	public int createAdmin(Admin admin);
	public int updateAdmin(Admin admin);
	public int  deleteAdmin(int Admin_ID);
	public Admin getAdmin(int Admin_ID);
	public List<Admin>getAllAdmin();

}
