package com.application.cvirms.repo;

import com.application.cvirms.dto.features.Flag;
import com.application.cvirms.dto.member.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {
}
