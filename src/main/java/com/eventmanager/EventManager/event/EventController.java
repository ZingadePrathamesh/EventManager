package com.eventmanager.EventManager.event;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("username")
public class EventController {

	private EventService eventService;

	public EventController(EventService eventService) {
		super();
		this.eventService = eventService;
	}

	// Get, Post - Method for Listing all the events
	// here we are passing the list based upon the username of the user which we
	// will be taking
	// during the login page

	@RequestMapping("event-list")
	private String eventManagerEventListPage(ModelMap model) {

		model.addAttribute("events", eventService.getByUsername("prathamesh"));
		return "event_list";
	}

	// Get-Method for Creating Event
	// it shows the event form page

	@RequestMapping(value = "create-event", method = RequestMethod.GET)
	private String getCreateEventForm(ModelMap model) {
		Event tempEvent = new Event(0, "", LocalDate.now().plusMonths(2), LocalDate.now().plusYears(1), "Upcoming");
		model.put("event",tempEvent);
		return "event_form";
	}

	// Post-Method for Creating Event
	// use to add a new event in the list

	@RequestMapping(value = "create-event", method = RequestMethod.POST)
	private String postCreateEventForm(ModelMap model, @Valid Event event, BindingResult result) {
		
		if(result.hasErrors()) {
			return "event_form";
		}

		Event tempEvent = new Event(0, event.getName(), LocalDate.now().plusMonths(2), LocalDate.now().plusYears(1), "Upcoming");

		eventService.addNewEvent(tempEvent);
		return "redirect:event-list";
	}

}
