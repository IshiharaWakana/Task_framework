package jp.co.axiz.web.controller;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {

//	@Autowired
//	private LoginService loginService;

	@RequestMapping("/login")
	public String index(Model model){
		return "login";
	}

	@RequestMapping(value="/post", method=RequestMethod.POST)
	public String post(@ModelAttribute("Login") Admin admin, Model model) {
	model.addAttribute("param.id" + admin.getId());
	return "menu";
	}

//		@RequestParam("id")String id;
//		String pass = request.getParameter("pass");
//
//		AdminDao adminDao = new AdminDao();
//		Admin admin = AdminDao.findByIdAndPassword(id, pass);
//
//		if (admin != null) {
//			HttpSession session = request.getSession();
//			model.addAttribute("user", admin);
//			response.sendRedirect(request.getContextPath() + "/menu.jsp");
//		} else {
//			request.setAttribute("errmsg", "IDまたはPASSが間違っています");
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//
//
//
////ログアウト
//		@RequestMapping("/logout",method=RequestMethod.POST)
//		protected void doPost1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			request.getSession().invalidate();
//			request.getRequestDispatcher("logout.jsp").forward(request, response);
//		}

}
