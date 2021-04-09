package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.department.entity.Department;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

    public List<Department> getDepartmentsByEmployeeId(Long employeeId);
}
