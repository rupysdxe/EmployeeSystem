package com.dev.employeesystem.adapters.in.web;

import com.dev.employeesystem.application.domain.commands.CreateNewEmployeeCommand;
import com.dev.employeesystem.application.domain.service.EmployeeQueryService;
import com.dev.employeesystem.application.port.in.AddNewEmployeeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rupesh Dangi
 * @date: 2023/11/01 18/21
 */
@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class AddNewEmployeeController
{
    private final AddNewEmployeeUseCase addNewEmployeeUseCase;
    private final EmployeeQueryService employeeQueryService;

    @PostMapping
    public ResponseEntity<EmployeeDto> addNewEmployee(@RequestBody @Validated CreateNewEmployeeCommand command)
    {
        long id = addNewEmployeeUseCase.addNewEmployee(command);
        EmployeeDto employeeDto = EmployeeDto.fromEmployee(employeeQueryService.retrieveEmployeeById(id));
        return ResponseEntity.ok(employeeDto);
    }
}
