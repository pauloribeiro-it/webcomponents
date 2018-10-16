package wrappers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/serv"})
public class CommonServlet extends HttpServlet{
	private static final long serialVersionUID = 416458965422395987L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ReqWrapper reqWrapper = new ReqWrapper(req);
		getServletContext().getRequestDispatcher("/serv2").forward(reqWrapper, resp);
	}
}
