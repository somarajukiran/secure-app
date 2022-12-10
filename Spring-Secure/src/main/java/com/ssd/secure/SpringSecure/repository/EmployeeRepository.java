package com.ssd.secure.SpringSecure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssd.secure.SpringSecure.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
