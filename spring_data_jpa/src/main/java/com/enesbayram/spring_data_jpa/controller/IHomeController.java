package com.enesbayram.spring_data_jpa.controller;

import com.enesbayram.spring_data_jpa.DTO.DtoHome;

public interface IHomeController {
    public DtoHome findHomeById(Long id);
}
