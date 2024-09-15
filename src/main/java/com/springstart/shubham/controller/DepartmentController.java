package com.springstart.shubham.controller;

import com.springstart.shubham.entity.Department;
import com.springstart.shubham.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    //Injected from spring container
    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Saving the Department");
        return departmentService.saveDepartment(department);
    }


    @GetMapping("/getAllDepartments")
    public List<Department> getDepartment(){
        return departmentService.getDepartments();
    }


    @GetMapping("/getDepartmentById/{Id}")
    public Department getDepartmentById(@PathVariable("Id") long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{Id}")
    public  String deleteDepartment(@PathVariable("Id") long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted Successfully";
    }


    @PutMapping("/department/{Id}")
    public Department updateDepartment(@PathVariable("Id") long departmentId,  @RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);
    }

    @GetMapping("/department/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String name){
        return departmentService.fetchDepartmentByName(name);
    }

    @GetMapping("/department/ignoreCase/{name}")
    public Department fetchDepartmentNameIgnoreCase(@PathVariable("name") String name){
        return departmentService.findByDepartmentNameIgnoreCase(name);
    }
}
