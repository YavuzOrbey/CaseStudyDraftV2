package springwork.controller;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springwork.models.Measurement;
import springwork.services.MeasurementService;

@Controller
public class MeasurementController {
	@RequestMapping(value="measurement/create", method= RequestMethod.GET)
	public ModelAndView createMeasurement(HttpServletRequest request) {
		ModelAndView mav = null;
		mav = new ModelAndView("measurement/create");
		return mav;
	}

	@RequestMapping(value="measurement/create", method= RequestMethod.POST)
	public ModelAndView storeMeasurement(HttpServletRequest request) {
		ModelAndView mav = null;
		MeasurementService measurementService = new MeasurementService();
		try {
			measurementService.findByName(request.getParameter("measurement_name"));
			mav = new ModelAndView("misc/error");
			
			


		}
		catch(NoResultException e) {
			Measurement measurement = new Measurement(request.getParameter("measurement_name"));
			measurementService.saveToDatabase(measurement);
			mav = new ModelAndView("misc/success");
		}
		catch(Exception e) {
			mav = new ModelAndView("misc/error");
		}
		return mav;
	}
}
