package com.edu.vacineservice.Applicant.service;

import com.edu.vacineservice.Applicant.data.Applicant;
import com.edu.vacineservice.Applicant.repo.ApplicantRepo;
import com.edu.vacineservice.Centers.data.Center;
import com.edu.vacineservice.Centers.repo.CenterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {
    @Autowired private ApplicantRepo applicantRepo;
    @Autowired private CenterRepo centerRepo;

    public List<Center> getAllCenters(Applicant applicant){
        applicantRepo.save(applicant);
        return centerRepo.findAll();
    }

    public List<Applicant> findAll() {
        return applicantRepo.findAll();
    }


    public List<Applicant> findById(Long id) {
        return applicantRepo.findById(id);
    }
}
