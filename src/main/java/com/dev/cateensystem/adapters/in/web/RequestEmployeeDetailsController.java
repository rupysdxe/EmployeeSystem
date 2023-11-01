package com.dev.cateensystem.adapters.in.web;

import com.dev.cateensystem.application.domain.service.EmployeeQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rupesh Dangi
 * @date: 2023/11/01 18/18
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employees")
public class RequestEmployeeDetailsController
{
    private final EmployeeQueryService employeeQueryService;

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeDetails(@PathVariable long id)
    {
        EmployeeDto employeeDto = EmployeeDto.fromEmployee(employeeQueryService.retrieveEmployeeById(id));
        return ResponseEntity.ok(employeeDto);
    }
}
