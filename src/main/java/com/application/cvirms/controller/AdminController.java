package com.application.cvirms.controller;

import com.application.cvirms.dto.member.Member;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/superAdmin")
public class AdminController {

    @PostMapping
    public void addHotel(@Validated @RequestBody Member hotelMember){

    }
}
