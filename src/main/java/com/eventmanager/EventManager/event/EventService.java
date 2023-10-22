package com.eventmanager.EventManager.event;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.persistence.criteria.Predicate;

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
	
	public Event getById(int id){
//		Predicate<? super Event> predicate = event-> event.getId() == id;
//		Event event = events.stream().filter(predicate).findFirst().get()	
		return events.get(1);
	}
	
	public void addNewEvent(Event event){
		events.add(new Event(++eventCount, event.getName(), event.getStartDate(), event.getEndDate(), event.getStatus()));
	}
}
