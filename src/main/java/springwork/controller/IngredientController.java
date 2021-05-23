package springwork.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IngredientController {
@RequestMapping(value="/createingredient", method= RequestMethod.GET)
public ModelAndView createIngredient(HttpServletRequest request) {
	ModelAndView mav = null;
	mav = new ModelAndView("ingredient/create");
	return mav;
}

@RequestMapping(value="/createingredient", method= RequestMethod.POST)
public ModelAndView storeIngredient(HttpServletRequest request) {
	ModelAndView mav = null;
	mav = new ModelAndView("ingredient/create");
	return mav;
}
}
