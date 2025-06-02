package com.enesbayram.spring_data_jpa.services.impl;

import com.enesbayram.spring_data_jpa.DTO.DtoAddress;
import com.enesbayram.spring_data_jpa.DTO.DtoCustomer;
import com.enesbayram.spring_data_jpa.entities.Address;
import com.enesbayram.spring_data_jpa.entities.Customer;
import com.enesbayram.spring_data_jpa.repository.CustomerRepository;
import com.enesbayram.spring_data_jpa.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    DtoCustomer dtoCustomer = new DtoCustomer();

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public DtoCustomer findCustomerById(Long id) {
        DtoCustomer dtoCustomer = new DtoCustomer();
        DtoAddress dtoAddress = new DtoAddress();
        Optional<Customer>optional =  customerRepository.findById(id);

        if(optional.isEmpty()) {
            return null;
        }

        Customer customer=optional.get();
        Address address=customer.getAddress();

        BeanUtils.copyProperties(customer, dtoCustomer);
        BeanUtils.copyProperties(address, dtoAddress);

        dtoCustomer.setAddress(dtoAddress);
        return dtoCustomer;
    }
}
