package com.application.cvirms.service;

import com.application.cvirms.dto.features.Emergency;
import com.application.cvirms.dto.features.Notice;
import com.application.cvirms.dto.member.*;
import com.application.cvirms.repo.*;
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
    public HotelEntryRepository entryRepository;
    @Autowired
    public VisitorRepository visitorRepository;
    @Autowired
    public HotelRepository memberRepository;

    public ResponseEntity addEntry(HotelEntry entry, Integer memberId){
        Hotel member = memberRepository.getReferenceById(memberId);
        visitorRepository.save(entry.getVisitor());
//        entry.setMember(member);
        List<HotelEntry> entries = member.getEntries();
        entries.add(entry);


        entryRepository.save(entry);

        memberRepository.save(member);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<List<HotelEntry>> getVisitorsByHotelId(Integer memberId) {


        Hotel member = (Hotel) memberRepository.getReferenceById(memberId);
        List<HotelEntry> entries = member.getEntries();

        return new ResponseEntity<>(entries,HttpStatus.FOUND);
    }
}
