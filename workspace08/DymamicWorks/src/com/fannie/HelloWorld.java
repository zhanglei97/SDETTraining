package com.fannie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(description = "this is the first hello project", urlPatterns = { "/dontsayhello.html" })
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/thml");		
		
		//writer wil help to write to client
		PrintWriter out = response.getWriter();
		
		//to write it is only client side language
		//javascript, css, html
		
		Date d = new Date();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Hello world from Servelets</h1>");
		out.print("<button type='button'>Click Me!</button>");
		out.print("</br>");
		out.print("<button><a href='https://www.w3schools.com'>Visit fanniemae.com!</a></button>");
		out.print("<h3>Today date is "+d+"</h3>");
		out.print("</body>");
		
		out.print("</html>");
		
	}

}
