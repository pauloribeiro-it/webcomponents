package servletcontext;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextExample extends HttpServlet{

	private static final long serialVersionUID = 7312305493530329156L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext servletContext =  getServletContext();
		Enumeration<String> parametersNames = servletContext.getInitParameterNames();
		String paramName;
		while(parametersNames.hasMoreElements()){
			paramName = parametersNames.nextElement();
			resp.getWriter().write("Param name: "+paramName+"|| Param value = "+servletContext.getInitParameter(paramName)+"\n");
		}
	}
}
