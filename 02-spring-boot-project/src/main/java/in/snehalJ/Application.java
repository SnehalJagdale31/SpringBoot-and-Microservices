package in.snehalJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.snehalJ.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		UserService service = context.getBean(UserService.class);
	
		service.registerUser("john", "john@gmail.com", "abc@123");
	}

}
