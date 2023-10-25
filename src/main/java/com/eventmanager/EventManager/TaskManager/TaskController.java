package com.eventmanager.EventManager.TaskManager;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.eventmanager.EventManager.user.Member;
import com.eventmanager.EventManager.user.MemberRepository;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class TaskController {

	private TaskRepository taskRepository;
	private MemberRepository memberRepository;
	public TaskController(TaskRepository taskRepository, MemberRepository memberRepository) {
		super();
		this.taskRepository = taskRepository;
		this.memberRepository = memberRepository;
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
		public String eventManagerTaskFormPage(ModelMap model,HttpSession session) {
			
			// Retrieve the existing list of firstnames from the session
//		    List<String> firstnames = (List<String>) session.getAttribute("firstnames");
		 
			Task task = new Task(0,0,"","admin","","",LocalDate.now(),"",false,"");
			List<Member> members = memberRepository.findAll();
			model.addAttribute("members", members);
//			model.addAttribute("firstnames",firstnames);
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
	
		
		// Get-Method
		//for task form
		@RequestMapping(value="task-form-from-event",method=RequestMethod.GET)
		public String eventViewTaskForm(ModelMap model, @RequestParam String name,HttpSession session) {
			
			// Retrieve the existing list of firstnames from the session
			List<Member> members = memberRepository.findAll();
			model.addAttribute("members", members);
			
			Task task = new Task(0,0,name,"admin","","",LocalDate.now(),"",false,"");
					
			model.put("task", task);
			return "task_form";
		}
		
		//Post-method 
		//post method for task form
		@RequestMapping(value="task-form-from-event",method=RequestMethod.POST)
		public String eventViewTaskSubmitPage(ModelMap model, Task task) {
			
			System.out.println("post:" + task.getEventname());
			List<Task> tasks = taskRepository.findByUsername("admin");
			System.out.println("post:" + task.getEventname());
			
			task.setUsername("admin");
			taskRepository.save(task);
			model.addAttribute("tasks",tasks );
			return "redirect:event-view?name="+ task.getEventname();
		}
		
		// Get-Method for updating Event
		// it shows the event form page

		@RequestMapping(value = "update-task", method = RequestMethod.GET)
		private String getUpdateEventForm(ModelMap model, @RequestParam int id) {
		    Optional<Task> tempTask = taskRepository.findById(id);
		    
		    if (tempTask.isPresent()) {
		        model.addAttribute("task", tempTask.get()); // Add "task" to the model
				List<Member> members = memberRepository.findAll();
				model.addAttribute("members", members);
		        return "task_form";
		    } else {
		        // Handle the case where the task with the given ID is not found
		        return "redirect:tasks-list"; // or show an error page
		    }
		}
		
		// Post-Method for Updating the  Event
		// use to update the existing event in the list
		
		@RequestMapping(value = "update-task", method = RequestMethod.POST)
		private String postUpdateEventForm(ModelMap model, @Valid Task task) {
			int id = task.getId();
			
			taskRepository.deleteById(id);
			
			taskRepository.save(new Task(id, 0,task.getEventname(), "admin",task.getTaskName(),task.getDescription(), 
					task.getDeadline(),task.getDomain(), task.getisDone(),task.getMember()));
			
//			eventService.updateEvent(event);
			return "redirect:tasks-list";
		}
}
