package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDAO { // DAO is Java class communicate with DB

	Connection conn = DBUtil.getDBConnection();

	public int insertEmployee(Employee emp) {

		String insertQuery = "insert into Buss values(?,?,?)";
		// ? positional parameters

		int count = 0;

		try {

			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, emp.getBid());
			pstmt.setString(2, emp.getCname());
			pstmt.setDouble(3, emp.getDcode());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// insert query

		return count;

	}

	public int updateEmployee(Employee emp) {

		// update query
		int count = 0;

		String updateQuery = "update Buss set cname = ? ,dcode = ?  where bid = ?";

		try {

			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setString(1, emp.getCname());
			pstmt.setDouble(2, emp.getDcode());
			pstmt.setInt(3, emp.getBid());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public int deleteEmployee(int bid) {

		String deleteQuery = "delete from Buss where bid = ?";
		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);

			pstmt.setInt(1, bid);
			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public Employee getEmployeeById(int bid) {

		String selectOne = "select * from Buss where bid = ?";

		Employee employee = null;

		try {

			PreparedStatement pstmt = conn.prepareStatement(selectOne);
			pstmt.setInt(1, bid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int bid1 = rs.getInt("bid");
				String cname = rs.getString("cname");
				double dcode = rs.getDouble("dcode");

				employee = new Employee(bid1, cname, dcode);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return employee;
	}

	public List<Employee> getAllEmployees() {

		List<Employee> list = new ArrayList<Employee>();

		String selectAll = "select * from Buss";

		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(selectAll);
			
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int bid1 = rs.getInt("bid");
				String cname = rs.getString("cname");
				double dcode = rs.getDouble("dcode");

				Employee employee = new Employee(bid1, cname, dcode);

				list.add(employee);

			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		
		return list;
	}

}