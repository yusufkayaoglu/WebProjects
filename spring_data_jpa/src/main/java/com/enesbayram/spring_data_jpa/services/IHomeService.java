package com.enesbayram.spring_data_jpa.services;

import com.enesbayram.spring_data_jpa.DTO.DtoHome;

public interface IHomeService {
    public DtoHome findHomeById(Long id);

}
