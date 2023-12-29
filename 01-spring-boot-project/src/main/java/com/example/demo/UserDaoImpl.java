package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {
	
	
	public UserDaoImpl() {

		System.out.println("UserDaoImpl :: Constructor");
	}

	@Override
	public String findNameById(Integer id) {
		if(id==100) {
			return "Raju";
		}else if(id == 200) {
			return "Rani";
		}
		
		return null;
	}


}
