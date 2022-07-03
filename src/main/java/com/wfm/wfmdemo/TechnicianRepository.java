package com.wfm.wfmdemo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wfm.wfmdemo.Technician;

public interface TechnicianRepository extends JpaRepository<Technician, Long> {
  List<Technician> findByFirstName(String firstName);
}