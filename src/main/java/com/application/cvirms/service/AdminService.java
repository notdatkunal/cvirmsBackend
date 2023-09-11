package com.application.cvirms.service;

import com.application.cvirms.dto.member.Hotel;
import com.application.cvirms.dto.member.Member;
import com.application.cvirms.repo.HotelRepository;
import com.application.cvirms.repo.LocationRepository;
import com.application.cvirms.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    public HotelRepository memberRepo;
    @Autowired
    public LocationRepository locationRepository;
    public void addHotel(Hotel hotelMember) {
        locationRepository.save(hotelMember.getLocation());
        memberRepo.save(hotelMember);
    }
}
