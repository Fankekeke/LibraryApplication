package com.library.library.pojo;

import java.util.Date;

/**
 * 员工表
 */
public class employee {
    //员工id
    private Integer empId;
    //员工姓名
    private String fname;
    //工作编号
    private Integer jobId;
    //入职时间
    private Date hireDate;

    /**
     * 有参构造
     * @param empId
     * @param fname
     * @param jobId
     * @param hireDate
     */
    public employee(Integer empId, String fname, Integer jobId, Date hireDate) {
        this.empId = empId;
        this.fname = fname;
        this.jobId = jobId;
        this.hireDate = hireDate;
    }

    /**
     * 无参构造
     */
    public employee(){}

    @Override
    public String toString() {
        return "employee{" +
                "empId=" + empId +
                ", fname='" + fname + '\'' +
                ", jobId=" + jobId +
                ", hireDate=" + hireDate +
                '}';
    }
}
