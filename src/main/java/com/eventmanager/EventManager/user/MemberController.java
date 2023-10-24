package com.eventmanager.EventManager.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {


	private MemberRepository memberRepository;
	

	public MemberController(MemberRepository memberRepository) {
		super();
		this.memberRepository = memberRepository;
	}

	@RequestMapping(value="signup-page",method = RequestMethod.GET)
	public String gotoSignupPage (ModelMap model) {
		Member member = new Member(0,"","","",18,"");
			model.addAttribute("member", member);
			
		return "signup_form";
	}
	
	@RequestMapping(value="signup-page",method = RequestMethod.POST)
	public String gotoLoginPage (ModelMap model, Member member) {

		return "redirect:login";
	}

	
}
