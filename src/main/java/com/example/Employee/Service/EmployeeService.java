package com.example.Employee.Service;

import java.util.List;

import com.example.Employee.Model.Employee;

public interface EmployeeService {

    Employee createEmployee(Employee employee);
    Employee getEmployeeById(long id);
    List<Employee> getAllEmployees();
    void deleteEmployee(long id);
    Employee updateEmployee(long id, Employee employee);

}
