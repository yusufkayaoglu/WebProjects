package com.enesbayram.spring_data_jpa.services.impl;

import com.enesbayram.spring_data_jpa.DTO.DtoDepartment;
import com.enesbayram.spring_data_jpa.DTO.DtoEmployee;
import com.enesbayram.spring_data_jpa.entities.Employee;
import com.enesbayram.spring_data_jpa.repository.EmployeeRepository;
import com.enesbayram.spring_data_jpa.services.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<DtoEmployee> findAllEmployees() {
        List<DtoEmployee> dtoEmployeeList = new ArrayList<>();
        List<Employee> employeeList = employeeRepository.findAll();

        if(employeeList!=null && !employeeList.isEmpty()){
            for (Employee employee : employeeList) {
                DtoEmployee dtoEmployee = new DtoEmployee();
                BeanUtils.copyProperties(employee, dtoEmployee);

                dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(),
                        employee.getDepartment().getDepartmentName()));

                dtoEmployeeList.add(dtoEmployee);
            }
        }

        return dtoEmployeeList;
    }
}
