package wrappers;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class RespWrapper extends HttpServletResponseWrapper{

	public RespWrapper(HttpServletResponse response) {
		super(response);
	}

}
