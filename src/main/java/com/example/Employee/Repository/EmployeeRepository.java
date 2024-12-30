package com.example.Employee.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Employee.Model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}
