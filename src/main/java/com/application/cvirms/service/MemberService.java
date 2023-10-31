package com.application.cvirms.service;

import com.application.cvirms.dto.features.Emergency;
import com.application.cvirms.dto.features.Notice;
import com.application.cvirms.dto.member.*;
import com.application.cvirms.repo.*;
import com.application.cvirms.templates.HotelEntryTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class MemberService {

    List<Visitor> getVisitors(){return new ArrayList<>();}



    public ResponseEntity<List<Notice>> getAllNotices(){return new ResponseEntity(new ArrayList<Notice>(), HttpStatus.FOUND);}

    public ResponseEntity<List<Emergency>> getEmergency(Emergency emergency){return new ResponseEntity<>(HttpStatus.FOUND);}

    public ResponseEntity addEmergency(Integer memberId){return new ResponseEntity<>(HttpStatus.CREATED);}

    public List<Visitor> getVisitorsById(Integer memberId){return new ArrayList<>();}

    @Autowired
    public HotelEntryRepository entryRepository;
    @Autowired
    public VisitorRepository visitorRepository;
    @Autowired
    public MemberRepository memberRepository;
    @Autowired
    public DocumentRepository documentRepository;
    public ResponseEntity addEntry(HotelEntry entry, Integer memberId){
        Hotel member = (Hotel) memberRepository.getReferenceById(memberId);

        Document document = entry.getVisitor().getDocument();
        if(document!=null)
            documentRepository.save(document);
        entry.setMember(member);
        List<HotelEntry> entries = member.getEntries();
        entries.add(entry);


//        memberRepository.save(member);
        entryRepository.save(entry);
//        visitorRepository.save(entry.getVisitor());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<List<HotelEntry>> getVisitorsByHotelId(Integer memberId) {


        Hotel member = (Hotel) memberRepository.getReferenceById(memberId);
        List<HotelEntry> entries = member.getEntries();

        return new ResponseEntity<>(entries,HttpStatus.FOUND);
    }

    public ResponseEntity<String> getMemberTypeById(Integer memberId) {
        return new ResponseEntity<>(memberRepository.getReferenceById(memberId).getType().toString(),HttpStatus.OK);
    }
    @Autowired
    private EmployeeRepository emp;
    public void addEmployee(Employee e, Integer memberId) {
        emp.save(e);
        Hotel m = (Hotel) memberRepository.getReferenceById(memberId);
        m.getEmployees().add(e);
        memberRepository.save(m);
    }

    public ResponseEntity<List<Employee>> getEmployee(Integer memberId) {
        return ResponseEntity.ok(
                memberRepository.getReferenceById(memberId)
                .getEmployees());

    }

    public void check(Integer memberId, Integer entryId, String in, String out) {


        var member = (Hotel)memberRepository.findById(memberId).get();
        var lists = member.getEntries();
        var entry = lists.get(entryId);

        entry.setCheckIn(LocalDateTime.parse(in));
        entry.setCheckOut(LocalDateTime.parse(out));
        entryRepository.save(entry);
        memberRepository.save(member);
    }

    public void deleteEntries(Integer memberId) {
        var member = (Hotel)memberRepository.findById(memberId).get();
        for (var entry : member.getEntries()){

            entryRepository.delete(entry);

        }
        member.setEntries(new LinkedList<HotelEntry>());
        memberRepository.save(member);

    }

    public ResponseEntity getEntryById(Integer entryId) {

        var entryData = entryRepository.findById(entryId);
        try {
            var entry = entryData.get();
            HotelEntryTemplate temp =  HotelEntryTemplate.getInstance(entry);

            return ResponseEntity.ok(temp);

        }
        catch (Exception e){
            System.err.println("error occurred "+e);
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    private HotelMemberRepository   hotelMemberRepository;



    public List<Member> getAllMember() {

            return memberRepository.findAll();
        }
    }

