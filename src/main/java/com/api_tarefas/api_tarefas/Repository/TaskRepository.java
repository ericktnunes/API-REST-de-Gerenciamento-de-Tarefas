package com.api_tarefas.api_tarefas.Repository;

import com.api_tarefas.api_tarefas.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
