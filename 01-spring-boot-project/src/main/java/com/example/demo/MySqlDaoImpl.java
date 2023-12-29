package com.example.demo;

import org.springframework.stereotype.Component;

@Component("mysql")
public class MySqlDaoImpl implements UserDao {
	
	public MySqlDaoImpl() {
		System.out.println("MySqlDaoImpl :: Constructor");
	}
	

	@Override
	public String findNameById(Integer id) {

		
		if(id==100) {
			return "Sejal";
		}else if(id == 200) {
			return "Shreyas";
		}
		
		return null;
	}

}
