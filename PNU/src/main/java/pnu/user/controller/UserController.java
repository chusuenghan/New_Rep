package pnu.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pnu.user.Service.UserService;
import pnu.user.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/signUpPage.do", method = RequestMethod.POST)
	public String signUpPage() {
		return "user/signUp.jsp";
	}
	
	@RequestMapping(value="/signUp.do", method = RequestMethod.POST)
	public String signUp(@ModelAttribute UserVO user) {
		userService.insertUser(user);
		
		return "redirect:/loginPage.do";
	}
}
