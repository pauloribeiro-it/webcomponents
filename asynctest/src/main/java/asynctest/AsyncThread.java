package asynctest;

import javax.servlet.AsyncContext;

public class AsyncThread implements Runnable{

	private AsyncContext context;
	
	public AsyncThread(AsyncContext context) {
		this.context = context;
	}
	
	@Override
	public void run() {
		System.out.println("begin");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		context.dispatch();
		System.out.println("end");
//		this.context.dispatch("/begin.jsp");
		this.context.complete();
	}

}
