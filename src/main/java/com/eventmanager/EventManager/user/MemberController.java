package com.eventmanager.EventManager.user;

import org.hibernate.query.results.ResultBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.validation.Valid;

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
			
		return "sign_up_form";
	}
	
	@RequestMapping(value="signup-page",method = RequestMethod.POST)
	public String gotoLoginPage (ModelMap model, @Valid Member member, BindingResult result) {
		if(result.hasErrors()) {
			return "sign_up_form";
		}
		Member memberSave = new Member(0, member.getFirstname(), member.getLastname(), 
				member.getSkill(), member.getAge(), member.getPassword());
		memberRepository.save(memberSave);
		return "redirect:loginpage";
	}
	
	

	
}
