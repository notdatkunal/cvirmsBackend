package com.application.cvirms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TenantController {

    @GetMapping("/tenant")
    public String dashboard(){return "this is tenant";}

}
