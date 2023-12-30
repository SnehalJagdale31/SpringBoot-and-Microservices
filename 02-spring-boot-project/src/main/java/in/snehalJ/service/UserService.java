package in.snehalJ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import in.snehalJ.dao.IUserDao;

@Repository
public class UserService {
	
	private PwdService pwdService;
	private IUserDao userDao;
	private EmailService emailService;

	public UserService() {
		System.out.println("UserService :: 0-Arg Constructor ");
	}
	

//	dependency injection using  constructor 
	@Autowired
public UserService(PwdService pwdService, IUserDao userDao, EmailService emailService) {
	
		System.out.println("UserService :: parameterized constructor...");
		
		this.pwdService = pwdService;
		this.userDao = userDao;
		this.emailService = emailService;
	}



/*	dependency injection using setter method
   @Autowired 
	public void setPwdService(PwdService pwdService) {
		this.pwdService = pwdService;
	}

	@Autowired //it will use the byType method to identify the dependent class
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}*/

	public void registerUser(String name, String email, String pwd) {
		
		//encrypt pwd
		String encryptPwd = pwdService.encryptPwd(pwd);
		
		//save user in db
		boolean isSaved = userDao.saveUser(name, email, encryptPwd);
		
		//send email
		if(isSaved) {
			boolean isSent = emailService.sendEmail(email, "Test Subject", "Test Body");
			if(isSent) {
				System.out.println("User Registration Completed....");
			}
		}
		
		
	}

}
