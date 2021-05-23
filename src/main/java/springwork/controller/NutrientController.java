package springwork.controller;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import springwork.models.Measurement;
import springwork.models.Nutrient;
import springwork.models.User;
import springwork.services.MeasurementService;
import springwork.services.NutrientService;

@Controller
public class NutrientController {
	@RequestMapping(value="nutrient/create", method= RequestMethod.GET)
	public ModelAndView createNutrient(HttpServletRequest request) {
		ModelAndView mav = null;
		mav = new ModelAndView("nutrient/create");
		return mav;
	}

	@RequestMapping(value="nutrient/create", method= RequestMethod.POST)
	public ModelAndView storeNutrient(HttpServletRequest request) {
		ModelAndView mav = null;
		NutrientService nutrientService = new NutrientService();
		try {
			
			//check if a entity by that name already exists 
			nutrientService.findByName(request.getParameter("nutrient_name"));
			//if it doesn't it will go to the catch NoResultException block (this is what we want)
			//if it does return error page
			mav = new ModelAndView("misc/error");
		}catch(NoResultException e) {
			Nutrient nutrient = new Nutrient(request.getParameter("nutrient_name").toLowerCase());
			nutrientService.saveToDatabase(nutrient);
			mav = new ModelAndView("misc/success");
		}catch(Exception e) {
			mav = new ModelAndView("misc/error");
		}
		return mav;
	}
	
	@RequestMapping(value="nutrient/delete/{id}", method= RequestMethod.GET)
	@ResponseBody //need this if you want to return only a string else it tries to find a failure/success jsp page
	public String deleteNutrient(@PathVariable("id") int id) {
		String outcome = "";
		NutrientService nutrientService = new NutrientService();
		Nutrient nutrient = nutrientService.findById(id);
		try {
			nutrientService.deleteFromDatabase(nutrient);
			outcome="success";
		}
		catch(NoResultException | IllegalArgumentException e) { //in case id is not valid 
			outcome="failure";
		}
	
		return outcome;
	}
}
