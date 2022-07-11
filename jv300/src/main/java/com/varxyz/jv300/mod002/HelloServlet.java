package com.varxyz.jv300.mod002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	// doGet이랑 파라미터(HttpServletRequest request, HttpServletResponse response)는 정해진것!!
	protected void doGet(HttpServletRequest request, HttpServletResponse response)	// get 방식으로 servlet을 호출할 때 실행 
			throws ServletException, IOException {
		String pageTitle = "Hello Wrold";
		response.setContentType("text/html; charset=UTF-8");	// 응답을 html로 하고 문자를 utf-8로 하겠다.
		PrintWriter out = response.getWriter();	// PrintWriter은 Writer의 자식
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>");
		out.println("<body>");
		out.println("<h3 style='color:blueviolet; text-align: center'> Welcome to 서블릿 프로그래밍</h3>");
		out.println("</body></html>");
		out.close();
	}
}
