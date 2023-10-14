package com.eventmanager.EventManager.event;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {
	
	private EventService eventService;
	
	public EventController(EventService eventService) {
		super();
		this.eventService = eventService;
	}


	// Get-Method
	@RequestMapping("event-list")
	private String eventManagerEventListPage(ModelMap model) {
		
		model.addAttribute("events", eventService.getByUsername("prathamesh"));
		return "event_list";
	}
	
}
