package com.javatrail.departmentservice.service;


import com.javatrail.departmentservice.model.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}