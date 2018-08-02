package dynamicregisteration;

import java.util.EnumSet;
import java.util.Set;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import proxy.FilterProxy;

public class ServletInitializer implements ServletContainerInitializer {

	public void onStartup(Set<Class<?>> classes, ServletContext ctx) throws ServletException {
		//adding a regular unregistered filter, but not virtual
		FilterRegistration unregisteredFilter = ctx.addFilter("unregisteredfilter", UnregisteredFilter.class);
		EnumSet<DispatcherType> dispatcherTypes = EnumSet.of(DispatcherType.REQUEST, DispatcherType.INCLUDE);
		unregisteredFilter.addMappingForUrlPatterns(dispatcherTypes, false, "/unregfilter");

		//adding a virtual filter created by a proxy using reflection
		FilterProxy proxy = new FilterProxy();
		Filter virtualProxy = proxy.createProxy(Filter.class);
		ctx.addFilter("virtualFilter", virtualProxy).addMappingForUrlPatterns(dispatcherTypes, false, "/virtualProxy");
		
	}

}
