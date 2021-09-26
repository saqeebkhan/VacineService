package com.edu.vacineservice.Applicant.controller;

import com.edu.vacineservice.Applicant.data.Applicant;
import com.edu.vacineservice.Applicant.repo.ApplicantRepo;
import com.edu.vacineservice.Applicant.service.ApplicantService;
import com.edu.vacineservice.Centers.data.Center;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applicant")
public class ApplicantController {
    @Autowired private ApplicantService applicantService;

    private long id;

    @PostMapping
    public List<Center> saveApplication(@RequestBody Applicant applicant){
        return applicantService.getAllCenters(applicant);
    }

    @GetMapping
    public List<Applicant> getApplicants(){
        return applicantService.findAll();
    }

    @GetMapping("/{id}")
    public List<Applicant> getApplicantById(@PathVariable Long id){
        return applicantService.findById(id).get();
    }

//    @PutMapping
//    public Applicant updateApplicant(@RequestBody  Applicant applicant){
//        applicantRepo.save(applicant);
//        return applicantRepo.findById(id).get();
//
//    }

//    public String updateApplicant1(@RequestBody Applicant applicant){
//        applicantRepo.save(applicant);
//        return "Applicant details update sucessfully ";
//    }
//
//    @DeleteMapping("/{id}")
//    public long deleteApplicant(@PathVariable Long id) {
//        applicantRepo.deleteById(id);
//        return +id;
//    }



}
