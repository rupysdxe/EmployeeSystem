package com.dev.cateensystem.application.port.in;

import com.dev.cateensystem.application.domain.commands.CreateNewEmployeeCommand;

/**
 * @author Rupesh Dangi
 * @date: 2023/11/01 11/44
 */
/**
 * This interface defines the use case for adding a new employee.
 */
public interface AddNewEmployeeUseCase {
    /**
     * Adds a new employee based on the provided command.
     *
     * @param command The command containing employee data.
     * @return The unique identifier of the newly added employee.
     */
    long addNewEmployee(CreateNewEmployeeCommand command);
}

