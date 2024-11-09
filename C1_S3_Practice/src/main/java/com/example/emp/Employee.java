package com.example.emp;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class Employee {
    private int employeeId;
    private String employeeName;
    private Date employeeDOB;

    @Autowired  // Autowire department using property injection
    private Department department;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, Date employeeDOB, Department department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDOB = employeeDOB;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeDOB() {
        return employeeDOB;
    }

    public void setEmployeeDOB(Date employeeDOB) {
        this.employeeDOB = employeeDOB;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDOB=" + employeeDOB +
                ", department=" + department +
                '}';
    }
}
