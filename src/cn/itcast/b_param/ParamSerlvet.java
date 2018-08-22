package cn.itcast.b_param;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet 获得请求参数
 */
public class ParamSerlvet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获得用户名
		String username = request.getParameter("username");

		// 获得密码
		String password = request.getParameter("password");

		System.out.println(username + "---" + password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {

		/*// 获得用户名
		String username = request.getParameter("username");

		// 获得密码
		String password = request.getParameter("password");

		System.out.println(username + "--doPost--" + password);*/
		/*
		 * 实际开发中,doGet和doPost代码几乎一致
		 * 因此,在doPost中调用doGet方法
		 */
		doGet(request, response);
	}

}
