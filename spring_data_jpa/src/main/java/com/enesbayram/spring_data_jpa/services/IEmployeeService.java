package com.enesbayram.spring_data_jpa.services;

import com.enesbayram.spring_data_jpa.DTO.DtoEmployee;
import com.enesbayram.spring_data_jpa.entities.Employee;
import com.enesbayram.spring_data_jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IEmployeeService {

    public List<DtoEmployee> findAllEmployees();

}
