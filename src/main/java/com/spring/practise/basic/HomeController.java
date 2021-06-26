package com.spring.practise.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(path="/")
	public String Welcome() {
		return "<b>Hello world</b>";
	}
	
	
	@RequestMapping(path="home2",method = RequestMethod.GET)
	public String Home2() {
		return "Home2 index";
	}
}
