package com.edu.vacineservice.Centers.data;

import com.edu.vacineservice.Applicant.data.Applicant;
import lombok.Data;

import javax.persistence.*;



@Data
@Entity

public class Center {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 45, nullable = false)
    private String centerName;
    @Column(length = 45, nullable = false)
    private String district;
    @Column(length = 45, nullable = false)
    private String state;
    private Long pincode;
    @Column(nullable = false)
    private Long numberOfVaccine ;



}
