package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.department.controller;

import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.department.entity.Department;
import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentRestController {

    @Autowired
    private DepartmentService departmentService;

    public void setEmployeeService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/api/employees/{employeeId}/departments")
    public List<Department> getDepartments(@PathVariable(name="departmentId")Long departmentId) {
        List<Department> departments = departmentService.retrieveDepartments(departmentId);
        return departments;
    }

    @GetMapping("/api/employees/{employeeId}/departments/{departmentId}")
    public Department getDepartment(@PathVariable(name="departmentId")Long departmentId) {

        return departmentService.getDepartment(departmentId);
    }


    @PostMapping("/api/employees/{employeeId}/departments")
    public void saveDepartment(Department department){
        departmentService.saveDepartment(department);
        System.out.println("Department Saved Successfully");
    }

    @DeleteMapping("/api/employees/{employeeId}/departments/{departmentId}")
    public void deleteDepartment(@PathVariable(name="departmentId")Long departmentId){
        departmentService.deleteDepartment(departmentId);
        System.out.println("Department Deleted Successfully");
    }

    @PutMapping("/api/employees/{employeeId}/departments/{departmentId}")
    public void updateDepartment(@RequestBody Department department,
                               @PathVariable(name="departmentId")Long departmentId){
        Department dep = departmentService.getDepartment(departmentId);
        if(dep != null){
            departmentService.updateDepartment(department);
        }

    }

}