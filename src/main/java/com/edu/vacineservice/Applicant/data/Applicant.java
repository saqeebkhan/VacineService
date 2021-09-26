package com.edu.vacineservice.Applicant.data;

import com.edu.vacineservice.Centers.data.Center;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Data
@Entity
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;
    private String mobileNum;
    @Column(unique = true)
    private Long aadharNum;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "center_id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Center center;


}
