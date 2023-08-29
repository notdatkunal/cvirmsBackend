package com.application.cvirms.service;

import com.application.cvirms.dto.features.Emergency;
import com.application.cvirms.dto.features.Notice;
import com.application.cvirms.dto.member.Visitor;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface MemberService {

    List<Visitor> getVisitors();

    ResponseEntity addVisitor(Visitor visitor);

    ResponseEntity<List<Notice>> getAllNotices();

    ResponseEntity<List<Emergency>> getEmergency(Emergency emergency);

    ResponseEntity<List<Emergency>> addEmergency(Integer memberId);

    List<Visitor> getVisitorsById(Integer memberId);
}
