package com.cgh.first.dao;

import com.cgh.first.entities.Department;
import com.cgh.first.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employeeMap = null;

//    @Autowired
//    private DepartmentDao departmentDao;

    static{
        employeeMap = new HashMap<Integer, Employee>();
        employeeMap.put(1001, new Employee(1001, "E-AA", "aa@163.com", 1, new Department(101, "D-AA")));
        employeeMap.put(1002, new Employee(1002, "E-BB", "bb@163.com", 1, new Department(102, "D-BB")));
        employeeMap.put(1003, new Employee(1003, "E-CC", "cc@163.com", 0, new Department(103, "D-CC")));
        employeeMap.put(1004, new Employee(1004, "E-DD", "dd@163.com", 0, new Department(104, "D-DD")));
        employeeMap.put(1005, new Employee(1005, "E-EE", "ee@163.com", 1, new Department(105, "D-EE")));
    }

    public Collection getAll(){
        return employeeMap.values();
    }
}
