package com.employeemgmnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemgmnt.entities.Company;

public interface EmployeeRepository extends JpaRepository<Company, Integer>{

}
