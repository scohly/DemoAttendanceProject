package com.example.demo.service;

import com.example.demo.dao.MemberRepository;
import com.example.demo.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {

    private final MemberRepository memberRepository;

    @Autowired
    public ServiceLayer(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public List<Member> getMembers(){
        return memberRepository.findAll();
    }

}
