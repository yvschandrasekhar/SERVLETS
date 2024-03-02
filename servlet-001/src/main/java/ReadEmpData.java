import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/employee")
public class ReadEmpData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("n");
		String gender=req.getParameter("g");
		String salary=req.getParameter("s");
		String bonus=req.getParameter("b");
		PrintWriter pw=res.getWriter();
		pw.write("<h1> NAME   :"+name+"</h1>");
		pw.write("<h1> GENDER :"+gender+"</h1>");
		pw.write("<h1> SALARY :"+salary+"</h1>");
		pw.write("<h1> BONUS  :"+bonus+"</h1>");
	}

}
