package com.application.cvirms.repo;

import com.application.cvirms.dto.features.Flag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlagRepository extends JpaRepository<Flag, Integer> {
}
