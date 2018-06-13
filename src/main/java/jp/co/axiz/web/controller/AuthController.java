package jp.co.axiz.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.axiz.web.dao.AdminDao;
import jp.co.axiz.web.entity.Admin;

@Controller
public class AuthController {

	@RequestMapping("/login")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		AdminDao adminDao = new AdminDao();
		Admin admin = adminDao.findByIdAndPassword(id, pass);

		if (admin != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", admin);
			response.sendRedirect(request.getContextPath() + "/menu.jsp");
		} else {
			request.setAttribute("errmsg", "IDまたはPASSが間違っています");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
		@RequestMapping("/login")
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		}

		@RequestMapping("/logout")
		protected void doPost1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		}

}
