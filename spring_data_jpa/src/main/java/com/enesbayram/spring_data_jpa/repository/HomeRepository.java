package com.enesbayram.spring_data_jpa.repository;

import com.enesbayram.spring_data_jpa.entities.Home;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Home, Long> {
}
