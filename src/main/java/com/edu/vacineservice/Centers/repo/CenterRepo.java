package com.edu.vacineservice.Centers.repo;

import com.edu.vacineservice.Centers.data.Center;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepo extends JpaRepository<Center,Long> {

}
