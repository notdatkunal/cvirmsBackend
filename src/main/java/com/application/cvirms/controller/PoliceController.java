package com.application.cvirms.controller;

import com.application.cvirms.dto.features.Flag;
import com.application.cvirms.service.PoliceService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class PoliceController {


    @Autowired
    private PoliceService service;

    @PostMapping("/flag")
    public void addFlag(@Validated @RequestBody Flag flag){
        service.addFlag(flag);

    }
    @GetMapping("/flag")
    public List<Flag> getFlags(){
        return service.showFlags();
    }
}
