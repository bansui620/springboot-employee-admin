package com.seig.controller;

import com.seig.dao.DepartmentDAO;
import com.seig.dao.EmployeeDAO;
import com.seig.mapper.DepartmentMapper;
import com.seig.mapper.EmployeeMapper;
import com.seig.pojo.Department;
import com.seig.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Collection;


@Controller
public class UserController {


    @PostMapping("user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session) {
        //具体的业务(还没做数据库校验)
        if (!StringUtils.isEmpty(username) && "123".equals(password)) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        } else {
            //告诉用户，你登录失败了！
            model.addAttribute("msg", "用户名或密码错误！");
            return "index";
        }
    }

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private DepartmentMapper departmentMapper;

    @RequestMapping("/emps")
    public String empList(Model model) {
        Collection<Employee> employees = employeeMapper.getAllEmployees();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model) {
        Collection<Department> departments = departmentMapper.departments();
        model.addAttribute("departments", departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String add(Employee employee) {
        System.out.println("add=>" + employee);
        employeeMapper.addEmployee(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toUpdatePage(@PathVariable("id") Integer id, Model model) {
        //查询指定id的员工,添加到empById中,用于前端接收
        Employee empById = employeeMapper.getEmployeeByID(id);
        model.addAttribute("empById", empById);
        //查出所有的部门信息,添加到departments中,用于前端接收
        Collection<Department> departments = departmentMapper.departments();
        model.addAttribute("departments", departments);
        return "emp/update";
    }

    @PostMapping("/updateEmp")
    public String update(Employee employee) {
        System.out.println("update=>" + employee);
        employeeMapper.updateEmployee(employee);
        return "redirect:/emps";
    }

    @GetMapping("/delemp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id) {
        employeeMapper.deleteEmployeeByID(id);
        return "redirect:/emps";
    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/index.html";
    }

}
