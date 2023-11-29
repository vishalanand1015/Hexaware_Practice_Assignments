package cam.crud;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","RAJharsh@10");
			
			Statement stmt=conn.createStatement();
			
			
			String query="insert into employee values(501,'Vishal',45000)";
			int count=stmt.executeUpdate(query);
			System.out.println(count+"No. of records affected");
			
			String selectQuery="Select * from employee";
			
			ResultSet rs=stmt.executeQuery(selectQuery);//select
			
			while(rs.next()) {
				int eid=rs.getInt("eid");
				String ename=rs.getString("ename");
				double salary=rs.getDouble("salary");
				System.out.println(eid+ " " + ename + " " + salary);
				
			}
			
			
			
			
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
