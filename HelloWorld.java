package servlet_examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

//		res.setHeader("Content-Type", "text/html; charset=Big5"); //�зǪ�
		res.setContentType("text/html; charset=Big5"); //²����
		PrintWriter out = res.getWriter();



		out.println("<HTML>");
		out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<BIG>Hello World , �@�ɧA�n22 !</BIG>");
		out.println("<p>" + getServletContext().getAttribute(ServletContext.TEMPDIR) + "</p>");
		out.println("</BODY></HTML>");

	}
}