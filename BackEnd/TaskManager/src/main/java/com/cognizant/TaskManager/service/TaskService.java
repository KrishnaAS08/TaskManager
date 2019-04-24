package com.cognizant.TaskManager.service;

import com.cognizant.TaskManager.model.Task;


public interface TaskService {
	
	String addTask(Task task);
	
	String editTask(Task task);
	
	String deleteTask(Task task);
	
	String viewTask(Task task);
	
	String endTask(Task task);

}
