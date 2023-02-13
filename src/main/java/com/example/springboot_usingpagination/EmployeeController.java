package com.example.springboot_usingpagination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    EmployeeService employeeService;

    //The @RequestMapping annotation maps this method to a REST endpoint that handles
    // GET requests to the URL /employee/listPageable.
    // The method takes a Pageable object as an argument, which is used to retrieve
    // a specific page of data from a larger data set.
    //
    //The method employeesPageable retrieves a page of Employee entities from the repository
    // by calling employeeRepo.findAll(pageable).
    // The returned Page object contains a subset of the Employee entities along with information
    // about the total number of entities, the size of each page, and the number
    // of pages in the data set. This allows the client to retrieve and
    // display the data in a paginated manner.


    //MAIN motive of pagination is it sorts the entire coloumn we need to mention
    // how many elements we need and sort according to
    //coloumn wise check attached screen shots
    @RequestMapping(value = "/listPageable", method = RequestMethod.GET)
    Page<Employee> employeesPageable(Pageable pageable) {
        return employeeRepo.findAll(pageable);
    }

    @PostMapping("/employee")
    public Employee addProduct(@RequestBody Employee item ){
        return employeeService.saveProduct(item);
    }
    @PostMapping("/listemployee")
    public List<Employee> addProducts(@RequestBody List<Employee> items ){
        return employeeService.saveProducts(items);
    }

    //get list of employee
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    //get by id
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable long id) {
        return employeeService.getEmployeeById(id);
    }
////update
//    @PutMapping("/{id}")
//    public Employee updateEmployee(@PathVariable long id, @RequestParam String name, @RequestParam String dept) {
//        return employeeService.updateEmployee(id, name, dept);
//    }
//delete
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employeeService.deleteEmployee(id);
    }

}


