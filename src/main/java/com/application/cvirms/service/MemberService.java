package com.application.cvirms.service;

import com.application.cvirms.dto.features.Emergency;
import com.application.cvirms.dto.features.Notice;
import com.application.cvirms.dto.member.Entry;
import com.application.cvirms.dto.member.HotelEntry;
import com.application.cvirms.dto.member.Member;
import com.application.cvirms.dto.member.Visitor;
import com.application.cvirms.repo.EntryRepository;
import com.application.cvirms.repo.MemberRepository;
import com.application.cvirms.repo.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    List<Visitor> getVisitors(){return new ArrayList<>();}



    public ResponseEntity<List<Notice>> getAllNotices(){return new ResponseEntity(new ArrayList<Notice>(), HttpStatus.FOUND);}

    public ResponseEntity<List<Emergency>> getEmergency(Emergency emergency){return new ResponseEntity<>(HttpStatus.FOUND);}

    public ResponseEntity<List<Emergency>> addEmergency(Integer memberId){return new ResponseEntity<>(HttpStatus.FOUND);}

    public List<Visitor> getVisitorsById(Integer memberId){return new ArrayList<>();}

    @Autowired
    public EntryRepository entryRepository;
    @Autowired
    public VisitorRepository visitorRepository;
    @Autowired
    public MemberRepository memberRepository;

    public ResponseEntity addEntry(HotelEntry entry, Integer memberId){
        var member = memberRepository.getReferenceById(memberId);
        entry.setMember(member);
        var entries = member.getEntries();
        entries.add(entry);

        entryRepository.save(entry);
        memberRepository.save(member);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<List<Entry>> getVisitorsByHotelId(Integer memberId) {


        Member member = memberRepository.getReferenceById(memberId);

        return new ResponseEntity<>(member.getEntries(),HttpStatus.FOUND);
    }
}
