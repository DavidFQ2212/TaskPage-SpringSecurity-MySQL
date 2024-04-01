package com.web.PageTask.Service;
import com.web.PageTask.Dao.TaskDao;
import com.web.PageTask.Dominio.Task;

import org.springframework.stereotype.Service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TaskServiceImplement  implements TaskService{
    @Autowired
    private TaskDao taskDao;

    @Override
    @Transactional
    public List<Task> AlltTask() {
        return (List<Task>) taskDao.findAll();
        }

    @Override
    public void SaveTask(Task task) {
       taskDao.save(task);
    }

    @Override
    public void DeleteTask(Task task) {
        taskDao.delete(task);
    
    }

    @Override
    @Transactional(readOnly = true)
    public Task findTask(Task task) {
    return taskDao.findById(task.getIdtarea()).orElse(null);
    }
    
}
