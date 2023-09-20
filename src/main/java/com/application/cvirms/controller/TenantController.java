package com.application.cvirms.controller;

import com.application.cvirms.dto.features.Emergency;
//import com.application.cvirms.dto.member.TenantEntry;
import com.application.cvirms.service.TenantService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/member/{memberId}")
public class TenantController {


@Autowired
    public TenantService service;
//    @GetMapping
//    public ResponseEntity<List<TenantEntry>> getVisitors(@pathvariable(requred=true) Integer memberId){
//        return service.getVisitorByTenantId(memberId);
//    }
//    @PostMapping("/add")
//    public ResponseEntity addEntry(@RequestBody TenantEntry entry, @PathVariable Integer memberId){
//        return  service.addEntry(entry,memberId);
//    }
//    @GetMapping("/notices")
//    public  ResponseEntity<List<Notice>> getAllNotices()
//    {
//        return  service.getAllNotices();
//    }
//    @GetMapping("/emergency")
//    public  ResponseEntity<List<Emergency>> getEmergency(Emergency emergency){
//        return service.getEmergency(emergency);
//    }
//
//    @PostMapping("/emergency")
//    public ResponseEntity addEmergency(@PathVariable Integer memberId)
//    {
//        return service.addEmergency(memberId);
//    }

}
