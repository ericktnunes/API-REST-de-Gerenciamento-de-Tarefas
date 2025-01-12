package com.api_tarefas.api_tarefas.Controller;


import com.api_tarefas.api_tarefas.Entity.Task;
import com.api_tarefas.api_tarefas.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.findAllTask();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id){
        return taskService.findTaskById(id);
    }

    @PostMapping
    public Task getCreateTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
    public Task getUpdateContext(@PathVariable Long id, @RequestBody Task task){
        return taskService.updateTask(task);
    }

    @DeleteMapping("/{id}")
    public List<Task> getDeleteTask(@PathVariable Long id){
        return taskService.deleteTask(id);
    }



}
