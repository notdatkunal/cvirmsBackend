package com.application.cvirms.repo;

import com.application.cvirms.dto.member.AccountType;
import com.application.cvirms.dto.member.Hotel;
import com.application.cvirms.dto.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
