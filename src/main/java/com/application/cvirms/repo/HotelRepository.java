package com.application.cvirms.repo;

import com.application.cvirms.dto.member.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
