package com.application.cvirms.service;

import com.application.cvirms.dto.features.Emergency;
import com.application.cvirms.dto.features.Notice;
import com.application.cvirms.dto.member.Visitor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantMemberService implements MemberService{
    @Override
    public List<Visitor> getVisitors() {
        return null;
    }

    @Override
    public ResponseEntity addVisitor(Visitor visitor) {
        return null;
    }

    @Override
    public ResponseEntity<List<Notice>> getAllNotices() {
        return null;
    }

    @Override
    public ResponseEntity<List<Emergency>> getEmergency(Emergency emergency) {
        return null;
    }

    @Override
    public ResponseEntity<List<Emergency>> addEmergency(Integer memberId) {
        return null;
    }

    @Override
    public List<Visitor> getVisitorsById(Integer memberId) {
        return null;
    }
}
