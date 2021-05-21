package springwork.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String welcome() {
		 return "redirect:home";
	}
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("pages/landing");
		return mav;
	}
	@RequestMapping("/displayroute")
	public ModelAndView displayRoute(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("displayRoute");
		HttpSession se = request.getSession();
		se.setAttribute("user", request.getParameter("name"));
		mav.addObject("user_name", request.getParameter("name"));
		return mav;
	}
}
