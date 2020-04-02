package com.example.demo;

import com.example.demo.dao.TeamDao;
import com.example.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewControllerCourse {
    @Autowired
    TeamDao teamDao;

    @RequestMapping("/equipos/{name}")
    public  Team  helloThere(@PathVariable String name){
        return teamDao.findByName(name);
    }

    /*@RequestMapping("/hi/{name}")
    public  String hiThere(Map model, @PathVariable String name){
        model.put("name",name);
        //Template que pinta de thymeleaf
        return "hello";
    }*/
}
