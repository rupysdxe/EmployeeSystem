package com.dev.employeesystem.adapters.in.web;

import com.dev.employeesystem.application.domain.model.Employee;
import lombok.Getter;

/**
 * @author Rupesh Dangi
 * @date: 2023/11/01 18/19
 */
/**
 * This class is a DTO class which is used to transfer data from one layer to another layer.
 */
@Getter
public class EmployeeDto
{
    private  long id;
    private String fullName;
    private  String department;
    private String position;

    public EmployeeDto(long id, String fullName, String department, String position) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
    }

    private EmployeeDto(){}

    public static EmployeeDto fromEmployee(Employee employee)
    {
        return new EmployeeDto(employee.getId(), employee.getFullName(), employee.getDepartment(), employee.getPosition());
    }

}
