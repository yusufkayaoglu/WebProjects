package com.enesbayram.spring_data_jpa.repository;

import com.enesbayram.spring_data_jpa.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {



}
