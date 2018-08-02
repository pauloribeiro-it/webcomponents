package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class FilterProxy implements InvocationHandler {

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Nome do método: "+method.getName());
		return null;
	}

	public <T>T createProxy(Class<T> class1) {
		return (T) Proxy.newProxyInstance(class1.getClassLoader(), new Class<?>[] { class1 },this);
	}
	
}
