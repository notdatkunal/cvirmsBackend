package com.application.cvirms.repo;

import com.application.cvirms.dto.member.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends JpaRepository<Entry,Integer> {
}
