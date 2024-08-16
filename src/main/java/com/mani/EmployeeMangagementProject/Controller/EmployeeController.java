package com.mani.EmployeeMangagementProject.Controller;

import com.mani.EmployeeMangagementProject.Entity.Employee;
import com.mani.EmployeeMangagementProject.Exception.IdNotFoundException;
import com.mani.EmployeeMangagementProject.Service.EmployeeService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    EmployeeService serv;

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmp(@RequestBody  Employee emp) throws Exception {
        Employee emps=serv.addEmp(emp);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(emps);
    }
    @GetMapping("/getEmp/{id}")
    public ResponseEntity<Optional<Employee>> getEmp(@PathVariable long id) throws IdNotFoundException {
        Optional<Employee> emp = serv.getEmp(id);
        return ResponseEntity.status(HttpStatus.OK).body(emp);
    }

    @PutMapping("/puts/{id}")
            public ResponseEntity<Employee> updateEmp(@PathVariable long id,@RequestBody Employee emp) throws IdNotFoundException {
        Employee em=serv.UpdateEmp(id,emp);
        return ResponseEntity.status(HttpStatus.OK).body(em);
    }

    @DeleteMapping("/deli/{id}")
    public ResponseEntity<String> DeleteEmp(@PathVariable long id){
        serv.deleteEmp(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Employee Deleted");
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAllEmp(){
        List<Employee> emps=serv.getAllEmp();
        return ResponseEntity.status(HttpStatus.OK).body(emps);
    }
}
