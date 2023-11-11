package com.application.cvirms.controller;

import com.application.cvirms.dto.features.Emergency;
import com.application.cvirms.dto.features.Notice;

import com.application.cvirms.dto.member.Employee;
import com.application.cvirms.dto.member.Hotel;
import com.application.cvirms.dto.member.HotelEntry;
import com.application.cvirms.dto.member.Member;
import com.application.cvirms.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member/{memberId}")
public class MemberController {





    @Autowired
    public MemberService service;
    @GetMapping
    public ResponseEntity<List<HotelEntry>> getVisitorById(@PathVariable(required = true) Integer memberId){
        return service.getVisitorsByHotelId(memberId);
    }
    @GetMapping("/profile")
    public ResponseEntity<Hotel> getProfile(@PathVariable(required = true) Integer memberId){
        return service.getProfile(memberId);
    }
    @DeleteMapping
    public void deleteAllEntries(@PathVariable(required = true) Integer memberId){

        service.deleteEntries(memberId);

    }


    @PostMapping("/add")
    public ResponseEntity addEntry(@RequestBody HotelEntry entry,@PathVariable(name = "memberId") Integer memberId){

        return service.addEntry(entry,memberId);

    }
    @GetMapping("/type")
    public ResponseEntity<String> getMemberTypeById(@PathVariable(name = "memberId") Integer memberId){
        return service.getMemberTypeById(memberId);
    }
    @GetMapping("/notices")
    public ResponseEntity<List<Notice>> getAllNotices(){
        return service.getAllNotices();
    }

    @GetMapping("/emergency")
    public ResponseEntity<List<Emergency>> getEmergency(Emergency emergency){
        return service.getEmergency(emergency);
    }
    @PostMapping("/emergency")
    public ResponseEntity addEmergency(@PathVariable Integer memberId){
        return service.addEmergency(memberId);
    }

    @PostMapping("/employee")
    public void addEmployee(@PathVariable Integer memberId, @RequestBody Employee e){
        System.out.println(e);
        service.addEmployee(e,memberId);
    }
    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getEmployee(@PathVariable Integer memberId){

        return service.getEmployee(memberId);
    }
    
    @GetMapping("check/{entryId}")
    public ResponseEntity getEntryById(@PathVariable Integer memberId, @PathVariable Integer entryId){
        return service.getEntryById(entryId);
    }
    @PutMapping("check/{entryId}")
   public void check(@PathVariable Integer memberId, @PathVariable Integer entryId, @RequestParam(name = "in") String in,@RequestParam(name = "out") String out){


        System.out.println(in);
        System.out.println(out);
        System.out.println(entryId);
        System.out.println(memberId);
        service.check(memberId,entryId,in,out);
   }


}
