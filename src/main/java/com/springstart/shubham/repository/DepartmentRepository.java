package com.springstart.shubham.repository;

import com.springstart.shubham.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    //https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

    public Department findByDepartmentName(String departmentName);

    public Department findByDepartmentNameIgnoreCase(String departmentName);

    /**
     * We can use @Query to use native SQL query
     */

}

