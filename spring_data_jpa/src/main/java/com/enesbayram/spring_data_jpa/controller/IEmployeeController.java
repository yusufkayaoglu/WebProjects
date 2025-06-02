package com.enesbayram.spring_data_jpa.controller;

import com.enesbayram.spring_data_jpa.DTO.DtoEmployee;

import java.util.List;

public interface IEmployeeController {
    public List<DtoEmployee> findAllEmployees();

}
