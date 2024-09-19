package com.mani.employeeMangagementProject;

import com.mani.employeeMangagementProject.Repository.EmployeeRepo;
import com.mani.employeeMangagementProject.Service.EmployeeService;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaServiceTests {
    @Mock
    private EmployeeRepo repo;

    @InjectMocks
    private EmployeeService serv;

//    @Test
//    void addEmp() throws Exception {
//        Employee e = new Employee(1, "mani", 25, "male", "EEE", 2020, 25000.00, 10);
//        when(repo.save(e)).thenReturn(e);
//        Employee res = serv.addEmp(e);
//        assertEquals(e, res);
//    }
}
