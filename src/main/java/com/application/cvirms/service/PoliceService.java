package com.application.cvirms.service;

import com.application.cvirms.dto.features.Flag;
import com.application.cvirms.dto.member.AccountType;
import com.application.cvirms.dto.member.Hotel;
import com.application.cvirms.dto.member.HotelEntry;
import com.application.cvirms.dto.member.Member;
import com.application.cvirms.repo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@Service
@RequiredArgsConstructor
public class PoliceService {

    @Autowired
    private FlagRepository flagRepository;
    @Autowired
    private DocumentRepository documentRepository;


    @Autowired
    private  MemberRepository memberRepository;

    public void addFlag(Flag flag) {

        documentRepository.save(flag.getDocument());
        flagRepository.save(flag);
    }

    public List<Flag> showFlags() {

      return flagRepository.findAll();
    }

    public ResponseEntity getHotels() {

        List<Hotel> members = memberRepository.findAll();
        List<Hotel> hotels = new LinkedList<Hotel>();
        Consumer<Member> consumer = member->{
            if("HOTEL".equals(((Hotel)member).getType().toString())){

                hotels.add((Hotel)member);
            }

        };
        members.forEach(consumer);

        return ResponseEntity.ok(hotels);
    }


    public ResponseEntity getTenants() {
        List<Hotel> members = memberRepository.findAll();
        List<Hotel> tenants = new LinkedList<Hotel>();
        Consumer<Member> consumer = member->{
            if("TENANT".equals(((Hotel)member).getType().toString())){
                tenants.add((Hotel)member);

            }

        };
        members.forEach(consumer);

        return ResponseEntity.ok(tenants);
    }
}
