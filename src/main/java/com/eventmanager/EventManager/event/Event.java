package com.eventmanager.EventManager.event;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Event {

	public Event() {
		
	}
	
	
	
	public Event(int id, String name, String description, LocalDate startDate, LocalDate endDate, String status) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}



	@Id
	@GeneratedValue
	private int id;
	
	@Size(min = 5, message = "Enter atleast 5 character!")
	private String name;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	private String status;
	
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", status="
				+ status + "]";
	}
	
	
	
	
	
}
