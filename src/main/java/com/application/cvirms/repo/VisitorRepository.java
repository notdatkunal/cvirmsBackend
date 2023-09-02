package com.application.cvirms.repo;

import com.application.cvirms.dto.member.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor,Integer> {
}
