package com.example.API.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.API.Entity.Employee;

@RestController


public class APIController {
	
	 @GetMapping("/currentdateandtime")
	    public String getCurrentDateTime() {
	        return "Current Date and Time: " + LocalDateTime.now();
	    }
	 
	 @GetMapping("/employee")
	    public List<Employee> getEmployees() {
	        
	        List<Employee> employees = new ArrayList<>();

	      
	        employees.add(new Employee(1, "John", "Doe", "john.doe@example.com"));
	        employees.add(new Employee(2, "Jane", "Smith", "jane.smith@example.com"));
	        employees.add(new Employee(3, "Alice", "Johnson", "alice.johnson@example.com"));
	        employees.add(new Employee(4, "Bob", "Brown", "bob.brown@example.com"));

	        
	        return employees;
	    }
	 
	

	    @PostMapping("/employee")
	    public String createEmployee() {
	        return "Employee created";
	    }

	    @PutMapping("/employee")
	    public String updateEmployee() {
	        return "Employee updated";
	    }

	    @DeleteMapping("/employee")
	    public String deleteEmployee() {
	        return "Employee deleted";
	    }


}
 