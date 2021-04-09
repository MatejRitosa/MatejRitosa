package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.employee.service;

import java.util.List;

import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.employee.entity.Employee;


public interface EmployeeService {
    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Long employeeId);

    public void updateEmployee(Employee employee);
}