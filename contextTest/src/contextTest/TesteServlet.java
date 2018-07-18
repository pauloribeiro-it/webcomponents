package contextTest;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TesteServlet extends HttpServlet {
	private static final long serialVersionUID = 2698242994313866743L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ServletContext ctx = getServletContext();
//		Collections.list(getServletConfig().getInitParameterNames()).forEach(a -> System.out.println(a));
//		List<String> attrs = Collections.list(ctx.getAttributeNames());
//		attrs.forEach(attr -> System.out.println(attr));
		Collections.list(getServletContext().getInitParameterNames()).forEach(param -> System.out.println(getServletContext().getInitParameter(param)));
		Collections.list(getServletConfig().getInitParameterNames()).forEach(param -> System.out.println(getServletConfig().getInitParameter(param)));
	}
}
