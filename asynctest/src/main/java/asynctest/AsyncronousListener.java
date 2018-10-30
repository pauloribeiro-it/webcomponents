package asynctest;

import java.io.IOException;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;

public class AsyncronousListener implements AsyncListener{

	@Override
	public void onComplete(AsyncEvent event) throws IOException {
		System.out.println("completed");
	}

	@Override
	public void onTimeout(AsyncEvent event) throws IOException {
		System.out.println("timeout");
	}

	@Override
	public void onError(AsyncEvent event) throws IOException {
		System.out.println("erro");
	}

	@Override
	public void onStartAsync(AsyncEvent event) throws IOException {
		System.out.println("started");
	}

}
