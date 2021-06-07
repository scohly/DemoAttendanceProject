package com.example.demo.controller;

import com.example.demo.member.Member;
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

    //get mapping endpoint
    @GetMapping
    public List<Member> getMembers(){
        return List.of(
                new Member(1L, "Soami Cohly", "soami@soami.com","UID1989" , 31,
                        LocalDate.of(2021,Month.JUNE, 7))
        );
    }

}
