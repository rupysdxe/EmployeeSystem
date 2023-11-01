package com.dev.employeesystem.adapters.out.persistance;

import lombok.*;

import javax.persistence.*;

/**
 * @author Rupesh Dangi
 * @date: 2023/11/01 18/03
 * This class is a JPA entity class which is used to persist the employee data.
 */
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class EmployeeEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;
    private String department;
    private String position;

}
