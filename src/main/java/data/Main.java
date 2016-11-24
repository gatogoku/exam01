package data;


import impl.HibernateEmployeeDAO;
import model.Employee;

public class Main {

	public static void main(String[] args) {
	
		Employee p1 = new Employee("empleado1","1/2/1888");
		Employee p2 = new Employee("empleado2","1/2/1888");
		Employee p3 = new Employee("empleado3","1/2/1888");
		Employee p4 = new Employee("empleado4","1/2/1888");
		Employee p5 = new Employee("empleado5","1/2/1888");
		Employee p6 = new Employee("empleado6","1/2/1888");
		HibernateEmployeeDAO hed = new HibernateEmployeeDAO();
		
		hed.insert(p1);
		hed.insert(p2);
		hed.insert(p3);
		hed.insert(p4);
		hed.insert(p5);
		hed.insert(p6);
		
		
		
//		
//
	}

}
