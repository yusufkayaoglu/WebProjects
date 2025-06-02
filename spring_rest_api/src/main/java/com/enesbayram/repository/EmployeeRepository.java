package com.enesbayram.repository;

import com.enesbayram.model.Employee;
import com.enesbayram.model.UpdateEmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;
    public List<Employee> getAllEmployeeList() {
        return employeeList;
    }

    public Employee getEmployeeById(String id) {
        Employee findEmployee = null;
        for (Employee employee : employeeList) {
            if(employee.equals(employee.getId())) {
                findEmployee = employee;
                break;
            }
        }
        return findEmployee;
    }


    public List<Employee> getEmployeeListWithParams(String firstName, String lastName) {
        List<Employee> employeeListWithParams = new ArrayList<>();
        if(firstName != null && lastName != null) {
            return employeeList;
        }

        for(Employee employee : employeeList) {
            if(firstName!=null && lastName!=null) {
                if(employee.getFirstName().equalsIgnoreCase(firstName) && employee.getLastName().equalsIgnoreCase(lastName)) {
                    employeeListWithParams.add(employee);
                }
            }
            if(firstName != null && lastName == null) {
                if(employee.getFirstName().equalsIgnoreCase(firstName)) {
                    employeeListWithParams.add(employee);
                }
            }

            if(firstName == null && lastName != null) {
                if(employee.getLastName().equalsIgnoreCase(lastName)) {
                    employeeListWithParams.add(employee);
                }

            }

        }




        return employeeListWithParams;
    }

    public Employee saveEmployee(Employee newEmployee) {
        employeeList.add(newEmployee);
        return newEmployee;
    }

    public boolean deleteEmployee(String id) {
        //DELETE FROM Employee WHERE id=:id
        Employee deleteEmployee = null;
        for(Employee employee : employeeList) {
            if(id.equals(employee.getId())) {
                deleteEmployee=employee;
                break;
            }
            employeeList.remove(deleteEmployee);
        }
        if(deleteEmployee == null) {
            return false;
        }

        employeeList.remove(deleteEmployee);
        return true;

    }

    private Employee findEmployeeById(String id) {
        Employee findEmployee = null;
        for(Employee employee : employeeList) {
            if(employee.getId().equals(id)) {
                return findEmployee=employee;
            }
        }
        return findEmployee;

    }

    public Employee updateEmployee(String id, UpdateEmployeeRequest request){
        Employee findEmployee = findEmployeeById(id);
        if(findEmployee != null) {
            deleteEmployee(id);
            Employee updatedEmployee = new Employee(id,request.getFirstName(),request.getLastName());
            /*updatedEmployee.setId(id);
            updatedEmployee.setFirstName(request.getFirstName());
            updatedEmployee.setLastName(request.getLastName());

             */

            employeeList.add(updatedEmployee);
            return updatedEmployee;
        }
        return null;
    }






}
