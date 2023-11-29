package service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import dao.IAdminDAO;
import entities.Admin;
@Service
public class AdminService implements IAdmin {
	@Autowired
	IAdminDAO dao;

	@Override
	public int createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return dao.createAdmin(admin);
	}

	@Override
	public int updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return dao.updateAdmin(admin);
	}

	@Override
	public int deleteAdmin(int Admin_ID) {
		// TODO Auto-generated method stub
		return dao.deleteAdmin(Admin_ID);
	}

	@Override
	public Admin getAdmin(int Admin_ID) {
		// TODO Auto-generated method stub
		return dao.getAdmin(Admin_ID);
	}

	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return dao.getAllAdmin();
	}

}
