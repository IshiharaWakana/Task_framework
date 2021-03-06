package jp.co.axiz.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.dao.AdminDao;
import jp.co.axiz.web.entity.Admin;
import jp.co.axiz.web.entity.SessionInfo;

@Controller
public class AuthController {

//	@Autowired
//	private LoginService loginService;
	@Autowired
	AdminDao adminDao;

	@Autowired
	HttpSession session;

	@Autowired
	private SessionInfo sessionInfo;

//ログイン
	@RequestMapping("/login")//GET
	public String index(@ModelAttribute("logIn") Admin admin, Model model){
		return "login";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String get(@ModelAttribute("logIn") Admin admin, Model model) {
	String pass = admin.getPassword();

	Admin ad = adminDao.findByPassword(pass);

		if (ad != null) {
		session.setAttribute("user", ad);
			return "menu";

		} else {
			model.addAttribute("errmsg", "IDまたはPASSが間違っています");
			return "login";
		}
	}


//ログアウト
		@RequestMapping(value="/logout",method=RequestMethod.POST)
		public String logOut(Model model){
//			request.getSession().invalidate();
			sessionInfo.invalidate();
			return "logout";
		}

}
