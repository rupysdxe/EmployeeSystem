package com.dev.employeesystem.application.port.out;

import com.dev.employeesystem.application.domain.model.Employee;

/**
 * @author Rupesh Dangi
 * @date: 2023/11/01 18/00
 */
public interface PersistEmployee
{
    long saveEmployee(Employee employee);
}
