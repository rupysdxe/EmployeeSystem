package com.dev.employeesystem.application.domain.service;

import com.dev.employeesystem.application.domain.commands.CreateNewEmployeeCommand;
import com.dev.employeesystem.application.domain.model.Employee;
import com.dev.employeesystem.application.port.in.AddNewEmployeeUseCase;
import com.dev.employeesystem.application.port.out.PersistEmployee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

/**
 * @author Rupesh Dangi
 * @date: 2023/11/01 18/01
 */
@Service
@RequiredArgsConstructor
@Transactional
public class EmployeeCommandService implements AddNewEmployeeUseCase
{
    private final PersistEmployee persistEmployee;
    @Override
    public long addNewEmployee(@Validated CreateNewEmployeeCommand command)
    {
        Employee employee = new Employee(command.getFullName(), command.getDepartment(), command.getPosition());
        return persistEmployee.saveEmployee(employee);
    }
}
