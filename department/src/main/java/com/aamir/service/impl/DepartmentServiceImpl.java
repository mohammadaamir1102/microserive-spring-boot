package com.aamir.service.impl;

import com.aamir.entity.Department;
import com.aamir.repo.DepartmentRepository;
import com.aamir.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        log.info("inside DepartmentServiceImpl : saveDepartment method called !!");
        return departmentRepository.save(department);
    }

    @Override
    public Optional<Department> findDepartmentById(Long departmentId) {
        log.info("inside DepartmentServiceImpl : findByDepartmentId method called !!");
        return departmentRepository.findById(departmentId);

    }
}
