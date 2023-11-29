package mappingspractice;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mapcspractice.HibernateUtil;
import com.hexaware.mapcspractice.entities.Bookings;
import com.hexaware.mapcspractice.entities.UserCustomer;


public class OneToOne {
	
	public static void main(String[] args) {
		
	

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	Session session = sessionFactory.openSession();

	Transaction tx = session.beginTransaction();
	
	 Bookings booking = new Bookings(101,1,1001,"12:56",1,"Booked");
	  
	  UserCustomer usercustomer= new UserCustomer(1,"Vishal","Anand","vishalanand1015@gmail.com","hello",7778561,"Sonari","Jamshedpur","Jharkhand",831011);
	  
	  session.persist(usercustomer);
	  tx.commit();
	}
	 


}
