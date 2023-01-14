package com.krishna;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krishna.model.UserRegistration;

@Controller
public class HomePageController {

	@ModelAttribute
	public void cleartheData() {
		System.out.println("Always set here-----------");
	}
	@RequestMapping("/")
	public String homePage() {
		return "index.jsp";
	}
	
	@RequestMapping("registration")
	public String registration(@ModelAttribute("registedUser") UserRegistration currentUser) {
		System.out.println("Current User is"+currentUser.getFirstName());
		return "success.jsp";
	}
}
