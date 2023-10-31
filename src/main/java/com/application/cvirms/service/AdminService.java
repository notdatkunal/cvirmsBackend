package com.application.cvirms.service;

import com.application.cvirms.dto.geography.Location;
import com.application.cvirms.dto.member.Hotel;
import com.application.cvirms.repo.DocumentRepository;
import com.application.cvirms.repo.HotelRepository;
import com.application.cvirms.repo.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AdminService {

    @Autowired
    public HotelRepository memberRepo;
    @Autowired
    public LocationRepository locationRepository;
    @Autowired
    public DocumentRepository documentrepo;

    public void addHotel(Hotel hotelMember) {
        System.out.println(hotelMember.getProfile());
//        locationRepository.save(hotelMember.getLocation());
        var location = hotelMember.getLocation();
        var ref = locationRepository.findById(location.getPincode());
        System.out.println("finding locations");
        if(ref.isPresent()){

            hotelMember.setLocation(ref.get());
            System.out.println("location already exists");

        }
        else{
            locationRepository.save(hotelMember.getLocation());
            System.out.println("does not exist");
        }

        memberRepo.save(hotelMember);
        if(hotelMember.getDocument()!= null)
        documentrepo.save(hotelMember.getDocument());
        HashMap m;


    }
}
