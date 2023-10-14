package com.eventmanager.EventManager.event;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {
	
	private EventService eventService;
	
	public EventController(EventService eventService) {
		super();
		this.eventService = eventService;
	}


	// Get-Method for Listing all the events
	//here we are passing the list based upon the username of the user which we will be taking
	//during the login page
	@RequestMapping("event-list")
	private String eventManagerEventListPage(ModelMap model) {
		
		model.addAttribute("events", eventService.getByUsername("prathamesh"));
		return "event_list";
	}
	
	
	
	
	// Get-Method for Creating Event
	@RequestMapping(value = "create-event", method = RequestMethod.GET)
	private String getCreateEventForm(ModelMap model) {
		return "event_form";
	}
	
	// Post-Method for Creating Event
	@RequestMapping(value = "create-event", method = RequestMethod.POST)
	private String postCreateEventForm(ModelMap model) {
		return "redirect:event-list";
	}
	
}
