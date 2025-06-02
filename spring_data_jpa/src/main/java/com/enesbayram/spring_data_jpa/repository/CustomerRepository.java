package com.enesbayram.spring_data_jpa.repository;

import com.enesbayram.spring_data_jpa.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
