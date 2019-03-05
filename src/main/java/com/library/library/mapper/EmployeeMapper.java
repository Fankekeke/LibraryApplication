package com.library.library.mapper;

import com.library.library.pojo.employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper {
    /**
     * 查询员工信息
     * @return
     */
    List<employee> selectEmployees();

    /**
     * 添加员工信息
     * @param employee
     * @return
     */
    int insertEmployee(employee employee);

    /**
     * 修改员工信息
     * @param employee
     * @return
     */
    int modifyEmployee(employee employee);

    /**
     * 删除员工
     * @param empId
     * @return
     */
    int deleteEmployee(@Param("empId") int empId);

    /**
     * 根据id查询员工信息
     * @param empId
     * @return
     */
    employee selectEmpById(@Param("empId") int empId);

    /**
     * 模糊查询分页
     * @param pageNo
     * @param pageSize
     * @param fname
     * @param jobId
     * @return
     */
    List<employee> selectEmployeeByFenye(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize,@Param("fname") String fname,@Param("jobId") Integer jobId);

    /**
     * 查询总数量
     * @return
     */
    int selectEmployeeCount();
}
