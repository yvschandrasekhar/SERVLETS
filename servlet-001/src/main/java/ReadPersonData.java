 import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/read")
public class ReadPersonData extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("n");
		String age = req.getParameter("a");
		String email = req.getParameter("e");
		String password = req.getParameter("p");
		 
		PrintWriter pw=res.getWriter();
		pw.write("<h1> NAME      : "+name+"</h1>");
		pw.write("<h1> AGE       : "+age+"</h1>");
		pw.write("<h1> EMAIL     : "+email+"</h1>");
		pw.write("<h1> PASSWORD  : "+password+"</h1>");
		/*System.out.println(name);
		System.out.println(age);
		System.out.println(email);
		System.out.println(password);*/
	}

}
