package com.application.cvirms.controller;

import com.application.cvirms.CvirmsApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestartController {


    @GetMapping("/stop")
    public void stop() {
        CvirmsApplication.stop();
    }
}
