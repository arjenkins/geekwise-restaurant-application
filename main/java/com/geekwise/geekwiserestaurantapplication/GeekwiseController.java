package com.geekwise.geekwiserestaurantapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GeekwiseController {



@RequestMapping("/")
public ModelAndView landing() {
	return new ModelAndView("landing");
	}	

}