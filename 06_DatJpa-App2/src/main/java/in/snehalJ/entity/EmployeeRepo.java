package in.snehalJ.entity;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

	
	//select * from employee where emp_dept = :dept
	public List <Employee> findByEmpDept(String dept);
	
	//select * from employee where emp_gender =:gender
	public List <Employee> findByEmpGender(String gender);
	
	//select * from employee where emp_gender =:Male and emp_dept = :sales
	public List <Employee> findByEmpGenderAndEmpDept(String gender,String dept);

	//select * from employee where emp_salary >500;
	public List <Employee> findByEmpSalaryGreaterThanEqual(float salary);

	@Transactional
	@Modifying
	@Query("delete from Employee where empId =:eid")
	public void deleteEmp(Integer eid);
}
