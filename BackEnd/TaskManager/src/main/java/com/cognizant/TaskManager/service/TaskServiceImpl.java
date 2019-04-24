package com.cognizant.TaskManager.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.TaskManager.dao.TaskDAO;
import com.cognizant.TaskManager.model.Task;
import com.cognizant.TaskManager.queryinterface.TaskQueries;
import com.cognizant.TaskManager.util.StringConstants;

@Service
public class TaskServiceImpl implements TaskService{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private TaskDAO dao;
	
	private String returnMsg = StringConstants.ERROR;

	@Override
	public String addTask(Task task) {
		try {
			boolean isAdded = dao.addTask(TaskQueries.ADD_TASK, task);
			returnMsg = isAdded?StringConstants.SUCCESS:returnMsg;
		} catch (Exception ex) {
			logger.info("===ERROR IN ADD_TASK SERVICE===",ex.getMessage()); 
		}
		return returnMsg;
	}

	@Override
	public String editTask(Task task) {
		try {
			boolean isEdited = dao.editTask(TaskQueries.EDIT_TASK, task);
			returnMsg = isEdited?StringConstants.SUCCESS:returnMsg;
		} catch (Exception ex) {
			logger.info("===ERROR IN EDIT_TASK SERVICE===",ex.getMessage()); 
		}
		return returnMsg;
	}

	@Override
	public String deleteTask(Task task) {
		try {
			boolean isDeleted = dao.deleteTask(TaskQueries.DELETE_TASK, task);
			returnMsg = isDeleted?StringConstants.SUCCESS:returnMsg;
		} catch (Exception ex) {
			logger.info("===ERROR IN DELETE_TASK SERVICE===",ex.getMessage()); 
		}
		return returnMsg;
	}

	@Override
	public String viewTask(Task task) {
		try {
			boolean isAdded = dao.addTask(TaskQueries.VIEW_TASK, task);
			returnMsg = isAdded?StringConstants.SUCCESS:returnMsg;
		} catch (Exception ex) {
			logger.info("===ERROR IN ADDTASK SERVICE===",ex.getMessage()); 
		}
		return returnMsg;
	}

	@Override
	public String endTask(Task task) {
		try {
			boolean isEnded = dao.endTask(TaskQueries.END_TASK, task);
			returnMsg = isEnded?StringConstants.SUCCESS:returnMsg;
		} catch (Exception ex) {
			logger.info("===ERROR IN END_TASK SERVICE===",ex.getMessage()); 
		}
		return returnMsg;
	}

}
