package com.seig.mapper;

import com.seig.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Mapper
@Repository
public interface EmployeeMapper {

    /**
     * 查询全部员工
     * @return
     */
    Collection<Employee> getAllEmployees();

    /**
     * 通过Id查询员工
     * @param id
     * @return
     */
    Employee getEmployeeByID(Integer id);

    /**
     * 增加一个员工
     * @param employee
     */
    int addEmployee(Employee employee);

    /**
     * 通过id删除员工
     * @param id
     * @return
     */
    int deleteEmployeeByID(int id);

    /**
     * 修改员工信息
     * @param employee
     * @return
     */
    int updateEmployee(Employee employee);
}
