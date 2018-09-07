package jspfragments;

import java.util.Arrays;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce) {
		sce.getServletContext().setAttribute("beanCtx", new Bean("beanTest",25));
		sce.getServletContext().setAttribute("list",Arrays.asList(new String[]{"a1,a2,a3"}));
	}

	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
