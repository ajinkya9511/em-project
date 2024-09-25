package org.ajs.em_project;

import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class EmpController {

    // List<Employee> employee = new ArrayList<>();
    @Autowired
    EmployeeService employeeService; // = new EmployeeServiceImpl();

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employeeService.readEmployees();
    }

    @GetMapping("employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.readEmployee(id);
    }

    @PostMapping("employees")
    public String postMethodName(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee); // (employee);
        // employees.add(employee);
        // ;
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        if (employeeService.deleteEmployee(id))
            ;
        return "Delete Succesfully";

    }

    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee employee) {

        return employeeService.updateEmployee(id, employee);

    }
}
