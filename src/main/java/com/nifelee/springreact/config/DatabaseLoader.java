package com.nifelee.springreact.config;

import com.nifelee.springreact.domain.Employee;
import com.nifelee.springreact.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DatabaseLoader implements CommandLineRunner {

  final EmployeeRepository employeeRepository;

  @Override
  public void run(String... args) throws Exception {
    Employee employee = Employee.builder()
        .firstName("HK")
        .lastName("Lee")
        .description("nifelee")
        .build();

    employeeRepository.save(employee);
  }

}
