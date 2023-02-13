package com.example.springboot_usingpagination;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
  //  Employee createEmployee(String name, String dept);
}
