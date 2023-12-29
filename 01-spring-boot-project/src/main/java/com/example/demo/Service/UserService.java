package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.UserDao;

@Component
public class UserService {
	@Autowired //Field Injection( Reflection )
	@Qualifier("oracle") //used to solve ambiguity problem replacement to by name
	private UserDao dao;
	
//	public UserService() {
//
//		System.out.println("UserService :: Constructor");
//	}
//	
//	@Autowired // Constructor Injection
//	public UserService(UserDao dao) {
//		System.out.println("UserService :: constructor");
//		this.dao = dao;
//	}
//	@Autowired //Setter Injection
//	public void setDao(UserDao dao) {
//		System.out.println("UserService :: setDao");
//		this.dao = dao;
//	}

	public void getUsername(Integer id) {
		String name = dao.findNameById(id);
		System.out.println(name);
	}

}
