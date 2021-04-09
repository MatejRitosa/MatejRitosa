package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.department.service.impl;

import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.department.entity.Department;
import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.department.repository.DepartmentRepository;
import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public void setDepartmentRepository(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> retrieveDepartments(Long departmentId) {
        List<Department> departments = departmentRepository.findAll();
        return departments;
    }

    public Department getDepartment(Long departmentId) {
        Optional<Department> optDep = departmentRepository.findById(departmentId);
        return optDep.get();
    }

    public void saveDepartment(Department department){
        departmentRepository.save(department);
    }

    public void deleteDepartment(Long departmentId){
        departmentRepository.deleteById(departmentId);
    }

    public void updateDepartment(Department department) {
        departmentRepository.save(department);
    }
}