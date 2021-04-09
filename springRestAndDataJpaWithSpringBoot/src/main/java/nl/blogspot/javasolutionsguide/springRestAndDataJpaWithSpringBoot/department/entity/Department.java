package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.department.entity;

import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.employee.entity.Employee;

import javax.persistence.*;


@Entity
@Table(name="DEPARTMENT")
public class Department {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="DEPARTMENT_NAME")
    private String name;

    @Column(name="DEPARTMENT")
    private String department;

    @ManyToOne
    private Employee employee;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}