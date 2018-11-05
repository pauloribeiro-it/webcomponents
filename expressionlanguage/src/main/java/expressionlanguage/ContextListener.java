package expressionlanguage;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce) {
		Bean bean = new Bean("superbean","superbeanvalue");
		sce.getServletContext().setAttribute("bean", bean);
	}

	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
