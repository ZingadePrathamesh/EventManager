package com.eventmanager.EventManager.event;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
	public Event findByName(String name);
}
