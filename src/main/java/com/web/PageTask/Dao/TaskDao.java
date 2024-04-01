package com.web.PageTask.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.PageTask.Dominio.Task;

public interface TaskDao extends JpaRepository<Task,Long>{
   
}