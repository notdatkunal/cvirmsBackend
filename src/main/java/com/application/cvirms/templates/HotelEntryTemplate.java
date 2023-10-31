package com.application.cvirms.templates;

import com.application.cvirms.dto.geography.Location;
import com.application.cvirms.dto.member.Document;
import com.application.cvirms.dto.member.Guest;
import com.application.cvirms.dto.member.Hotel;
import com.application.cvirms.dto.member.HotelEntry;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Data
public class HotelEntryTemplate {
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private Long contact;
    private String address;
    private Integer pincode;
    private Document document;
    private String vehicleNumber;
    private Hotel member;


//    private HotelEntry entry;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private List<Guest> guests;
    private List<String> remark;

        public static HotelEntryTemplate getInstance(HotelEntry entry){
            var instance = new HotelEntryTemplate();
            var member = entry.getMember();
//            member.setEntries(new LinkedList<>());
//            instance.setMember(member);
            instance.setFirstName(entry.getVisitor().getFirstName());
            instance.setMiddleName(entry.getVisitor().getMiddleName());
            instance.setLastName(entry.getVisitor().getLastName());
            instance.setGender(entry.getVisitor().getGender());
            instance.setContact(entry.getVisitor().getContact());
            instance.setAddress(entry.getVisitor().getAddress());
            if(null!=entry.getVisitor().getLocation())
            instance.setPincode(entry.getVisitor().getLocation().getPincode());
            instance.setDocument(entry.getVisitor().getDocument());
            instance.setVehicleNumber(entry.getVisitor().getVehicleNumber());
            instance.setCheckIn(entry.getCheckIn());
            instance.setCheckOut(entry.getCheckOut());
            instance.setGuests(entry.getGuests());
            instance.setRemark(entry.getRemark());


            return instance;

        }


}
