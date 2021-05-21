package springwork.controller;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import springwork.models.User;
import springwork.services.UserService;

@Controller
public class UserController {
	@RequestMapping(value="/createuser", method = RequestMethod.GET)
	public ModelAndView displayRoute(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("users/create");
		return mav;
	}
	
	@RequestMapping(value="/createuser", method= RequestMethod.POST)
	public ModelAndView createUser(HttpServletRequest request) {
		ModelAndView mav;
		try {
		User user = new User(request.getParameter("email"), request.getParameter("password"));
		UserService userService = new UserService();
		userService.saveToDatabase(user);
		mav = new ModelAndView("misc/success");
		}
		catch(Exception e) {
			mav = new ModelAndView("misc/error");
		}
		return mav;
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView loginScreen(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("auth/login");
		return mav;
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView loginUser(HttpServletRequest request) {
		ModelAndView mav = null;
		try {
			UserService userService = new UserService();
			User user = userService.findByEmail(request.getParameter("email")); 
			boolean validated = userService.validateUser(user, request.getParameter("password"));
			if(validated) {
				mav = new ModelAndView("misc/success");
			}else {
				mav = new ModelAndView("misc/error");
			}
		}catch(NoResultException e) {
			System.out.print(e);
		}
		return mav;
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public ModelAndView registerScreen(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("auth/register");
		return mav;
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public ModelAndView registerUser(HttpServletRequest request) {
		ModelAndView mav = null;
		UserService userService = new UserService();
		try {
			User user = userService.findByEmail(request.getParameter("email")); 
			mav = new ModelAndView("misc/error");
		}catch(NoResultException e) {
			User user = new User(request.getParameter("email"), request.getParameter("password"));
			userService.saveToDatabase(user);
			mav = new ModelAndView("misc/success");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return mav;
	}
}
