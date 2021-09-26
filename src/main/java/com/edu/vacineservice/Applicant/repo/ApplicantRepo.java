package com.edu.vacineservice.Applicant.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.edu.vacineservice.Applicant.data.Applicant;

@Repository
public interface ApplicantRepo extends JpaRepository<Applicant, Long> {

}
