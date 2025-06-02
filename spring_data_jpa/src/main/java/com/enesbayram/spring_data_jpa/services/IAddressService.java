package com.enesbayram.spring_data_jpa.services;

import com.enesbayram.spring_data_jpa.DTO.DtoAddress;

public interface IAddressService {
    public DtoAddress findAddressById(Long id);
}
