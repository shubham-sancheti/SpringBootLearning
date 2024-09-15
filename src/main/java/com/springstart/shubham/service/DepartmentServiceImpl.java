package com.springstart.shubham.service;

import com.springstart.shubham.entity.Department;
import com.springstart.shubham.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(long departmentId, Department department) {
        Department returnDepartment = departmentRepository.findById(departmentId).get();
        returnDepartment.setDepartmentAddress(department.getDepartmentAddress());
        returnDepartment.setDepartmentName(department.getDepartmentName());
        returnDepartment.setDepartmentCode(department.getDepartmentCode());
        return returnDepartment;
    }

    @Override
    public Department fetchDepartmentByName(String name) {
        return departmentRepository.findByDepartmentName(name);
    }

    @Override
    public Department findByDepartmentNameIgnoreCase(String name) {
        return departmentRepository.findByDepartmentNameIgnoreCase(name);
    }
}
