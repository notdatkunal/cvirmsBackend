package com.application.cvirms.controller;

import com.application.cvirms.dto.member.Member;
import com.application.cvirms.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/")
public class LoginController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password){
        Member member = memberRepository.getByUserName(username);
        if(member==null){return new ResponseEntity<>("false", HttpStatus.OK);}
        Boolean verification = member.getPassword().equals(password);
        String verify = verification?member.getId().toString():verification.toString();
        return  ResponseEntity.ok(verify);
    }

    @PostMapping("register")
    public String register(){
        return "account created";
    }
    @GetMapping
    public String verify(){
        return "verification is completed";
    }
    @GetMapping("/home")
    public RedirectView redirect(){
        return new RedirectView("login.html");
    }
}
