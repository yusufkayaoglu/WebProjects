package com.enesbayram.controller;

import com.enesbayram.model.Employee;
import com.enesbayram.model.UpdateEmployeeRequest;
import com.enesbayram.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api ")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee-list")
    public List<Employee> getEmployeeList() {
        return employeeService.getAllEmployeeList();
    }


    //PathVariable : Postman'den gelen id ile buradaki id maplenir ve bu id String id değişkenine atanır!
    @GetMapping("/employee-list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id",required = true) String id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("employee-list-with-params")
    public List<Employee> getEmployeeListByParams(@RequestParam(name = "firstName",required = false) String firstName
    , @RequestParam(name = "lastName",required = false) String lastName) {
        return employeeService.getEmployeeListWithParams(firstName, lastName);

    }

    @PostMapping("/save-employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/delete-employee/{id}")
    public boolean deleteEmployee(@PathVariable(name = "id",required = true) String id) {
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/update-employee/{id}")
    public Employee updateEmployee(@PathVariable String id, @RequestBody UpdateEmployeeRequest  request) {
        return employeeService.updateEmployee(id, request);
    }





}
