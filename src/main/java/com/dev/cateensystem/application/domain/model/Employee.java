package com.dev.cateensystem.application.domain.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Rupesh Dangi
 * @date: 2023/11/01 11/41
 * This class is a model class which is used to create a new employee.
 */

@Getter
@Setter
public class Employee {
    private long id;
    private String fullName;
    private String department;
    private String position;

    public Employee(long id, String fullName, String department, String position) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
    }

    public Employee(String fullName, String department, String position) {
        this.fullName = fullName;
        this.department = department;
        this.position = position;
    }
}
