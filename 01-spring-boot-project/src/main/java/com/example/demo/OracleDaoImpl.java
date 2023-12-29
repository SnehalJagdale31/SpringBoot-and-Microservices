package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("oracle")
//@Primary  // when we want to inject by type
public class OracleDaoImpl implements UserDao {
	
	public OracleDaoImpl() {
		System.out.println("OracleDaoImpl :: Constructor");
	}
	
	
	@Override
	public String findNameById(Integer id) {
		if(id==100) {
			return "Purva";
		}else if(id == 200) {
			return "Durva";
		}
		return null;
	}

}
