package com.eventmanager.EventManager.TaskManager;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Task {
	
	public Task() {
		
	}

	@Id
	@GeneratedValue
	private int id;
	
	private int eventId;
	private String eventName;
	private String username;
	private String taskName;
	private String description;
	private LocalDate deadline;
	private String domain;
	private boolean isDone;
	
	
	public Task(int id, int eventId, String eventName, String username, String taskName, String description,
			LocalDate deadline, String domain, boolean isDone) {
		super();
		this.id = id;
		this.eventId = eventId;
		this.eventName = eventName;
		this.username = username;
		this.taskName = taskName;
		this.description = description;
		this.deadline = deadline;
		this.domain = domain;
		this.isDone = isDone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDeadline() {
		return deadline;
	}
	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public boolean getisDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", eventId=" + eventId + ", eventName=" + eventName + ", username=" + username
				+ ", taskName=" + taskName + ", description=" + description + ", deadline=" + deadline + ", domain="
				+ domain + ", isDone=" + isDone + "]";
	}
	


	
	
	
	
	
}