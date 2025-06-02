package com.enesbayram.spring_data_jpa.services.impl;

import com.enesbayram.spring_data_jpa.DTO.DtoAddress;
import com.enesbayram.spring_data_jpa.DTO.DtoCustomer;
import com.enesbayram.spring_data_jpa.entities.Address;
import com.enesbayram.spring_data_jpa.repository.AddressRepository;
import com.enesbayram.spring_data_jpa.services.IAddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;
@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public DtoAddress findAddressById(Long id) {
        DtoAddress dtoAddress = new DtoAddress();
        Optional<Address> optional = addressRepository.findById(id);

        if(optional.isEmpty()){
            return null;
        }
        Address address = optional.get();
        BeanUtils.copyProperties(address, dtoAddress);

        DtoCustomer dtoCustomer = new DtoCustomer();
        dtoCustomer.setId(address.getCustomer().getId());
        dtoCustomer.setName(address.getCustomer().getName());
       // dtoCustomer.setAddress(dtoAddress);

        dtoAddress.setCustomer(dtoCustomer);

        return dtoAddress;


    }
}
