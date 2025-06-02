package com.enesbayram.spring_data_jpa.controller.impl;

import com.enesbayram.spring_data_jpa.DTO.DtoEmployee;
import com.enesbayram.spring_data_jpa.controller.IEmployeeController;
import com.enesbayram.spring_data_jpa.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/list")
    @Override
    public List<DtoEmployee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }
}
