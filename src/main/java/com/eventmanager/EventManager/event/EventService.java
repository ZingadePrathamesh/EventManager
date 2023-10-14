package com.eventmanager.EventManager.event;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EventService {
	
	private static int eventCount = 0;
	 
	private static List<Event> events = new ArrayList<Event>();
	
	static {
		events.add(new Event(++eventCount, "Party", LocalDate.now().plusYears(1), LocalDate.now().plusYears(2), "Upcoming"));
		events.add(new Event(++eventCount, "Wedding", LocalDate.now().plusYears(1), LocalDate.now().plusYears(2), "Upcoming"));
		events.add(new Event(++eventCount, "Department Day", LocalDate.now().plusYears(1), LocalDate.now().plusYears(2), "Upcoming"));
		events.add(new Event(++eventCount, "Fresher's", LocalDate.now().plusYears(1), LocalDate.now().plusYears(2), "Upcoming"));
		events.add(new Event(++eventCount, "Webinar", LocalDate.now().plusYears(1), LocalDate.now().plusYears(2), "Upcoming"));
	}
	
	public List<Event> getByUsername(String username){
		return events;
	}
}
