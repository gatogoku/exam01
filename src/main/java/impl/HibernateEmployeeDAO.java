package impl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dao.EmployeeDAO;
import data.HibernateSession;
import model.Employee;

public class HibernateEmployeeDAO implements EmployeeDAO{
	
	SessionFactory sessionFactory = null;
	Session session = null;
	
	public void initializaSession(){
		sessionFactory=HibernateSession.getSessionFactory();
		session=sessionFactory.openSession();
	}

	public Employee selectById(Long id) {
		
		// TODO Auto-generated method stub
		initializaSession();
		Employee customer = (Employee) session.get(Employee.class, id);
		session.close();
		return customer;
	
	}

	public List<Employee> selectAll() {
		// TODO Auto-generated method stub
		initializaSession();
		List<Employee> users = session.createCriteria(Employee.class).list();
		session.close();
		return users;
	}

	public void insert(Employee user) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		Long id =  (Long) session.save(user);
		user.setId(id);
		session.getTransaction().commit();
		session.close();
		
	}

	public void update(Employee user) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(user);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(Employee user) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(user);
		session.getTransaction().commit();
		session.close();
		
	}

}
