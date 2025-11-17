package com.klef.exam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.exam.entity.JobApplicant;
import com.klef.exam.repository.JobApplicantRepository;

@Service
public class JobApplicantService {

    @Autowired
    private JobApplicantRepository repo;

    public JobApplicant addApplicant(JobApplicant applicant) {
        return repo.save(applicant);
    }

    public List<JobApplicant> viewAll() {
        return repo.findAll();
    }

    public Optional<JobApplicant> getById(int id) {
        return repo.findById(id);
    }
}
