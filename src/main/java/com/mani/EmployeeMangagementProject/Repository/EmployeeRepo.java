package com.mani.EmployeeMangagementProject.Repository;

import com.mani.EmployeeMangagementProject.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
