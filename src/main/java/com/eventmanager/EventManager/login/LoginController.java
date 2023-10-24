package com.eventmanager.EventManager.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.eventmanager.EventManager.Security.AuthentificationService;

@Controller
@SessionAttributes("firstname")
public class LoginController {
	
	private AuthentificationService authentificationService;
	

	
	public LoginController(AuthentificationService authentificationService) {
		super();
		this.authentificationService = authentificationService;
	}

	// landing page
	@RequestMapping(value = "/", method = RequestMethod.GET)
	private String eventManagerLandingPage() {
		return "landing";
	}

	// Get-Method
	@RequestMapping(value = "loginpage", method = RequestMethod.GET)
	private String eventManagerLoginPage() {
		return "login";
	}

	// Post-Method
	@RequestMapping(value = "loginpage", method = RequestMethod.POST)
	private String eventManagerHomePage(@RequestParam String firstname,@RequestParam String password, ModelMap model) {
		if(authentificationService.authenticateAdmin(firstname, password)) {
			return "homepage";
		}
		else if(authentificationService.authenticateUser(firstname, password)) {
			return "user_homepage";
		}
		else
		return "redirect:loginpage";
	}
	

	// redirecting to homepage
	@RequestMapping("homepage")
	private String eventManagerRedirectHomePage() {
		return "homepage";
	}

	// profile page
	@RequestMapping("profile-page")
	private String eventManageProfilePage() {
		return "profile";
	}

	// team page
	@RequestMapping("team-page")
	private String eventManageTeamPage() {
		return "team";
	}



	
}
