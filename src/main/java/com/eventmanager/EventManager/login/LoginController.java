package com.eventmanager.EventManager.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	
	//Get-Method
	@RequestMapping(value = "eventmanager-loginpage", method = RequestMethod.GET)
	private String eventManagerLoginPage() {
		return "login";
	}
	
	//Get-Method
		@RequestMapping(value = "eventmanager-loginpage", method = RequestMethod.POST)
		private String eventManagerHomePage() {
			return "homepage";
		}
	
	
}
