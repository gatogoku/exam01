package dao;

import java.util.List;

import model.Employee;


public interface EmployeeDAO {

	
	public Employee selectById(Long id);

	public List<Employee> selectAll();

	public void insert(Employee user);

	public void update(Employee user);

	public void delete(Employee user);
	

}
