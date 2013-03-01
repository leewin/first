package com.roywmiller.contacts.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.roywmiller.contacts.model.ContactsUser;

public class LoginFilter implements Filter {
	private FilterConfig _config = null;
	private String _loginUrl = null;

	public void destroy() {
		_config = null;
		_loginUrl = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpReq = (HttpServletRequest) request;
		HttpServletResponse httpRep = (HttpServletResponse) response;
		ContactsUser user = (ContactsUser) httpReq.getSession().getAttribute(
				"user");
		// String url = getActionName(httpReq);
		if (user == null) {
			httpRep.sendRedirect(httpReq.getContextPath());
		}
		else {
			chain.doFilter(request, response);
		}
	}

	// private String getActionName(HttpServletRequest httpReq) {
	// String url = httpReq.getPathInfo();
	// if (url != null && !url.equals("/"))
	// return url.substring(1, url.lastIndexOf("."));
	// return "index";
	// }

	public void init(FilterConfig config) throws ServletException {
		_config = config;
		_loginUrl = config.getInitParameter("loginURL");
	}

}
