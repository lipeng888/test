package cn.itcast.c_startup;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet 服务器启动时,初始化当前servlet
 */
public class StartupServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
	}

	/*
	 * 子类重写父类的方法,那么父类的方法就不会执行
	 子类重写父类的方法,那么父类的方法就不会执行
	 */
	public void init() throws ServletException {
		System.out.println(".....StartupServlet启动初始化");
	}
}
