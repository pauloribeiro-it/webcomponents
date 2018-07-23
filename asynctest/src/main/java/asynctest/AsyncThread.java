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
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");
//		this.context.dispatch("/begin.jsp");
		this.context.complete();
	}

}
