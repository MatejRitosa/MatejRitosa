package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.loader;

import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.entity.Employee;
import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.repository.EmployeeRepository;
import org.springframework.aop.IntroductionAwareMethodMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Component
public class DataLoader implements ApplicationRunner {

    private EmployeeRepository employeeRepository;
    @Autowired
    public DataLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void run(ApplicationArguments args) {

        employeeRepository.save(new Employee("Mark",1000,"Developer"));

    }
}
