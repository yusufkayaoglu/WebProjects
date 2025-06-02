package com.enesbayram.spring_data_jpa.controller.impl;

import com.enesbayram.spring_data_jpa.DTO.DtoAddress;
import com.enesbayram.spring_data_jpa.controller.IAddressController;
import com.enesbayram.spring_data_jpa.services.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/address")
public class AddressControllerImpl implements IAddressController {

    @Autowired
    private IAddressService addressService;

    @GetMapping("/list/{id}")
    @Override
    public DtoAddress findAddressById(@PathVariable(name = "id") Long id) {
        return addressService.findAddressById(id);
    }
}
