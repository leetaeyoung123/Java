package com.varxyz.jv300.mod011;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.varxyz.jv300.mod010.UserService;
import com.varxyz.jv300.mod010.User;

@WebServlet("/mod11/userupdate")
public class UserUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		
		User user = new User();
		user.setUserId(userId);
		user.setPasswd(passwd);
		
		userService = new UserService();
		userService.updateUser(userId,passwd);
	}

}
