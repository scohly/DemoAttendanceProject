package com.example.demo.controller;

import com.example.demo.member.Member;
import com.example.demo.service.ServiceLayer;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void registerNewMember(@RequestBody Member member){
        service.addNewMember(member);
    }

    @DeleteMapping(path = "{memberId}")
    public void deleteMember(@PathVariable("memberId")Long memberId){
        service.deleteMember(memberId);
    }

    @PutMapping(path = "{memberId}")
    public void updateMember(
            @PathVariable("memberId") Long memberId,
            @PathVariable(required = false) String name,
            @PathVariable(required = false) String email){

        service.updateMember(memberId,name,email);
    }
    

}
