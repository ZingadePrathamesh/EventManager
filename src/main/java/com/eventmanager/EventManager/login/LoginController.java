package com.eventmanager.EventManager.login;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.eventmanager.EventManager.Security.AuthentificationService;
import com.eventmanager.EventManager.TaskManager.Task;
import com.eventmanager.EventManager.TaskManager.TaskRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("firstname")
public class LoginController {
	private String currentUser;
	
	private AuthentificationService authentificationService;
	private TaskRepository taskRepository;

	
	public LoginController(AuthentificationService authentificationService,TaskRepository taskRepository) {
		super();
		this.authentificationService = authentificationService;
		this.taskRepository = taskRepository;
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
	private String eventManagerHomePage( ModelMap model,@RequestParam String firstname,@RequestParam String password) {
		if(authentificationService.authenticateAdmin(firstname, password)) {
			return "homepage";
		}
		else if(authentificationService.authenticateUser(firstname, password)) {
			currentUser = firstname;
			// redirecting to homepage
			//taking tasks from repository and showing it in the user home page task list
		List<Task> tasks = taskRepository.findByUsername(firstname);
		
		model.addAttribute("tasks",tasks);
			return "user_homepage";
		}
		else
		return "redirect:loginpage";
	}
	
	//from user homepage to user event list
	@RequestMapping("user-event-list")
	private String userEventPage() {
		return "user_event_list";
	}
	//from user navbar to homepage
	@RequestMapping("user_homepage")
	private String userHomePage(ModelMap model, HttpSession session) {
		String firstname = (String)session.getAttribute("firstname");
		List<Task> tasks = taskRepository.findByMember(firstname);		
		model.put("tasks", tasks);
		
		return "user_homepage";
	}
	
	//from user homepage to user task list
	@RequestMapping("user-tasks-list")
	private String userTaskPage(ModelMap model, HttpSession session) {
		String firstname = (String)session.getAttribute("firstname");
		List<Task> tasks = taskRepository.findByMember(firstname);		
		model.put("tasks", tasks);
		return "user_tasks_list";
	}
	
	
	
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
