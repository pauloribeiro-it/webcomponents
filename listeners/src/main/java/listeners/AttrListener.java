package listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AttrListener implements ServletContextAttributeListener{

	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("Attributte added");
		System.out.println("Name: "+event.getName());
		System.out.println("Value: "+event.getValue());
	}

	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("Attributte removed");
		System.out.println("Name: "+event.getName());
		System.out.println("Old Value: "+event.getValue());
	}

	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println("Attributte replaced");
		System.out.println("Name: "+event.getName());
		System.out.println("Old Value: "+event.getValue());
		System.out.println("New value: "+event.getServletContext().getAttribute(event.getName()));
	}

}
