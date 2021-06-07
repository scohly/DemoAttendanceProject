package com.example.demo.controller;

import com.example.demo.member.Member;
import com.example.demo.service.ServiceLayer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/member")
public class Controller {

    private final ServiceLayer service;

    public Controller(ServiceLayer service){
        this.service = service;
    }

    //get mapping endpoint
    @GetMapping
    public List<Member> getMembers(){
        return service.getMembers();

    }

}
