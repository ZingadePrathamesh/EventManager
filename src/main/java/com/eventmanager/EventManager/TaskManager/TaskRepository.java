package com.eventmanager.EventManager.TaskManager;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {

	public List<Task> findByUsername(String username);
	public List<Task> findByName(String name);
}
