package com.application.cvirms.controller;

import com.application.cvirms.dto.member.Hotel;
import com.application.cvirms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/superAdmin")
public class AdminController {
    @Autowired
    public AdminService service;


    @PostMapping("/hotel")
    public void addHotel(@RequestBody Hotel hotelMember){

        service.addHotel(hotelMember);
    }
}
