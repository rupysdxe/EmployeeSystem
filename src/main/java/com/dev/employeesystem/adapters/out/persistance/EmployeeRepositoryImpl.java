package com.dev.employeesystem.adapters.out.persistance;

import com.dev.employeesystem.application.domain.model.Employee;
import com.dev.employeesystem.application.port.out.FetchEmployeeById;
import com.dev.employeesystem.application.port.out.PersistEmployee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Rupesh Dangi
 * @date: 2023/11/01 18/05
 * This class is used to persist the employee data into the database.
 */
@Service
@RequiredArgsConstructor
public class EmployeeRepositoryImpl implements PersistEmployee, FetchEmployeeById
{
    private final EmployeeJPARepository employeeJPARepository;
    /**
     * This method is used to save the employee data into the database.
     * @param employee This is the first parameter to saveEmployee method which is of Employee type.
     * @return long This returns the id of the employee.
     */
    @Override
    public long saveEmployee(Employee employee)
    {
        EmployeeEntity entity = EmployeeEntity.builder()
                .fullName(employee.getFullName())
                .position(employee.getPosition())
                .department(employee.getDepartment())
                .build();
        return employeeJPARepository.save(entity).getId();
    }

    /**
     * This method is used to retrieve the employee data from the database.
     * @param id The unique identifier of the employee.
     * @return The employee.
     */
    @Override
    public Employee getEmployeeById(long id)
    {
        EmployeeEntity entity = employeeJPARepository.findById(id).orElseThrow(
                () -> new RuntimeException("Employee not found with id: " + id)
        );
        return new Employee(entity.getId(), entity.getFullName(), entity.getDepartment(), entity.getPosition());
    }
}
