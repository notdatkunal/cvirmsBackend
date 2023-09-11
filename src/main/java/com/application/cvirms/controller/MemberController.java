package com.application.cvirms.controller;

import com.application.cvirms.dto.features.Emergency;
import com.application.cvirms.dto.features.Notice;
import com.application.cvirms.dto.member.Entry;
import com.application.cvirms.dto.member.HotelEntry;
import com.application.cvirms.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member/{memberId}")
public class MemberController {





    @Autowired
//    @Qualifier("tenantMemberService")
    public MemberService service;
    @GetMapping
    public ResponseEntity<List<HotelEntry>> getVisitors(@PathVariable(required = true) Integer memberId){
        return service.getVisitorsByHotelId(memberId);
    }

    @PostMapping("/add")
    public ResponseEntity addEntry(@RequestBody HotelEntry entry,@PathVariable Integer memberId){

        return service.addEntry(entry,memberId);

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




}
