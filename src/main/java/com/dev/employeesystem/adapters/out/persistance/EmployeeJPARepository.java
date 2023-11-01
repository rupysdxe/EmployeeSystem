package com.dev.employeesystem.adapters.out.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rupesh Dangi
 * @date: 2023/11/01 18/04
 * This interface is used to persist the employee data into the database.
 */
@Repository
public interface EmployeeJPARepository extends JpaRepository<EmployeeEntity,Long>
{
}
