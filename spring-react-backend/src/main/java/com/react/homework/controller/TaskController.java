package com.react.homework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.react.homework.model.Task;
import com.react.homework.repository.TaskRepository;

@RestController
@RequestMapping("homeworks/")
public class TaskController {

	@Autowired
	private TaskRepository taskRepository;	
	
	@GetMapping("tasks/")
	public List<Task> listarTasks(){
		return this.taskRepository.findAll();
	}
}
