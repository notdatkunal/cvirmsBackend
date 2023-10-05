package com.application.cvirms.controller;

import com.application.cvirms.dto.member.Hotel;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping
    public String test(){return "this is test";}

    @PostMapping
    public Hotel test(@RequestBody Hotel hotel){ return hotel;}

}
