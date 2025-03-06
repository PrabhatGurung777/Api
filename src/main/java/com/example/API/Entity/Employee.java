package com.example.API.Entity;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    
    public Employee() {}

    
    public Employee(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
       
        List<Employee> employees = new ArrayList<>();

 
        employees.add(new Employee(1, "John", "Doe", "john.doe@example.com"));
        employees.add(new Employee(2, "Jane", "Smith", "jane.smith@example.com"));
        employees.add(new Employee(3, "Alice", "Johnson", "alice.johnson@example.com"));
        employees.add(new Employee(4, "Bob", "Brown", "bob.brown@example.com"));

       
    }
}
