package com.klef.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.exam.entity.JobApplicant;
import com.klef.exam.service.JobApplicantService;

@RestController
@CrossOrigin("*")
@RequestMapping("/applicant")
public class JobApplicantController {

    @Autowired
    private JobApplicantService service;

    // Add Applicant
    @PostMapping("/add")
    public JobApplicant addApplicant(@RequestBody JobApplicant applicant) {
        return service.addApplicant(applicant);
    }

    // View All Applicants
    @GetMapping("/viewall")
    public List<JobApplicant> viewAll() {
        return service.viewAll();
    }

    // Search Applicant by ID
    @GetMapping("/search/{id}")
    public JobApplicant searchById(@PathVariable int id) {
        return service.getById(id)
                      .orElse(null);
    }
}
