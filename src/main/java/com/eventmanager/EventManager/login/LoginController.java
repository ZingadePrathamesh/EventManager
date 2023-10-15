package com.eventmanager.EventManager.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"username", "password"})
public class LoginController {

	
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
	private String eventManagerHomePage(@RequestParam String username, ModelMap model) {
		model.put("username", username);
		return "homepage";
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


	// Get-Method
	@RequestMapping(value = "tasks-list", method = RequestMethod.GET)
	private String eventManagerTaskListPage() {
		return "tasks_list";
	}
}
