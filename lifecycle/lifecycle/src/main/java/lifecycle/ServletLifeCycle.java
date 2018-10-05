package lifecycle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/lifecycle"}, loadOnStartup=1)
public class ServletLifeCycle extends HttpServlet{

	private static final long serialVersionUID = 3809021601757028025L;
	
	@Override
	public void init() throws ServletException {
		System.out.println("Servlet initialised");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet called");
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet destroyed");
	}
}
