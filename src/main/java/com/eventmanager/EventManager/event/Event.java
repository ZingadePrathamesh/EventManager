package com.eventmanager.EventManager.event;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Event {

	@Id
	private long id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;

	
	
	
}
