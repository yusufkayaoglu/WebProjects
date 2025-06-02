package com.enesbayram.spring_data_jpa.controller;

import com.enesbayram.spring_data_jpa.DTO.DtoAddress;

public interface IAddressController {
    public DtoAddress findAddressById(Long id);
}
