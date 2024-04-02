package com.web.PageTask.Controller;

import com.web.PageTask.Dominio.Task;
import com.web.PageTask.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeControlador {
    @Autowired
    private TaskService taskS;
    @GetMapping("/")
    public String HomePath(){
        return "HomePage";
    }


    @GetMapping("/Session")
    public String SessionPath(){
        return "Sesion";
    }


    @GetMapping("/TaskDetails")
    public String TaskDetails(){
        return "TaskPage";
    }


    @GetMapping("/Tasks")
    public String TasksContainer(Task task ,Model model){
        var tasks = taskS.AlltTask();
        model.addAttribute("tasks", tasks);
        return "TaskingContainer";
    }
    
    @GetMapping("/Assigment")
    public String Assigment(Task task){
        
        return "Assigment";
    }
    
  @PostMapping("/SaveTask")
    public String guardar(Task task ) {
        taskS.SaveTask(task);
        return "redirect:/Tasks";
    }

    @GetMapping("/EditTask/{idtarea}")
    public String editar(Task task, Model model) {
        task = taskS.findTask(task);
        model.addAttribute("tasks", task);
        return "TaskPage";
    }

    @GetMapping("/DeleteTask/{idtarea}")
    public String elimina(Task task) {
        taskS.DeleteTask(task);
        return "redirect:/Tasks";

    }
    
}
