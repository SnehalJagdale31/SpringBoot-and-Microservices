package in.snehalJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.snehalJ.entity.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
//		employeeService.saveEmployee();
//		employeeService.getEmp();
//		employeeService.getEmps();
//		employeeService.getAllEmps();
//		employeeService.getEmpsByDept("Sales");
//		employeeService.getEmpsByGender("Male");
		employeeService.getEmpsByGenderAndDept("Male","Sales");
	}

}
