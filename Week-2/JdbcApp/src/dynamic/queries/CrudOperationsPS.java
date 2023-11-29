package dynamic.queries;



import java.util.List;
import java.util.Scanner;

import dao.Employee;
import dao.EmployeeDAO;

public class CrudOperationsPS {//UI Presentation  Layer

	public static void main(String[] args) {
		EmployeeDAO dao=new EmployeeDAO();
		
		
		
		boolean flag=true;
		Scanner scanner=new Scanner(System.in);
		while (flag) {
			System.out.println("Welcome to Bus Ticketing System");
			System.out.println("1.Insert Bus Service");
			System.out.println("2. UPDATE Bus Service");
			System.out.println("3. DELETE BY Bus Service");
			System.out.println("4. GET Bus Service");
			System.out.println("5. GET ALL Bus Service");
			System.out.println("0. EXIT");
			
int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:

				System.out.println("Enter Bus Id");
				int bid = scanner.nextInt();
				System.out.println("Enter Customer Name");
				scanner.nextLine(); // to handle enter key
				String cname = scanner.nextLine();
				System.out.println("Enter Destination Pin");
				double dcode = scanner.nextDouble();

				Employee emp = new Employee(bid,cname,dcode);

				int count = dao.insertEmployee(emp);

				System.out.println(count + "record affected");

				break;

			case 2:

				System.out.println("Enter Bus Id");
				int bid1 = scanner.nextInt();
				System.out.println("Enter Customer Name");
				scanner.nextLine(); // to handle enter key
				String cname1 = scanner.nextLine();
				System.out.println("Enter Destination Pin");
				double dcode1 = scanner.nextDouble();

				Employee emp1 = new Employee(bid1, cname1, dcode1);

				int count1 = dao.updateEmployee(emp1);

				System.out.println(count1 + "  record affected");

				break;

			case 3:

				System.out.println("Enter bid to Delete Record");
				int bid2 = scanner.nextInt();
				int count2 = dao.deleteEmployee(bid2);

				System.out.println(count2 + "  record affected");

				break;

			case 4:
				System.out.println("Enter bid to Search Bus Record");
				int bid3 = scanner.nextInt();
				
				Employee employee =	dao.getEmployeeById(bid3);
							
				System.out.println(employee);

				break;
				
			case 5:
				  List<Employee>  list =   dao.getAllEmployees();
				  
				  	for (Employee empObj : list) {
				  		System.out.println(empObj);
						
					}
				  
				  break;
				  
			case 0:

				flag = false;

				break;

			default:
				
				System.err.println("Invalid Input");
				
				break;
			}

		}

	}

	}

