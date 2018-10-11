package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/attribute")
public class ServletChangeAttribute extends HttpServlet{
	
	private static final long serialVersionUID = -3401672412257307694L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String attrName = req.getParameter("attr");
		String value = req.getParameter("value");
		if(attrName != null && !attrName.isEmpty() && (value == null || value.isEmpty())){
			getServletContext().removeAttribute(attrName);
			return;
		}
		getServletContext().setAttribute(attrName, value);
	}
}
