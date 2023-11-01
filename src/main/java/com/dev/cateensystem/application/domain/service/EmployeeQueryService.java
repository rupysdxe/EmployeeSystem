package com.dev.cateensystem.application.domain.service;

import com.dev.cateensystem.application.domain.model.Employee;
import com.dev.cateensystem.application.port.in.EmployeeRetrievalUseCase;
import com.dev.cateensystem.application.port.out.FetchEmployeeById;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Rupesh Dangi
 * @date: 2023/11/01 18/12
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class EmployeeQueryService implements EmployeeRetrievalUseCase
{
    private final FetchEmployeeById fetchEmployeeById;
    /**
     * Retrieves an employee by its unique identifier.
     *
     * @param id The unique identifier of the employee.
     * @return The employee.
     */
    @Override
    public Employee retrieveEmployeeById(long id) {
        return fetchEmployeeById.getEmployeeById(id);
    }
}
