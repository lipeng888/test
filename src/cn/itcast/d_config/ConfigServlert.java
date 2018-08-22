package cn.itcast.d_config;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet 
 */
public class ConfigServlert extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.获得servlet的名称  <servlet-name>ConServlert</servlet-name>
		
		//1.1 获得ServletConfig对象
		ServletConfig servletConfig = getServletConfig();
		
		//1.2 获得servlet名称
		String servletName = servletConfig.getServletName();
		System.out.println(servletName);
		
		//2.获得servlet初始化参数
		String parameter = servletConfig.getInitParameter("ds");
		System.out.println(parameter);
		
		//3.获得上下文对象
		ServletContext context = servletConfig.getServletContext();
		System.out.println(context);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
