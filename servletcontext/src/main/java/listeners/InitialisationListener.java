package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitialisationListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Servlet initialised");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Servlet destroyed");
	}

}
