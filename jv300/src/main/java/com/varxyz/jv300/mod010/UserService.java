package com.varxyz.jv300.mod010;

public class UserService {
	private AddUserDao adduserdao = AddUserDao.getInstance();
	public UserService() {
      
	}
   
	public void addUser(User user) {
		adduserdao.insertUser(user);
		
	}

	public boolean isValidUser(String userId, String passwd) {
//		return adduserdao.login(userId, passwd);
		return adduserdao.isValidUser(userId, passwd);
	}
	
	public void updateUser(String userId, String passwd) {
		adduserdao.userupdate(userId, passwd);
	}
}