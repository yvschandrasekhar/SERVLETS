import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/veh")
public class SaveVehicle extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int regno=Integer.parseInt(req.getParameter("r"));
		String brand=req.getParameter("b");
		String price=req.getParameter("p");
		String color=req.getParameter("c");
		PrintWriter pw=res.getWriter();
		pw.write("<h1> REGNO  :"+regno+"</h1>");
		pw.write("<h1> BRAND  :"+brand+"</h1>");
		pw.write("<h1> PRICE  :"+price+"</h1>");
		pw.write("<h1> COLOR  :"+color+"</h1>");
		
	}
	
}
