package com.application.cvirms.service;

import com.application.cvirms.dto.member.Member;
import com.application.cvirms.repo.LocationRepository;
import com.application.cvirms.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    public MemberRepository memberRepo;
    @Autowired
    public LocationRepository locationRepository;
    public void addHotel(Member hotelMember) {
        locationRepository.save(hotelMember.getLocation());
        memberRepo.save(hotelMember);
    }
}
