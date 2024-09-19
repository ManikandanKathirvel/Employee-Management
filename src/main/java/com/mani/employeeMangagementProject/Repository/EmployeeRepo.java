package com.mani.employeeMangagementProject.Repository;

import com.mani.employeeMangagementProject.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
