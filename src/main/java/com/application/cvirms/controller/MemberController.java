package com.application.cvirms.controller;

import com.application.cvirms.dto.features.Emergency;
import com.application.cvirms.dto.features.Notice;
import com.application.cvirms.dto.member.Visitor;
import com.application.cvirms.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

//    @GetMapping
//    public Guest dashboard(){
//        return new Guest();
//    }



    @Autowired
    @Qualifier("tenantMemberService")
    public MemberService service;
    @GetMapping
    public List<Visitor> getVisitors(@PathVariable(required = true) Integer memberId){
        return service.getVisitorsById(memberId);
    }

    @PostMapping("/add")
    public ResponseEntity addVisitor(@Validated Visitor visitor){
        return service.addVisitor(visitor);
    }
    @GetMapping("/notices")
    public ResponseEntity<List<Notice>> getAllNotices(){
        return service.getAllNotices();
    }

    @GetMapping("/emergency")
    public ResponseEntity<List<Emergency>> getEmergency(Emergency emergency){
        return service.getEmergency(emergency);
    }
    @PostMapping("/emergency/{memberId}")
    public ResponseEntity addEmergency(@PathVariable Integer memberId){
        return service.addEmergency(memberId);
    }




}
