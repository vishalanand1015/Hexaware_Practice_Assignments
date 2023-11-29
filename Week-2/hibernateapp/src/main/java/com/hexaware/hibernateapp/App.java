package com.hexaware.hibernateapp;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernateapp.HibernateUtil;
import com.hexaware.hibernateapp.dao.BusBookingDAOImp;
import com.hexaware.hibernateapp.entity.BusBookings;
import com.hexaware.hibernateapp.service.BusBookingsService;




public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();


		Session session = sessionFactory.openSession();

		Transaction tr = session.beginTransaction();
		
       BusBookingDAOImp dao=new BusBookingDAOImp();
		
		
		
		boolean flag=true;
		Scanner scanner=new Scanner(System.in);
		while (flag) {
			System.out.println("Welcome to Bus Ticketing System");
			System.out.println("1.Insert Bus Bookings");
			System.out.println("2. UPDATE Bus  Bookings");
			System.out.println("3. DELETE BY Bus  Bookings");
			System.out.println("4. GET Bus  Bookings By Id");
			System.out.println("5. GET ALL Bus  Bookings ");
			System.out.println("0. EXIT");

			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Booking Id");
				int bookingid = scanner.nextInt();
				System.out.println("Enter User Id");
				scanner.nextLine(); // to handle enter key
				int userid = scanner.nextInt();
				System.out.println("Enter TripId");
				scanner.nextLine(); 
				int tripid = scanner.nextInt();
				System.out.println("Enter Booking Time");
				scanner.nextLine(); 
				String bookingtime=scanner.nextLine();
				System.out.println("Enter Seat No.");
				int seatno = scanner.nextInt();
				System.out.println("Enter Booking Status");
				scanner.nextLine(); 
				String bookingstatus=scanner.nextLine();
				
				BusBookings busbookings=new BusBookings(bookingid,userid,tripid,bookingtime,seatno,bookingstatus);
				
				int count=dao.createBookings(busbookings);
				System.out.println(count+"Records Affected");

				break;

			case 2:
				System.out.println("Enter Booking Id");
				int bookingid1 = scanner.nextInt();
				System.out.println("Enter User Id");
				scanner.nextLine(); // to handle enter key
				int userid1 = scanner.nextInt();
				System.out.println("Enter TripId");
				int tripid1 = scanner.nextInt();
				System.out.println("Enter Booking Time");
				String bookingtime1=scanner.nextLine();
				System.out.println("Enter Seat No.");
				int seatno1 = scanner.nextInt();
				System.out.println("Enter Booking Status");
				String bookingstatus1=scanner.nextLine();
				
				BusBookings busbookings1=new BusBookings(bookingid1,userid1,tripid1,bookingtime1,seatno1,bookingstatus1);
				int count1=dao.updateBookings(busbookings1);
				System.out.println(count1+"Records Affected");

				break;

			case 3:
				System.out.println("Enter Booking Id");
				int bookingid2 = scanner.nextInt();
				
				int count2=dao.deleteBookings(bookingid2);
				System.out.println(count2+"Records Affected");
				
				

			case 4:
				System.out.println("Enter BookingId to Search Bus Booking");
				int bokingid3 = scanner.nextInt();
				BusBookings busbookings2 =dao.getBookingsById(bokingid3);
				System.out.println(busbookings2);
				
				
				break;
				
				
			case 5:
				 List<BusBookings>  list =   dao.getAllBookings();
				  
				  	for (BusBookings busbook : list) {
				  		System.out.println(busbook);
						
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

