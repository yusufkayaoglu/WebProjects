package com.enesbayram.spring_data_jpa.services;

import com.enesbayram.spring_data_jpa.DTO.DtoCustomer;

public interface ICustomerService {
    public DtoCustomer findCustomerById(Long id);


}
