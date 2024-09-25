package org.ajs.em_project;

import java.util.List;

public interface EmployeeService {
    String createEmployee(Employee employee); // ------Create

    // List<Employee> readEmployees(Long id);

    boolean deleteEmployee(Long id);

    String updateEmployee(Long id, Employee employee);

    List<Employee> readEmployee(); // REad

    Employee readEmployee(Long id);

    List<Employee> readEmployees();

}
