package com.ust.Employee_jpastreamer.repository;


import com.ust.Employee_jpastreamer.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo  extends MongoRepository<Employee,String> {
}
