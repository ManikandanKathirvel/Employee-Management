package com.mani.EmployeeMangagementProject.Service;

import com.mani.EmployeeMangagementProject.Entity.Employee;
import com.mani.EmployeeMangagementProject.Exception.IdNotFoundException;
import com.mani.EmployeeMangagementProject.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo repo;

    public Employee addEmp(Employee emp) throws Exception {
        if(emp.equals(null)) {
            throw new Exception("Employee is null");
        }
        else{
            return repo.save(emp);
        }
    }

    public Optional<Employee> getEmp(long id) throws IdNotFoundException {
        Optional<Employee> em=repo.findById(id);
        if(em.isEmpty()){
            throw new IdNotFoundException("Id Is Not Found");
        }
        else {
            return em;
        }
    }

    public Employee UpdateEmp(long id, Employee emp) throws IdNotFoundException {
        Optional<Employee> em=repo.findById(id);
        Employee e=em.get();
        if(em.isPresent()){
            e.setName(emp.getName());
            e.setAge(emp.getAge());
            e.setGender(emp.getGender());
            e.setDepartment(emp.getDepartment());
            e.setSalary(emp.getSalary());
            e.setYearOfJoining(emp.getYearOfJoining());
            return repo.save(e);
        }
        else {
            throw new IdNotFoundException("id not found");
        }
    }

    public String deleteEmp(long id) {
        repo.deleteById(id);
        return "Employee Deleted";
    }

    public List<Employee> getAllEmp() {
        return  repo.findAll();
    }
}
