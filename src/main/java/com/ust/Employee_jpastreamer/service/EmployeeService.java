package com.ust.Employee_jpastreamer.service;

import com.speedment.jpastreamer.application.JPAStreamer;
import com.ust.Employee_jpastreamer.model.Employee;
import com.ust.Employee_jpastreamer.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    @Autowired
    private JPAStreamer jpaStreamer;

    public Map<String, List<Employee>> groupByEmployeeByCity() {
        return jpaStreamer.stream(Employee.class)
                .collect(Collectors.groupingBy(Employee::getCity));
    }
}
