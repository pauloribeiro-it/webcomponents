package master;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/masterapp")
public class MasterServlet extends HttpServlet{

	private static final long serialVersionUID = -9141063478834412607L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext slaveContext = getServletContext().getContext("/slave");
		slaveContext.getRequestDispatcher("/index.jsp").forward(req, resp);//will invoke the resource
	}
	
	/**
	 * Note: it's necessary to put a attribute on tag Context in server.xml (assuming you're using Tomcat), if this tag is not used
	 * then the server will always return null on ServletContext.getContext method invocation, see a example below
	 * <Context docBase="/home/.../apache-tomcat-9.0.8/wtpwebapps/master" path="/master" reloadable="true" crossContext="true" source="org.eclipse.jst.j2ee.server:master"/>
	 */
}
