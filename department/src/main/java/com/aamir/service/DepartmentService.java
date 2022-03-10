package com.aamir.service;

import com.aamir.entity.Department;

import java.util.Optional;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Optional<Department> findDepartmentById(Long departmentId);
}
