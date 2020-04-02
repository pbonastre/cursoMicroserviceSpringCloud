package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class NewControllerCourse {

    @RequestMapping("/hi/{name}")
    public  String hiThere(Map model, @PathVariable String name){
        model.put("name",name);
        //Template que pinta de thymeleaf
        return "hello";
    }

}
