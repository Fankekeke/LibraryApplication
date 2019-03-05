package com.library.library.service.impl;

import com.library.library.mapper.EmployeeMapper;
import com.library.library.pojo.employee;
import com.library.library.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("employeeServiceImpl")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    @Qualifier("employeeMapper")
    private EmployeeMapper employeeMapper;

    @Override
    public List<employee> selectEmployees() {
        return this.employeeMapper.selectEmployees();
    }

    @Override
    public int insertEmployee(employee employee) {
        return this.employeeMapper.insertEmployee(employee);
    }

    @Override
    public int modifyEmployee(employee employee) {
        return this.employeeMapper.modifyEmployee(employee);
    }

    @Override
    public int deleteEmployee(int empId) {
        return this.employeeMapper.deleteEmployee(empId);
    }

    @Override
    public employee selectEmpById(int empId) {
        return this.employeeMapper.selectEmpById(empId);
    }

    @Override
    public List<employee> selectEmployeeByFenye(Integer pageNo, Integer pageSize, String fname, Integer jobId) {
        return this.employeeMapper.selectEmployeeByFenye(pageNo,pageSize,fname,jobId);
    }

    @Override
    public int selectEmployeeCount() {
        return this.employeeMapper.selectEmployeeCount();
    }
}
