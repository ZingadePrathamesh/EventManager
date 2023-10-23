package com.eventmanager.EventManager.TaskManager;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class TaskController {

	private TaskRepository taskRepository;
	public TaskController(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}

	// Task list method
	@RequestMapping("tasks-list")
	public String eventManagerTaskListPage(ModelMap model) {
		List<Task> tasks = taskRepository.findByUsername("admin");
		model.addAttribute("tasks",tasks);
		return "tasks_list";
	}
	
	// Get-Method
	//for task form
		@RequestMapping(value="task-form",method=RequestMethod.GET)
		public String eventManagerTaskFormPage(ModelMap model) {
			Task task = new Task(0,0,"","admin","","",LocalDate.now(),"",false);
			model.put("task", task);
			return "task_form";
		}
		
		
	//Post-method 
	//post method for task form
		@RequestMapping(value="task-form",method=RequestMethod.POST)
		public String eventManagerTaskSubmitPage(ModelMap model,Task task) {
			
			List<Task> tasks = taskRepository.findByUsername("admin");
			
		
			task.setUsername("admin");
			taskRepository.save(task);
			model.addAttribute("tasks",tasks );
			return "redirect:tasks-list";
		}
	
}
