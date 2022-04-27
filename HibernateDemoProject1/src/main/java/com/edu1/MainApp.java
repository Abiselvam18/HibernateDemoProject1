package com.edu1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Eob=new Employee();
		Eob.setEmpid(3);
		Eob.setEmpname("Maha");
		Eob.setEmpsalary(500000);
		
        Configuration conn=new Configuration().configure().addAnnotatedClass(Employee.class);	
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
        SessionFactory sf=conn.buildSessionFactory(reg);
        Session sess=sf.openSession();
        Transaction tx=sess.beginTransaction();
        
        sess.save(Eob);
        tx.commit();
	}

}
