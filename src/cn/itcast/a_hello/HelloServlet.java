package cn.itcast.a_hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 入门案例
 * 	1.编写一个实现类继承HttpServlet
 *  2.重写doGet和doPost方法
 *  3.在web.xml中配置servlet
 */
public class HelloServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("......doGet.....");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("......doPost.....");
	}
	
	public void init() throws ServletException {
		System.out.println("我被初始化了zzzzzzzz......");
	}

}
