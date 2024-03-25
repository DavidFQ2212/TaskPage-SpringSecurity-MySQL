package com.web.PageTask.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControlador {


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
    public String TasksContainer(){
        return "TaskingContainer";
    }


    @GetMapping("/Assigment")
    public String Assigment(){
        return "Assigment";
    }

    
}
