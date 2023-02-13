package com.example.springboot_usingpagination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    //to save one product
    public Employee saveProduct(Employee item){

        return employeeRepo.save(item);
    }

    // to save List of products
    public List<Employee> saveProducts(List<Employee> items) {

        return employeeRepo.saveAll(items);
    }

    //get list of employee
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
    //get single employee
    public Employee getEmployeeById(long id) {
        return  employeeRepo.findById(id).orElse(null);
    }

    //updateemployee
//    public Employee updateEmployee(long id, String name, String dept) {
//        Employee employee = employeeRepo.findById(id).orElse(null);
//        if (employee == null) {
//            return null;
//        }
//        employee.setName(name);
//        employee.setDept(dept);
//        return employeeRepo.save(employee);
//    }
    //delete
    public void deleteEmployee(long id) {
        employeeRepo.deleteById(id);
    }
}
