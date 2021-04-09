package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.department.service;

import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.department.entity.Department;

import java.util.List;


public interface DepartmentService {
    public List<Department> retrieveDepartments(Long departmentId);

    public Department getDepartment(Long departmentId);

    public void saveDepartment(Department department);

    public void deleteDepartment(Long departmentId);

    public void updateDepartment(Department department);
}