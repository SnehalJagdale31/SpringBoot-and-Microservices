package in.snehalJ.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private EmployeeRepo empRepo;

	public EmployeeService(EmployeeRepo empRepo) {

		this.empRepo = empRepo;
		System.out.println(this.empRepo.getClass().getName());

	}

	public void getEmpsBySalary(float salary) {
		
		List<Employee> emps = empRepo.findByEmpSalaryGreaterThanEqual(salary);
		emps.forEach(System.out::println);
		
	}
	

	
	public void getEmpsByGenderAndDept(String gender,String dept) {
		List<Employee> emps = empRepo.findByEmpGenderAndEmpDept(gender, dept);
		emps.forEach(System.out::println);
	}
	
	public void getEmpsByGender(String gender) {
		List<Employee> emps =empRepo.findByEmpGender(gender);
		emps.forEach(System.out::println);
	}
	
	
  public void getAllEmps() {
		
		 Iterable<Employee> findall = empRepo.findAll();
		
		 findall.forEach(System.out::println);
		 
		 
		}


	public void getEmps() {
		
		List<Integer> empIds = Arrays.asList(102,103);
	
		 Iterable<Employee> itr = empRepo.findAllById(empIds);
		
		 itr.forEach(System.out::println);
		 
		 
		}
	
	public void getEmp() {
		Optional<Employee> findById = empRepo.findById(101);
		if(findById.isPresent()) {
			Employee employee = findById.get();
			System.out.println(employee);
		}
		
	}
	
	public void getEmpsByDept(String dept) {
		
		List<Employee> emps = empRepo.findByEmpDept(dept);
		System.out.println(emps);
	}

	public void saveEmployee() {

		Employee emp = new Employee();

		emp.setEmpId(105);
		emp.setEmpName("Charlese");
		emp.setEmpSalary(1000.3);
		emp.setEmpGender("Male");
		emp.setEmpDept("Sales");

		Employee emp1 = new Employee();

		emp1.setEmpId(106);
		emp1.setEmpName("raju");
		emp1.setEmpSalary(3000.3);
		emp1.setEmpGender("Male");
		emp1.setEmpDept("sd");

		Employee emp2 = new Employee();

		emp2.setEmpId(107);
		emp2.setEmpName("snehal");
		emp2.setEmpSalary(4000.3);
		emp2.setEmpGender("Female");
		emp2.setEmpDept("fsd");
		
		List<Employee> empList = Arrays.asList(emp,emp1,emp2);

		empRepo.saveAll(empList);
	}

}
