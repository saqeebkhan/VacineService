package com.edu.vacineservice.Centers.controller;

import com.edu.vacineservice.Centers.data.Center;
import com.edu.vacineservice.Centers.repo.CenterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/center")
public class CentersController {
    @Autowired
    private CenterRepo centerRepo;
    private long id;


    @PostMapping
    public Center saveCenters(@RequestBody Center center){
        return centerRepo.save(center);
    }

    @GetMapping
    public List<Center> getCenters(){
        return centerRepo.findAll();
    }

    @GetMapping("/{id}")
    public Center getCentersById(@PathVariable Long id){
        return centerRepo.findById(id).get();
    }

    @PutMapping
//    public Applicant updateApplicant(@RequestBody  Applicant applicant){
//        applicantRepo.save(applicant);
//        return applicantRepo.findById(id).get();
//
//    }

    public String updateCenter(@RequestBody Center center){
        centerRepo.save(center);
        return "center details update sucessfully ";
    }

    @DeleteMapping("/{id}")
    public long deleteApplicant(@PathVariable Long id) {
        centerRepo.deleteById(id);
        return +id;
    }

}
