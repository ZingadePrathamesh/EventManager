package com.eventmanager.EventManager.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {


	private UserRepository userRepository;
	

	public UserController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@RequestMapping(value="signup-page",method = RequestMethod.GET)
	public String gotoSignupPage (ModelMap model) {
		UserInfo tempUser = new UserInfo(0,"","","",18,"");
			model.addAttribute("userInfo", tempUser);
		return "signup_form";
	}
	
	@RequestMapping(value="signup-page",method = RequestMethod.POST)
	public String gotoLoginPage (ModelMap model,UserInfo userInfo) {
		
//		UserInfo tempUser = userRepository.findByFirstname(firstname);
//		
//			userInfo.setFirstname(firstname);
//		userRepository.save(userInfo);
//			model.addAttribute("userInfo", tempUser);
		return "redirect:login";
	}

	
}
