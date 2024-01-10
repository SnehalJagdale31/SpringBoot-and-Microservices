package in.snehalJ.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private EmployeeRepo empRepo;

	public EmployeeService(EmployeeRepo empRepo) {

		this.empRepo = empRepo;
		System.out.println(this.empRepo.getClass().getName());

	}
	
	
public void find() {
		
//		List<Integer> empIds = Arrays.asList(102,103);
	
	     Sort sort = Sort.by("empSalary").descending();
	
		 Iterable<Employee> findAll = empRepo.findAll(sort);
		
		 findAll.forEach(e->System.out.println(e));
		 
		 
		}

public void getEmpsWithPagination(int pageSize, int pageNo){
	
	PageRequest of = PageRequest.of(pageNo-1, pageSize);
	org.springframework.data.domain.Page<Employee> findAll =  empRepo.findAll(of);
	List<Employee> content =findAll.getContent();
	content.forEach(System.out::println);
	
}
	
//	
//	public void displayNameAndDept() {
//		List<Object[]> emp =empRepo.displayNameAndDept();
//		emp.forEach(System.out::println);	
//	}
//	
//	public void setEmployeeId(Integer empId, String empName) {
//		
//		empRepo.setEmployeeId(empId, empName);
//		
//	}
//	
//	public void getEmpById(Integer id) {
//		List<Employee> empById =empRepo.getEmpById(id);
//		System.out.println(empById);
//	}
//	
//
//
//	public List<Employee>  getEmpsBySalary(float salary) {
//		
//		List<Employee> salaryGreaterThanEqual = empRepo.findByEmpSalaryGreaterThanEqual(salary);
//		return salaryGreaterThanEqual;
//
//	}
//	
//	public void getAllEmpRecord() {
//		
//		List<Employee> emps = empRepo.getAllEmpRecord();
//		emps.forEach(System.out::println);
//		
//	}
//    public void deleteEmp(Integer eid) {
//		
//		 empRepo.deleteEmp(eid);
//		
//	}
//	
//    public void insertIntoTable(Integer empId,String empName, Double empSalary, String empGender ,String empDept) {
//    	 empRepo.insertIntoTable(empId,empName,empSalary,empGender,empDept);
//    }
//
//
//	
//	public void getEmpsByGenderAndDept(String gender,String dept) {
//		List<Employee> emps = empRepo.findByEmpGenderAndEmpDept(gender, dept);
//		emps.forEach(System.out::println);
//	}
//	
//	public void getEmpsByGender(String gender) {
//		List<Employee> emps =empRepo.findByEmpGender(gender);
//		emps.forEach(System.out::println);
//	}
//	
//	
//  public void getAllEmps() {
//		
//		 Iterable<Employee> findall = empRepo.findAll();
//		
//		 findall.forEach(System.out::println);
//		 
//		 
//		}
//
//
//	
//	
//	public void getEmp() {
//		Optional<Employee> findById = empRepo.findById(101);
//		if(findById.isPresent()) {
//			Employee employee = findById.get();
//			System.out.println(employee);
//		}
//		
//	}
//	
//	public void getEmpsByDept(String dept) {
//		
//		List<Employee> emps = empRepo.findByEmpDept(dept);
//		System.out.println(emps);
//	}

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
		
		Employee emp3 = new Employee();

		emp3.setEmpId(108);
		emp3.setEmpName("kirti");
		emp3.setEmpSalary(3434.3);
		emp3.setEmpGender("Female");
		emp3.setEmpDept("bba");
		
		Employee emp4 = new Employee();

		emp4.setEmpId(109);
		emp4.setEmpName("sakshi");
		emp4.setEmpSalary(2345.3);
		emp4.setEmpGender("Female");
		emp4.setEmpDept("ca");
		
		Employee emp5 = new Employee();

		emp5.setEmpId(110);
		emp5.setEmpName("pooja");
		emp5.setEmpSalary(3234.3);
		emp5.setEmpGender("Female");
		emp5.setEmpDept("pharma");
		
		Employee emp6 = new Employee();

		emp6.setEmpId(111);
		emp6.setEmpName("sakshiw");
		emp6.setEmpSalary(11122.3);
		emp6.setEmpGender("Female");
		emp6.setEmpDept("dentist");
		
		List<Employee> empList = Arrays.asList(emp,emp1,emp2,emp3,emp4,emp5,emp6);

		empRepo.saveAll(empList);
	}


	public Iterable<Employee> findAll() {
		 Sort sort1 = Sort.by("empSalary").descending();
			
		 Iterable<Employee> findAll = empRepo.findAll(sort1);
		
		 findAll.forEach(e->System.out.println(e));
		 return findAll;
	}

	
public void getEmpsWithPagination() {
	List<Employee> findAll = empRepo.findAll();
}
	

	

}
