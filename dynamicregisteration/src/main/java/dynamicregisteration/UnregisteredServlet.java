package dynamicregisteration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UnregisteredServlet extends HttpServlet{

	private static final long serialVersionUID = 6861985067278922223L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().write("Unregistered servlet invoked");
	}
}
