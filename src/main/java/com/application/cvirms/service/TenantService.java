package com.application.cvirms.service;

import com.application.cvirms.dto.member.Visitor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TenantService {

    List<Visitor> getVisitors(){
        return new ArrayList<>();
    }


}
