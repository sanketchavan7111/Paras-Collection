package career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/")
	public ModelAndView show(@RequestParam("key")String q)
	{
		ModelAndView mv=new ModelAndView("success");
		mv.addObject("val", q);
		
		return mv;
	}
	
}
