package com.springstart.shubham.service;

import com.springstart.shubham.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> getDepartments();

    public Department getDepartmentById(long departmentId);

    public void deleteDepartmentById(long departmentId);

    public Department updateDepartment(long departmentId, Department department);

    public Department fetchDepartmentByName(String name);

    public Department findByDepartmentNameIgnoreCase(String name);

}
