package com.eventmanager.EventManager.event;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class EventController {
	
	private EventService eventService;
	
	public EventController(EventService eventService) {
		super();
		this.eventService = eventService;
	}


	// Get, Post -Method for Listing all the events
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
	private String postCreateEventForm( @RequestParam String name ,ModelMap model) {
		Event event = new Event(0, name, LocalDate.now().plusMonths(2), LocalDate.now().plusYears(1), "Upcoming");
		eventService.addNewEvent(event);
		return "redirect:event-list";
	}
	
}
