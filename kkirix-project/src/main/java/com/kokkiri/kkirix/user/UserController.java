package com.kokkiri.kkirix.user;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kokkiri.kkirix.user.model.dto.UserDto;
import com.kokkiri.kkirix.user.model.service.UserService;

@Controller
public class UserController {
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	/*@RequestMapping(value="/signup", method = RequestMethod.GET)
	public ModelAndView signup() {
	    return new ModelAndView("user/signup");
	}*/
	
	@RequestMapping("/signup.do")
	public ModelAndView signup() {
		logger.info("SIGNUP PAGE");
		return new ModelAndView("user/signup");
		//return "signup";
	}
	
	/*@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView login() {
	    return new ModelAndView("user/login");
	}*/
	
	@RequestMapping(value="/login.do")
	public ModelAndView login() {
		logger.info("LOGIN PAGE");
	    return new ModelAndView("user/login");
	}
	
	@RequestMapping(value="/board.do")
	public ModelAndView board() {
		logger.info("BOARD PAGE");
	    return new ModelAndView("board/board");
	}
	
	@RequestMapping(value= "/signup.do", method = RequestMethod.POST)
	public ModelAndView signupPost(@RequestParam Map<String, Object> map) {
	    ModelAndView mav = new ModelAndView();

	    String userId = this.userService.signup(map);
	    if (userId == null) {
	        mav.setViewName("redirect:/signup.do");
	    }else {
	        mav.setViewName("redirect:/login.do");
	    }  

	    return mav;
	}
	@RequestMapping(value="/userlogin.do", method = RequestMethod.POST)
	public String userLogin(@RequestParam Map<String, Object> map, HttpServletRequest request) {
		logger.info("LOGIN");
		
		HttpSession session = request.getSession();
		UserDto res = userService.login(map);
		
		if(res!=null) {
			session.setAttribute("res", res);
			return "redirect:board.do";
		}
		else {
			logger.info(res.getUser_id());
			return "redirect:login.do";
		}
	}
}
