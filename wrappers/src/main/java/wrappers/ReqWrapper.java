package wrappers;

import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class ReqWrapper extends HttpServletRequestWrapper{

	public ReqWrapper(HttpServletRequest request) {
		super(request);
	}

	@Override
	public String getCharacterEncoding() {
		return "blau";
	}
}
