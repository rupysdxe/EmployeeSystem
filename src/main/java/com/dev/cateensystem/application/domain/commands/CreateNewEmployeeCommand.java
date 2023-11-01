package com.dev.cateensystem.application.domain.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Size;

/**
 * @author Rupesh Dangi
 * @date: 2023/11/01 11/45
 */

/**
 * This class is a command class which is used to create a new employee.
 * This is immutable class due to the fact that it has only getter methods and no setter methods.
 */
@Getter
@AllArgsConstructor
public class CreateNewEmployeeCommand
{
    @Size(min = 3, max = 100, message = "Full name must be between 3 and 100 characters long.")
    private final String fullName;
    @Size(min = 3, max = 100, message = "Department must be between 3 and 100 characters long.")
    private final String department;
    @Size(min = 3, max = 100, message = "Position must be between 3 and 100 characters long.")
    private final String position;
}
