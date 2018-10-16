package wrappers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/serv2"})
public class OtherServlet extends HttpServlet{

	private static final long serialVersionUID = -2461584817226877618L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Other servlet - service");
		System.out.println(req.getCharacterEncoding());
	}
}
