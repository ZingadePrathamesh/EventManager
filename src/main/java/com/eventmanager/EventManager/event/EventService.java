package com.eventmanager.EventManager.event;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class EventService {
	
	private static int eventCount = -1;
	 
	private static List<Event> events = new ArrayList<Event>();
	
	static {
		events.add(new Event(++eventCount, "Party", "", LocalDate.now().plusYears(1), LocalDate.now().plusYears(2), "Upcoming"));
		events.add(new Event(++eventCount, "Wedding", "", LocalDate.now().plusYears(1), LocalDate.now().plusYears(2), "Upcoming"));
		events.add(new Event(++eventCount, "Department Day", "", LocalDate.now().plusYears(1), LocalDate.now().plusYears(2), "Upcoming"));
		events.add(new Event(++eventCount, "Fresher's", "", LocalDate.now().plusYears(1), LocalDate.now().plusYears(2), "Upcoming"));
		events.add(new Event(++eventCount, "Webinar", "", LocalDate.now().plusYears(1), LocalDate.now().plusYears(2), "Upcoming"));
	}
	
	public List<Event> getByUsername(String username){
		return events;
	}
	
	public Event findById(int id) {
		Predicate<? super Event> predicate = event -> event.getId() == id;
		Event event = events.stream().filter(predicate).findFirst().get();
		return event;
	}
	public Event findByName(String name) {
		Predicate<? super Event> predicate = event -> event.getName().equalsIgnoreCase(name);
		Event event = events.stream().filter(predicate).findFirst().get();
		
		return event;
	}
	
	public void addNewEvent(Event event){
		events.add(new Event(++eventCount, event.getName(), event.getDescription(), event.getStartDate(), event.getEndDate(), event.getStatus()));
	}
	
	public void deleteById(int id){
		Predicate<? super Event> predicate = event -> event.getId() == id;
		events.removeIf(predicate);
	}
	
	public void updateEvent(Event event){
		int id = event.getId();
		
		deleteById(id);
		
		events.add(new Event(id, event.getName(), event.getDescription(), event.getStartDate(), event.getEndDate(), event.getStatus()));
	}
}
