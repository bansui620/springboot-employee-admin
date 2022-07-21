package com.seig.mapper;

import com.seig.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Mapper
@Repository
public interface DepartmentMapper {

    /**
     * 查询全部部门信息
     * @return
     */
    Collection<Department> departments ();

    /**
     * 通过ID获取部门
     * @param id
     * @return   Department对象
     */
    Department getDepartmentById(Integer id);

}
