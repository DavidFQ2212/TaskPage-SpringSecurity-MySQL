package com.web.PageTask.Service;
import java.util.List;

import com.web.PageTask.Dominio.Task;

public interface TaskService {
    public List<Task> AlltTask();
    public void SaveTask(Task task);
    public void DeleteTask(Task task);
    public Task findTask(Task task);

}
