package in.snehalJ.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	
	
	
	@Query("from Employee")
	public List<Employee> getAllEmps();
	
	//creating custom query using annotation
	@Query("from Employee")
	public List<Employee> getAllEmpRecord();
	
	
	
	@Query("from Employee where empId = :id")
	public List<Employee> getEmpById(Integer id) ;
	
	@Transactional
	@Modifying
	@Query("delete from Employee where empId =:eid")
	public void deleteEmp(Integer eid);
	
	@Modifying
    @Query(value = "insert into Employee (empId,empName,empSalary,empGender,empDept) VALUES (:empId,:empName,:empSalary,:empGender,:empDept)")
    @Transactional
    public void insertIntoTable(Integer empId,String empName, Double empSalary, String empGender ,String empDept);
	
	@Modifying
	@Transactional
	@Query("update Employee  set empId = :empId where empName = :empName")
	public void setEmployeeId(Integer empId, String empName);
	
	
	
	@Modifying
	@Query(value ="select e.emp_name,e.emp_dept from Employee e",nativeQuery = true)
	public List<Object[]> displayNameAndDept();
	
	
	
	//select * from employee where emp_dept = :dept
	public List <Employee> findByEmpDept(String dept);
	
	//select * from employee where emp_gender =:gender
	public List <Employee> findByEmpGender(String gender);
	
	//select * from employee where emp_gender =:Male and emp_dept = :sales
	public List <Employee> findByEmpGenderAndEmpDept(String gender,String dept);
	
	//select * from employee where emp_salary >500;
	public List <Employee> findByEmpSalaryGreaterThanEqual(float salary);
	
	
	
	
	
	

	
}
