package com.klef.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.exam.entity.JobApplicant;

public interface JobApplicantRepository extends JpaRepository<JobApplicant, Integer> {

}
