package com.enesbayram.spring_data_jpa.controller;

import com.enesbayram.spring_data_jpa.DTO.DtoCustomer;

public interface ICustomerController {
    DtoCustomer findCustomerById(Long id);
}
