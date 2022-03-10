package com.aamir.controller;

import com.aamir.entity.Department;
import com.aamir.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside the Department Controller: saveDepartment method called !!");
    return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Optional<Department> findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("inside the Department Controller: findDepartmentById method called !!");
        return departmentService.findDepartmentById(departmentId);
    }
}
