package com.employeemgmnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemgmnt.entities.Employee;

public interface CompanyRepository extends JpaRepository<Employee, Integer> {

}
