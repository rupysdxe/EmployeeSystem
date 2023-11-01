package com.dev.cateensystem.application.port.in;

import com.dev.cateensystem.application.domain.model.Employee;

/**
 * Use case for retrieving Employee entities.
 */
public interface EmployeeRetrievalUseCase {
    /**
     * Retrieves an Employee entity by its unique identifier.
     *
     * @param id The unique identifier of the employee.
     * @return The Employee entity if found, or null if not found.
     */
    Employee retrieveEmployeeById(long id);
}

