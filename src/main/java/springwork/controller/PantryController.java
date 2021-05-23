package springwork.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springwork.models.Pantry;
import springwork.models.User;
import springwork.services.PantryService;
import springwork.services.UserService;
@Controller
public class PantryController {
	@RequestMapping(value="pantry/create", method = RequestMethod.GET)
	public ModelAndView createPantryScreen(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("pantry/create");
		return mav;
	}
	
	@RequestMapping(value="pantry/create", method = RequestMethod.POST)
	public ModelAndView createPantry(HttpServletRequest request) {
		// get user credentials 
		// if they already have a pantry send them to their pantry and let them know only one pantry may be created
		//if they don't have a pantry continue
		ModelAndView mav = null;
		try {
			PantryService pantryService = new PantryService();
			Pantry pantry = new Pantry(request.getParameter("pantry_name"));
			pantryService.saveToDatabase(pantry);
			mav = new ModelAndView("misc/success");
		}catch(Exception e) {
			mav = new ModelAndView("misc/error");
		}
		return mav;
	}
}
