package pnu.main.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pnu.user.service.UserService;
import pnu.user.vo.UserVO;

@Controller
public class MainController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/busroute.do", method = RequestMethod.GET)
	public String busRoute() {
		return "busr.jsp";
	}
	
	@RequestMapping(value="/main.do", method = RequestMethod.GET)
	public String mainPage() {
		return "main.jsp";
	}

	@RequestMapping(value="/loginPage.do", method = RequestMethod.GET)
	public String loginPage() {
		return "login.jsp";
	}

//	@RequestMapping(value="/login.do", method = RequestMethod.POST)
//	public ModelAndView login(@ModelAttribute UserVO user) {
//		if(userService.selectPwd(user.getUserId(), user.getPwd())) {
//			
//			ModelAndView mav = new ModelAndView("main.jsp");
//			mav.addObject("user", userService.selectUserInfo(user.getUserId()));
//			return mav;
//		} else {
//			ModelAndView mav = new ModelAndView("login.jsp");
//			return mav;
//		}
//	}
	
	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	public String login(HttpSession session, @ModelAttribute UserVO user) {
		if(userService.selectUsed(user.getUserId()).equals("Y") && 
				userService.selectPwd(user.getUserId(), user.getPwd())) {
			userService.setSession(session, user.getUserId());
			
			return "main.jsp";
		} else {
			
			return "login.jsp";
		}
	}
	
	@RequestMapping(value="/logout.do", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("USER");
		return "login.jsp";
	}
}
