package com.example.demo.services;

import java.util.Date;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskStatus;

@Component
public interface ITask {
    Task createTask(String taskName, String description, Date dueDate);
    Task updateTask(Long taskId, String taskName, String description, Date dueDate,  TaskStatus status);
    Integer deleteTask(Long taskId);
    Integer updateTaskStatus(Long taskId, TaskStatus status);
    Optional<Task> getTaskById(Long taskId);
    Optional<Task> getTaskByName(String taskName);
}
