package com.examples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Summation")
public class Summation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		String values = request.getParameter("values");
		int sum2 = new Sum(values).getSum();
		request.setAttribute("data", sum2);
		switch(sum2) {
		case 0: forwardRequest("/Second.jsp", request, response);
				break;
		case -1: forwardRequest("/Error.jsp", request, response);
				break;
		default: forwardRequest("/SumResult.jsp", request, response);
		}
	}
	
	private void forwardRequest(String path , HttpServletRequest request  , HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher(path);
		rd.forward(request, response);
	}

}