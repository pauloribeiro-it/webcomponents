package responsecommitment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/serv1"})
public class Servlet1 extends HttpServlet{
	private static final long serialVersionUID = -1006242486957345278L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().write("servlet1 - service method invoked");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/begin.jsp");
		System.out.println(resp.isCommitted());
//		resp.sendRedirect("middle.jsp");
		dispatcher.forward(req, resp);
		System.out.println(resp.isCommitted());
		resp.getWriter().write("ends");
		
		
		resp.reset();
	}
}
