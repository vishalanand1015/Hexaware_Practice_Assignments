package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import dao.Employee;
import dao.EmployeeDAO;

class EmployeeDAOTest {
	
	static EmployeeDAO dao;
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		dao=new EmployeeDAO();
		
		
	}

	@Test
	@Disabled
	void testInsertEmployee() {
		
		
		Employee emp=new Employee(109,"sai",5000);
		
		int actual=dao.insertEmployee(emp);
		
		assertEquals(1, actual);
	}

	@Test
	void testGetEmployeeById() {
	
		Employee e1=dao.getEmployeeById(109);
		assertNotNull(e1);
		assertEquals(1000, e1.getDcode());
		
	}

}
