package com.example.SpringBootSecuritySimple;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class TestController {

	@RequestMapping("/")
	public ModelAndView defaultHome() {
		return new ModelAndView("home");
	}
}