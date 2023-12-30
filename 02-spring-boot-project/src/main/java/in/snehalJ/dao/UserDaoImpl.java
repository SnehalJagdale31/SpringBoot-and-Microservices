package in.snehalJ.dao;

import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements IUserDao {

	@Override
	public boolean saveUser(String name, String email, String pwd) {

		System.out.println("record inserted in db");
		return true;
	}

}
