package com.application.cvirms.repo;

import com.application.cvirms.dto.member.Entry;
import com.application.cvirms.dto.member.HotelEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelEntryRepository extends JpaRepository<HotelEntry,Integer> {
}
