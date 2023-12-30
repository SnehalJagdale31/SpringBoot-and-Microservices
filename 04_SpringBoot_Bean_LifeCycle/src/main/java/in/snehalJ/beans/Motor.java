package in.snehalJ.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Motor {
	
	@PostConstruct
	public void init() {
		System.out.println("Motor - init() method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Motor - destroy() method");
	}
	

}
//bean life cycle using annotation