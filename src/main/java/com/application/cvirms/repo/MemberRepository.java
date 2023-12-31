package com.application.cvirms.repo;

import com.application.cvirms.dto.member.Hotel;
import com.application.cvirms.dto.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Hotel, Integer> {
    Member getByUserName(String UserName);
}
