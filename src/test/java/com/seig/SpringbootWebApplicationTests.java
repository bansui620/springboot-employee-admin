package com.seig;

import com.seig.mapper.DepartmentMapper;
import com.seig.mapper.EmployeeMapper;
import com.seig.pojo.Department;
import com.seig.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.Date;

@SpringBootTest
class SpringbootWebApplicationTests {

   @Autowired
    private DepartmentMapper departmentMapper;

   @Autowired
   private EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {

//        Collection<Department> departments = departmentMapper.departments();
//
//        for (Department department : departments) {
//            System.out.println(department);
//        }
//
//        Department department = departmentMapper.getDepartmentById(103);
//        System.out.println(department);

//        Collection<Employee> employees = employeeMapper.getAllEmployees();
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }

//        System.out.println(employeeMapper.getEmployeeByID(1001));

//        Employee employee = new Employee(1001, "伴随", "2002@qq.com", 1, new Department(101, "教学部"), new Date());
//        employeeMapper.updateEmployee(employee);

//        System.out.println(employeeMapper.getEmployeeByID(1001));
        Employee employee = new Employee(null, "小花花", "123@qq.com", 0, new Department(104, "运营部"), new Date());
        employeeMapper.addEmployee(employee);


    }

}
