package in.snehalJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import in.snehalJ.entity.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		
//		employeeService.findAll();
		employeeService.getEmpsWithPagination(1, 3);
		
//		employeeService.saveEmployee();
//		employeeService.getEmp();
//		employeeService.getEmps();
//		employeeService.getAllEmps();
//		employeeService.getEmpsByDept("Sales");
//		employeeService.getEmpsByGender("Male");
//		employeeService.getEmpsByGenderAndDept("Male","Sales");
//		employeeService.getEmpsBySalary(2000);
//		employeeService.getAllEmpRecord();
//		employeeService.getEmpById(101);
//		employeeService.deleteEmp(105);
//		employeeService.insertIntoTable(101,"Snera",10000.0,"Female","All Rounder");
//		employeeService.setEmployeeId(115, "Snera");
//		employeeService.displayNameAndDept();
		
	}

}
