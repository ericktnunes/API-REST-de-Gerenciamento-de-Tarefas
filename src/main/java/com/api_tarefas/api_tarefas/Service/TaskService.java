package com.api_tarefas.api_tarefas.Service;

import com.api_tarefas.api_tarefas.Entity.Task;
import com.api_tarefas.api_tarefas.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    //command for return all existing tasks
    public List<Task> findAllTask(){
        return taskRepository.findAll();
    }

    //command for return task by id
    public Task findTaskById(Long id){
        Optional<Task> taskOptional = taskRepository.findById(id);
        if(taskOptional.isPresent()){
            return taskOptional.get();
        }
        return null;
    }

    //command for create a new task
    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    //command for update task
    public Task updateTask(Task task){
        return taskRepository.save(task);
    }

    //command for delete task and return all existing tasks
    public List<Task> deleteTask(Long id){
        taskRepository.deleteById(id);
        return findAllTask();
    }

}
