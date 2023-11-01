package com.dev.employeesystem.application.port.out;

import com.dev.employeesystem.application.domain.model.Employee;

/**
 * @author Rupesh Dangi
 * @date: 2023/11/01 18/13
 */

/**
 * This interface is used to fetch an employee by its unique identifier.
 */
public interface FetchEmployeeById
{
    /**
     * Retrieves an employee by its unique identifier.
     *
     * @param id The unique identifier of the employee.
     * @return The employee.
     */
    Employee getEmployeeById(long id);
}
