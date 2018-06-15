package jp.co.axiz.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.entity.Admin;
import jp.co.axiz.web.entity.UserInfo;
import jp.co.axiz.web.form.DeleteForm;
import jp.co.axiz.web.service.impl.UserInfoService;

@Controller
public class DeleteController {

	@Autowired
    MessageSource messageSource;

	@Autowired
	private UserInfoService userInfoService;

	@Autowired
	private Admin admin;

	@RequestMapping("/delete")
	public String delete(@ModelAttribute("deleteForm") DeleteForm form, Model model) {
		return "delete";
	}

	@RequestMapping(value = "/deleteConfirm", method = RequestMethod.POST)
	public String deleteConfirm(@Validated @ModelAttribute("deleteForm") DeleteForm form, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("errmsg", "必須項目を入力してください");
			return "delete";
		}

		UserInfo user = userInfoService.findById(form.getUserId());

		if(user == null) {
			model.addAttribute("errmsg", "入力されたデータは存在しません");
			return "delete";
		}

		form.setName(user.getUserName());
		form.setTel(user.getTelephone());

		return "deleteConfirm";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteExecute(@Validated @ModelAttribute("deleteForm") DeleteForm form, BindingResult bindingResult,
			Model model) {

		int id = form.getUserId();

		userInfoService.delete(id);

		model.addAttribute("user", admin.getAdmin_name());

		return "deleteResult";
	}
}