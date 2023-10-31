package com.application.cvirms.repo;

import com.application.cvirms.dto.member.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
