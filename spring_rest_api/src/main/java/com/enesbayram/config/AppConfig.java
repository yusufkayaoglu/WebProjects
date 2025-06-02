package com.enesbayram.config;

import com.enesbayram.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","Yusuf","Kayaoglu"));
        employeeList.add(new Employee("2","Ali","Kayaoglu"));
        employeeList.add(new Employee("3","Ercan","Kayaoglu"));
        return employeeList;
    }


}
